package unam.fesa.ico;

public class productoDescuento {
private String nombre;
    private float precio;
    private float descuento;

    public productoDescuento() {
    }

    public productoDescuento(float descuento, String nombre, float precio) {
        this.descuento = descuento;
        this.nombre = nombre;
        this.precio = precio;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
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
        return "productoDescuento{" +
                "descuento=" + descuento +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public float calcularPrecioFinal(){
        return (this.precio-(this.precio*this.descuento));
    }
}
