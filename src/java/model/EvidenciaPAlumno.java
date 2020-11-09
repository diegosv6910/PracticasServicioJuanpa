    /************************************************************
    * Datos de la tabla evidencias practicas alumno
    ************************************************************/
package model;

public class EvidenciaPAlumno {
    //Atributos de la clase
    private int ID_EvidenciaPA, FolioP;
    private String Documento, FechaExpedicion;
    
    //constructor
    public EvidenciaPAlumno (){}
    
    //metodos setters y getters
    public void setID_EvidenciaPA(int a)
    {
        this.ID_EvidenciaPA = a;
    }
    public int getID_EvidenciaPA()
    {
        return this.ID_EvidenciaPA;
    }
    public void setFolioP(int a)
    {
        this.FolioP = a;
    }
    public int getFolioP()
    {
        return this.FolioP;
    }
    public void setDocumento(String a)
    {
        this.Documento = a;
    }
    public String getDocumento()
    {
        return this.Documento;
    }
    public void setFechaExpedicion(String a)
    {
        this.FechaExpedicion = a;
    }
    public String getFechaExpedicion()
    {
        return this.FechaExpedicion;
    }
}
