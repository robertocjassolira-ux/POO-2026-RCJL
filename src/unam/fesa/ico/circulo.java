package unam.fesa.ico;

public class circulo implements figura,dibujable,rotable {
    private double radio;

    public circulo() {
    }

    public circulo(double lado) {
        this.radio = lado;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "circulo{" +
                "lado=" + radio +
                '}';
    }

    @Override
    public double calcularArea() {
        double pi= 3.14;
        double area = pi*radio*radio;
        System.out.println("Area: "+area);
        return area;

    }

    @Override
    public void dibujar() {
        System.out.println("dibujando el circulo wiiiii ");
    }

    @Override
    public void rotar() {
        System.out.println("rotando el circulo");
    }
}
