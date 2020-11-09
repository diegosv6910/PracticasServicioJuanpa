    /************************************************************
    * Datos de la tabla practicas
    ************************************************************/
package model;

public class Practicas {
    //Atributos de la clase
    private int FolioP, Matricula, ID_Institucion, Horas_Carrera;
    private String Turno;
    private boolean FinishP;
    
    //constructor
    public Practicas (){}
    
    //Metodos Setters y Getters
    public void setFolioP(int a)
    {
        this.FolioP = a;
    }
    public int getFolioP()
    {
        return this.FolioP;
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
    public void setTurno(String a)
    {
        this.Turno = a;
    }
    public String getTurno()
    {
        return this.Turno;
    }
    public void setFinishP(boolean a)
    {
        this.FinishP = a;
    }
    public boolean getFinishP()
    {
        return this.FinishP;
    }
}
