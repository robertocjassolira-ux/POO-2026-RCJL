package unam.fesa.ico;

public class bibliotecario extends persona {

    private int numeroEmpleado;

    public bibliotecario() {
    }

    public bibliotecario(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public bibliotecario(int edad, String nombre, int numeroEmpleado) {
        super(edad, nombre);
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    @Override
    public String toString() {
        return "bibliotecario{" +
                "numeroEmpleado=" + numeroEmpleado +
                "} " + super.toString();
    }
    public void registrarPrestamo(){
        System.out.println("registrando prestamo  de un librooo...");
    }
}

