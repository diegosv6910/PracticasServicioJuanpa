    /************************************************************
    * Datos de la tabla servicio
    ************************************************************/
package model;

public class Servicio {
    //Atributos de la clase
    private int FolioS, Matricula, ID_Institucion, Horas_Carrera, Modalidad;
    private String Turno;
    private boolean FinishS;
    
    //constructor
    public Servicio (){}
    
    //Metodos Setters y Getters
    public void setFolioS(int a)
    {
        this.FolioS = a;
    }
    public int getFolioS()
    {
        return this.FolioS;
    }
    public void setMatricula(int a)
    {
        this.Matricula = a;
    }
    public int getMatricula()
    {
        return this.Matricula;
    }
    public void setID_Institucion(int a)
    {
        this.ID_Institucion = a;
    }
    public int getID_Institucion()
    {
        return this.ID_Institucion;
    }
    public void setHoras_Carrera(int a)
    {
        this.Horas_Carrera = a;
    }
    public int getHoras_Carrera()
    {
        return this.Horas_Carrera;
    }
    public void setModalidad(int a)
    {
        this.Modalidad = a;
    }
    public int getModalidad()
    {
        return this.Modalidad;
    }
    public void setTurno(String a)
    {
        this.Turno = a;
    }
    public String getTurno()
    {
        return this.Turno;
    }
    public void setFinishS(boolean a)
    {
        this.FinishS = a;
    }
    public boolean getFinishS()
    {
        return this.FinishS;
    }
}
