
package dominio;


public abstract class SerVivo {
    private String nombreSV;
    
    public abstract void alimentarse();

    public String getNombreSV() {
        return nombreSV;
    }

    public void setNombreSV(String nombreSV) {
        this.nombreSV = nombreSV;
    }
     
}
