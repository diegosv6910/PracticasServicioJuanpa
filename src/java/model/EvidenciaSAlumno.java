    /************************************************************
    * Datos de la tabla evidencias servicio alumno
    ************************************************************/
package model;

public class EvidenciaSAlumno {
    //Atributos de la clase
    private int ID_EvidenciaSA, FolioS;
    private String Documento, FechaExpedicion;
    
    //constructor
    public EvidenciaSAlumno (){}
    
    //metodos setters y getters
    public void setID_EvidenciaSA(int a)
    {
        this.ID_EvidenciaSA = a;
    }
    public int getID_EvidenciaSA()
    {
        return this.ID_EvidenciaSA;
    }
    public void setFolioS(int a)
    {
        this.FolioS = a;
    }
    public int getFolioS()
    {
        return this.FolioS;
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
