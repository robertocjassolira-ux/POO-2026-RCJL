package unam.fesa.ico;

public class cuadrado implements figura,dibujable {
    private double lado;

    public cuadrado() {
    }

    public cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "cuadrado{" +
                "lado=" + lado +
                '}';
    }


    @Override
    public void dibujar() {
        System.out.println(" dibujando el cuadrado más feo del mundo");
    }


    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        System.out.println("area del cuadrado: " + resultado);
        return resultado;

    }
}
