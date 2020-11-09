    /************************************************************
    * Datos de la institucion para practicas y servicio
    ************************************************************/
package model;

public class Institucion {
    //Atributos de la clase
    private int ID_Institucion, Monto, Vacantes;
    private static String Nombre_Institucion, Nombre_Proyecto, Nombre_Encargado, Cargo_Encargado, Telefono_Encargado,
            Email_Encargado, Horario;
    private boolean Practicas_Servicio, Apoyo_Economico;
    
    //Constructor
    public Institucion (){}
    
    //Metodos adicionales
    public Institucion (int ID_Institucion, String Nombre_Institucion, String Nombre_Proyecto, String Nombre_Encargado, String Cargo_Encargado, String Telefono_Encargado, String Email_Encargado, boolean Practicas_Servicio, boolean Apoyo_Economico, int Monto, int Vacantes, String Horario){
    this.ID_Institucion = ID_Institucion;
    this.Nombre_Institucion = Nombre_Institucion;
    this.Nombre_Proyecto = Nombre_Proyecto;
    this.Nombre_Encargado = Nombre_Encargado;
    this.Cargo_Encargado = Cargo_Encargado;
    this.Telefono_Encargado = Telefono_Encargado;
    this.Email_Encargado = Email_Encargado;
    this.Practicas_Servicio = Practicas_Servicio;
    this.Apoyo_Economico = Apoyo_Economico;
    this.Monto = Monto;
    this.Vacantes = Vacantes;
    this.Horario = Horario;
    }
    
    //Metodos Setters y Getters
    public void setID_Institucion(int a)
    {
        this.ID_Institucion = a;
    }
    public int getID_Institucion()
    {
        return this.ID_Institucion;
    }
    public void setMonto(int a)
    {
        this.Monto = a;
    }
    
    public int getMonto(){
        return this.Monto;
    }
    public void setVacantes(int a)
    {
        this.Vacantes = a;
    }
    public int getVacantes()
    {
        return this.Vacantes;
    }
    public void setNombre_Institucion(String a)
    {
        this.Nombre_Institucion = a;
    }
    public String getNombre_Institucion()
    {
        return this.Nombre_Institucion;
    }
    public void setNombre_Proyecto(String a)
    {
        this.Nombre_Proyecto = a;
    }
    public String getNombre_Proyecto()
    {
        return this.Nombre_Proyecto;
    }
    public void setNombre_Encargado(String a)
    {
        this.Nombre_Encargado = a;
    }
    public String getNombre_Encargado()
    {
        return this.Nombre_Encargado;
    }
    public void setCargo_Encargado(String a)
    {
        this.Cargo_Encargado = a;
    }
    public String getCargo_Encargado()
    {
        return this.Cargo_Encargado;
    }
    public void setTelefono_Encargado(String a)
    {
        this.Telefono_Encargado = a;
    }
    public String getTelefono_Encargado()
    {
        return this.Telefono_Encargado;
    }
    public void setEmail_Encargado(String a)
    {
        this.Email_Encargado = a;
    }
    public String getEmail_Encargado()
    {
        return this.Email_Encargado;
    }
    public void setHorario(String a)
    {
        this.Horario = a;
    }
    public String getHorario()
    {
        return this.Horario;
    }
    public void setPracticas_Servicio(boolean a)
    {
        this.Practicas_Servicio = a;
    }
    public boolean getPracticas_Servicio()
    {
        return this.Practicas_Servicio;
    }
    public void setApoyo_Economico(boolean a)
    {
        this.Apoyo_Economico = a;
    }
    public boolean getApoyo_Economico()
    {
        return this.Apoyo_Economico;
    }
}
