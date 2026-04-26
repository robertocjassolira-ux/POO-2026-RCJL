package unam.fesa.ico;

public class productoImpuesto {
private String nombre;
private float precio;
private float impuesto;

    public productoImpuesto() {
    }

    public productoImpuesto(float impuesto, String nombre, float precio) {
        this.impuesto = impuesto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "productoImpuesto{" +
                "impuesto=" + impuesto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public float calcularPrecioFinal(){
        return (this.precio+(this.precio*this.impuesto));
    }
}
