package unam.fesa.ico;

public class Semaforo{

    private float altura;
    private float ancho;
    private String material;
    private String  color;
    private int segundo;

    public Semaforo() {
    }

    public Semaforo(float altura, float ancho, String color, String material, int segundo) {
        this.altura = altura;
        this.ancho = ancho;
        this.color = color;
        this.material = material;
        this.segundo = segundo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
       if(segundo>= 0 && segundo<= 9) {
           this.segundo = segundo;
       }else{
           System.out.println("El tiempo debe que estart entre 0 a 9 segundos");
       }
    }

    @Override
    public String toString() {
        return "Semaforo{" +
                "altura=" + altura +
                ", ancho=" + ancho +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", segundo=" + segundo +
                '}';
    }
    public void avanzarSegundo(int segundo){
        this.segundo= segundo;
        if( segundo >= 0 && segundo <=4){
            color = "    Verde, avance...";
        }else if(segundo >= 5 && segundo <=6){
            color = "     Amarillo, tome precauciones...";
        }else  if(segundo >= 7 && segundo <=9){
            color ="    Rojo, detengasé...";
        }
        else{
            color = "    Rojo, detengase...";// si el segundo esta fuera de rango que se mantenga en rojo
        }
    }
 public void mostrarEstado(){
     System.out.println("Segundo:"+ segundo +"  el semaforo esta en"+ color);
 }

}

