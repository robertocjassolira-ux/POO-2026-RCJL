package unam.fesa.ico;

public class persona {
    protected String nombre;
    protected int edad;
protected String genero;

    public persona() {
    }

    public persona(int edad, String genero, String nombre) {
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
    public void dormir(){
        System.out.println(this.nombre +"  esta durmiendo..");
    }
    public void comiendo(){
        System.out.println(this.nombre +"  esta comiendo..");
    }
    public void hablar(){
        System.out.println(this.nombre +"  esta hablando..");
    }

}
