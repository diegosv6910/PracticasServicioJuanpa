    /************************************************************
    * Permisos para practicas y servicio
    ************************************************************/
package model;

public class PermisosPyS {
    /************************************************************
    * Atributos de la clase
    ************************************************************/
    //almacena los tipos de permisos segun el Rol del usuario
    private boolean PyS_select, PyS_update, PyS_insert, PyS_delete;
    //identifica si el usuario es el Admin/soporte o un Usuario/Alumno
    private boolean isAdmin, isUser;
    
     /************************************************************
    * Construtores
    ************************************************************/
    public PermisosPyS(){}
    
    /************************************************************
    * Métodos
    ************************************************************/
    public void setAdmin(boolean a)
    {
        this.isAdmin = a;
    }
    public boolean getAdmin()
    {
        return this.isAdmin;
    }
     public void setUser(boolean a)
    {
        this.isUser = a;
    }
    public boolean getUser()
    {
        return this.isUser;
    }
    public void setPySInsert(boolean a)
    {
        this.PyS_insert = a;
    }
    public boolean getPySInsert()
    {
        return this.PyS_insert;
    }        
    public void setPySUpdate(boolean a)
    {
        this.PyS_update = a;
    }
    public boolean getPySUpdate()
    {
        return this.PyS_update;
    }        
    public void setPySSelect(boolean a)
    {
        this.PyS_select = a;
    }
    public boolean getPySSelect()
    {
        return this.PyS_select;
    }       
    public void setPySDelete(boolean a)
    {
        this.PyS_delete = a;
    }
    public boolean getPySDelete()
    {
        return this.PyS_delete;
    }    
}
