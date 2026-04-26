package unam.fesa.ico;

public class mochila {
    private String color;
    private float costo;
    private String tamaño;
    private int numeroCierres;

    public mochila() {
    }

    public mochila(String color, float costo, String tamaño, int numeroCierres) {
        this.color = color;
        this.costo = costo;
        this.tamaño = tamaño;
        this.numeroCierres = numeroCierres;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {

        if (costo>=200.0f && costo<=800.0f){
            this.costo = costo;
        }else{
            System.out.println("El costo debe ser entre 200 a 800 pesos..");
        }
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getNumeroCierres() {
        return numeroCierres;
    }

    public void setNumeroCierres(int numeroCierres) {
       if(numeroCierres>=2 && numeroCierres<=7){
           this.numeroCierres = numeroCierres;
       }else{
           System.out.println("Debe que tener entre 2 a 7 cierres..");
       }
    }

    @Override
    public String toString() {
        return "mochila{" +
                "color='" + color + '\'' +
                ", costo=" + costo +
                ", tamaño='" + tamaño + '\'' +
                ", numeroCierres=" + numeroCierres +
                '}';
    }
    public Boolean abrirMochila(){
        System.out.println("Abriendo mochila..");
        return true;
    }
    public Boolean cerrarMochila(){
        System.out.println("Cerrando mochila..");
        return false;
    }
    public void guardar(){
        System.out.println("Guardando cosas en la mochila..");
    }
    public void mover(){
        System.out.println("Moviendo la mochila..");
    }

}
