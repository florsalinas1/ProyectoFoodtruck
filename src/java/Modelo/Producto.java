

package Modelo;



public class Producto {
    private int prod_id;
    private String prod_nombre;
    private int prod_precio;
    private double prod_cantidad;
    private String prod_categoria;

    public Producto() {
    }

    public Producto(int prod_id, String prod_nombre, int prod_precio, double prod_cantidad, String prod_categoria) {
        this.prod_id = prod_id;
        this.prod_nombre = prod_nombre;
        this.prod_precio = prod_precio;
        this.prod_cantidad = prod_cantidad;
        this.prod_categoria = prod_categoria;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_nombre() {
        return prod_nombre;
    }

    public void setProd_nombre(String prod_nombre) {
        this.prod_nombre = prod_nombre;
    }

    public int getProd_precio() {
        return prod_precio;
    }

    public void setProd_precio(int prod_precio) {
        this.prod_precio = prod_precio;
    }

    public double getProd_cantidad() {
        return prod_cantidad;
    }

    public void setProd_cantidad(double prod_cantidad) {
        this.prod_cantidad = prod_cantidad;
    }

    public String getProd_categoria() {
        return prod_categoria;
    }

    public void setProd_categoria(String prod_categoria) {
        this.prod_categoria = prod_categoria;
    }
    
    
    
    
}
