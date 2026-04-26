package unam.fesa.ico;

public class alumno extends persona {
private String carrera;
private int numeroDeCuenta;

    public alumno() {
    }

    public alumno(int edad, String genero, String nombre, String carrera, int numeroDeCuenta) {
        super(edad, genero, nombre);
        this.carrera = carrera;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    @Override
    public String toString() {
        return "alumno{" +
                "carrera='" + carrera + '\'' +
                ", numeroDeCuenta=" + numeroDeCuenta +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public void estudiar(){
        System.out.println(this.nombre+" esta estudiando...");
    }
    public void hacerTarea() {
        System.out.println(this.nombre + " esta haciedno tarea...");
    }
public void comiendo(){
            System.out.println(this.nombre+" esta con unos tacos de tripa aca bien sabrosos...");
        }
    }

