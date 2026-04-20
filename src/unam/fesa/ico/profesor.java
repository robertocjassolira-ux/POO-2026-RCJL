package unam.fesa.ico;

public class profesor extends  persona{
    private String materia;

    public profesor() {
    }

    public profesor(String materia) {
        this.materia = materia;
    }

    public profesor(int edad, String nombre, String materia) {
        super(edad, nombre);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        return "profesor{" +
                "materia='" + materia + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public void setMateria(String materia) {
        this.materia = materia;

    }
    public void impartirClase(){
        System.out.println(" el profesor "+nombre+" esta impartiendo "+materia);
    }
}






