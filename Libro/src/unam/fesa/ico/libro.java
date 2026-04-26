package unam.fesa.ico;

public class libro {
    private String tituloDelLibro;
    private String autorDelLibro;
    private int anhoDePublicacion;
    private int cantidadDeEjemplares;

    public libro() {
    }

    public libro(String tituloDelLibro, String autorDelLibro, int anhoDePublicacion, int cantidadDeEjemplares) {
        this.tituloDelLibro = tituloDelLibro;
        this.autorDelLibro = autorDelLibro;
        this.anhoDePublicacion = anhoDePublicacion;
        this.cantidadDeEjemplares = cantidadDeEjemplares;
    }

    public String getTituloDelLibro() {
        return tituloDelLibro;
    }

    public void setTituloDelLibro(String tituloDelLibro) {
        this.tituloDelLibro = tituloDelLibro;
    }

    public String getAutorDelLibro() {
        return autorDelLibro;
    }

    public void setAutorDelLibro(String autorDelLibro) {
        this.autorDelLibro = autorDelLibro;
    }

    public int getAnhoDePublicacion() {
        return anhoDePublicacion;
    }

    public void setAnhoDePublicacion(int anhoDePublicacion) {

       if(anhoDePublicacion>= 1950 && anhoDePublicacion<=2026){
           this.anhoDePublicacion = anhoDePublicacion;
       }else {
           System.out.println("Solo aceptamos libros que hayan sido publicados entre 1950 y 2026");
       }
    }

    public int getCantidadDeEjemplares() {
        return cantidadDeEjemplares;
    }

    public void setCantidadDeEjemplares(int cantidadDeEjemplares) {
       if(cantidadDeEjemplares>=1 && cantidadDeEjemplares<= 20){
           this.cantidadDeEjemplares = cantidadDeEjemplares;
       }else{
           System.out.println("No puede haber más de 20 ejemplares  de un solo libro");
       }
    }

    @Override
    public String  toString() {
        return "libro{" +
                "tituloDelLibro='" + tituloDelLibro + '\'' +
                ", autorDelLibro='" + autorDelLibro + '\'' +
                ", anhoDePublicacion=" + anhoDePublicacion +
                ", cantidadDeEjemplares=" + cantidadDeEjemplares +
                '}';
    }

    public Boolean prestarLibro(){
        System.out.println("Prestando libro...");
        return true;
}
public Boolean regresarLibro(){
        System.out.println("Regresando libro...");
        return false;
}
public void verSeccionDelLibro(){
    System.out.println("Verificando libro...");
}


}
