package unam.fesa.ico;

public class automovil extends vehiculo{
    private int numeroPuertas;

    public automovil() {
    }

    public automovil(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public automovil(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "automovil{" +
                "numeroPuertas=" + numeroPuertas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                "} " + super.toString();
    }
    public boolean encenderMotor(){
        System.out.println("El auto "+ marca + "modelo: "+ modelo + " ha sido encendido");
        return true;
    }
}
