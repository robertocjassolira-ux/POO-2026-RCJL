package unam.fesa.ico;

public class aspiradora {
    private String marca;
    private float precio;
    private  String forma;
    private  float capacidad;
    private float bateria;

    public aspiradora() {
    }

    public aspiradora(float bateria, float capacidad, String forma, String marca, float precio) {
        this.bateria = bateria;
        this.capacidad = capacidad;
        this.forma = forma;
        this.marca = marca;
        this.precio = precio;
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        if (bateria>=0f && bateria<=100f){
            this.bateria = bateria;
        }else {
            System.out.println("Error: bateria no valida");
        }
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
       if(capacidad>=0.1f && bateria<=1.0f) {
           this.capacidad = capacidad;
       }else {
           System.out.println("La capacidad máxima es de un litro");
       }
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
       if (precio>= 200f && precio<= 600f){
           this.precio = precio;
       }else {
           System.out.println("El precio debe estar entre los 200 y 300 pesos");
       }
    }

    @Override
    public String toString() {
        return "aspiradora{" +
                "bateria=" + bateria +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", forma='" + forma + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    public Boolean aspirar(){
       System.out.println("aspirando ...");
       return true;
    }
    public Boolean encender(){
        System.out.println("encendiendo aspiradora...");
        return true;
    }
    public Boolean apagar(){
        System.out.println("apagando aspiradora...");
        return true;
    }
    public Boolean soportarBasura(float c){
        System.out.println("Soportaste"+ c + "  mililitros de basura");
        return Boolean.TRUE;
    }

}
