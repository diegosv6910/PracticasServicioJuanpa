package DAO;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Institucion;
import util.DataBase;
        
public class InstitucionDAO {
    /************************************************************
    * Atributos de la clase
    ************************************************************/
    private Connection con=null;//variable para la conexion a la BD
    /************************************************************
    * Metodos constructores
    *************************************************************/
    public InstitucionDAO()
    {
        con = DataBase.getConnection();//crear una conexión al crear un objeto AdminDAO
    }
    //Metodos/funciones de la clase
    /************************************************************
    * Metodo que para dar de alta una institucion
    * para practicas y servicio
    ************************************************************/
    public String AltaInstitucion()
    {
        String respuesta = "";
        try{
            Institucion I = new Institucion();
            PreparedStatement pstm = null; 
            ResultSet rs = null;
            String sql = "Insert into instituciones (Nombre_Institucion) values (?)";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, I.getNombre_Institucion());
            int filas = pstm.executeUpdate();
            respuesta = "Se registraron" + filas + "nuevo elemento";
            con.close();
        } catch (SQLException e) {          
        }
        return respuesta;
    }
    
    public List<Institucion> consultar(){
        List<Institucion> datos = new ArrayList<>();
        PreparedStatement pstm = null; 
        ResultSet rs = null;
        String sql = "select * from Institucion";
        try{
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                datos.add(new Institucion(rs.getInt("ID_Institucion"), rs.getString("Nombre_Institucion"), rs.getString("Nombre_Proyecto"), rs.getString("Nombre_Encargado"), rs.getString("Cargo_Encargado"), rs.getString("Telefono_Encargado"), rs.getString("Email_Encargado"), rs.getBoolean("Practicas_Servicio"), rs.getBoolean("Apoyo_Economico"), rs.getInt("Monto"), rs.getInt("Vacantes"), rs.getString("Horario")));
            }
            con.close();
        } catch (SQLException e) {
            
        }
        return datos;
    }
}
