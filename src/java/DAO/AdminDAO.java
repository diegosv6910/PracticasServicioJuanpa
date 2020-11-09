package DAO;

import model.Persona;
import model.PermisosPyS;
import util.DataBase;//agregar Clase para la conexion

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class AdminDAO {
    /************************************************************
    * Atributos de la clase
    ************************************************************/
    private Connection con=null;//variable para la conexion a la BD
    /************************************************************
    * Metodos constructores
    *************************************************************/
    public AdminDAO()
    {
        con = DataBase.getConnection();//crear una conexión al crear un objeto AdminDAO
    }
    
    //Metodos/funciones de la clase
    /************************************************************
    * Metodo que devuelve false o true si el
    * usuario existe en la BD
    ************************************************************/
    public boolean login(String Usuario, String Password)
    {
        try
        {
           PreparedStatement pstm = null; 
           ResultSet rs = null;
           String query = "SELECT ID_User FROM Usuario WHERE username = ? AND password = ? AND status = ?";
           pstm = con.prepareStatement(query);
           pstm.setString(1, Usuario);//convertir a String el parametro Usuario
           pstm.setString(2, Password);//convertir a String el parametro Password
           pstm.setBoolean(3, true);//convertir a boolean 
           rs = pstm.executeQuery();//ejecutar el query 
           if(rs.next())
           {
               return true;
           }else{
               return false;
           }
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    
    /************************************************************
     * Metodo que devuelve los permisos
     * segun el tipo de usuario
    ************************************************************/
    public PermisosPyS obtenerPermisos(String user)
    {
        try
        {
           PreparedStatement pstm = null; 
           ResultSet rs = null;
           String query = "SELECT * FROM permisos WHERE ID_permiso IN (SELECT ID_permisos FROM Roles as r INNER JOIN Usuario as u ON r.ID_Rol = u.ID_Rol WHERE u.username = ?);";
           pstm = con.prepareStatement(query);
           pstm.setString(1, user);
           rs = pstm.executeQuery();
           if(rs.next())
           {
               PermisosPyS p = new PermisosPyS();
               p.setPySSelect(rs.getBoolean("PyS_select"));
               p.setPySUpdate(rs.getBoolean("PyS_update"));
               p.setPySInsert(rs.getBoolean("PyS_insert"));
               p.setPySDelete(rs.getBoolean("PyS_delete"));
               p.setAdmin(rs.getBoolean("isAdmin"));
               p.setUser(rs.getBoolean("isUser"));
               
               return p; //regresar el objeto con los permisos almacenados
           }else{
               return null;
           }
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    /************************************************************
    * Metodo que devuelve la url del Rol
    ************************************************************/
    public String getURLMenu(String usuario) 
    {
        String url = "";
        try 
        {
            PreparedStatement pstm = null; 
            ResultSet rs = null;
            String query = "SELECT url FROM Roles as r INNER JOIN Usuario as u ON u.ID_Rol = r.ID_Rol WHERE u.username = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, usuario);
            rs = pstm.executeQuery();
            if(rs.next())
            {                
                url = rs.getString("url");
            }
        }catch(Exception ex){
                ex.printStackTrace();                
        }            
    return url;
    }
    /************************************************************
    * obtiene el ID_User de un usuario dado su id usuario
    ************************************************************/
    public int getusuarioPorNombre(String nombre) 
    {
        int usuario = 0;
        try 
        {
            PreparedStatement pstm = null; 
            ResultSet rs = null;
            String query = "SELECT ID_User FROM Usuario WHERE username = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, nombre);
            rs = pstm.executeQuery();
            if(rs.next())
            {                
                usuario = rs.getInt("ID_User");
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();                
        }            
        return usuario;
    }
    /************************************************************
    * obtiene el rol de un usuario dado su id usuario
    ************************************************************/
    public int getRolByUsuario(int id_usuario) 
    {
        int id_rol = 0;
        try 
        {
            PreparedStatement pstm = null; 
            ResultSet rs = null;
            String query = "SELECT ID_Rol FROM Usuario WHERE ID_User = ?";
            pstm = con.prepareStatement(query);
            pstm.setInt(1, id_usuario);
            rs = pstm.executeQuery();
            if(rs.next())
            {                
                id_rol = rs.getInt("ID_Rol");
            }
            }catch(Exception ex){
                ex.printStackTrace();                
            }            
            return id_rol;
    }
    
    /************************************************************
    * Almacena el id_user y la fecha de ingreso en la bitacora_registro
    ************************************************************/
    public boolean registroEnBitacora(int id_usuario, int id_rol)
    {
        try
        {
            PreparedStatement pstm = null; 
            ResultSet rs = null;
            String query = "INSERT INTO bitacora_ingresos(id_user, id_rol, fecha_reg) VALUES (?,?,now())";
            pstm = con.prepareStatement(query);
            pstm.setInt(1, id_usuario);
            pstm.setInt(2, id_rol);
            if (pstm.executeUpdate() == 1)
            {
                return true;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
        return false;
    }
    
    /************************************************************
    * Metodo para obtener informacion de la persona del usuario
    ************************************************************/
    public Persona getPersona(String nombre)
    {
        Persona p = new Persona();
        //Considerar almacenar todos los registros en un arrayList o
        //en un JsonArray y JsonObject
        try 
        {            
            PreparedStatement pstm = null; 
            ResultSet rs = null;
            String query = "SELECT * FROM Persona WHERE ID_User IN (SELECT ID_User FROM Usuario WHERE username = ?)";
            pstm = con.prepareStatement(query);
            pstm.setString(1, nombre);
            rs = pstm.executeQuery();
            while(rs.next())
            {
                p.setIdPersona(rs.getInt("ID_Persona"));
                p.setIdUser(rs.getInt("ID_User"));
                p.setNombre(rs.getString("Nombre"));
                p.setApellidoP(rs.getString("apellidoPaterno"));
                p.setApellidoM(rs.getString("apellidoMaterno"));                
            }
        }catch(SQLException ex){
            ex.printStackTrace();           
        }
        return p;
    }
}
