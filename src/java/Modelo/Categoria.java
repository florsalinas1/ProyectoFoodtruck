
package Modelo;


public class Categoria {
    private int cat_id;
    private String cat_nombre;
    private String cat_estado;

    public Categoria() {
    }

    public Categoria(int cat_id, String cat_nombre, String cat_estado) {
        this.cat_id = cat_id;
        this.cat_nombre = cat_nombre;
        this.cat_estado = cat_estado;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_nombre() {
        return cat_nombre;
    }

    public void setCat_nombre(String cat_nombre) {
        this.cat_nombre = cat_nombre;
    }

    public String getCat_estado() {
        return cat_estado;
    }

    public void setCat_estado(String cat_estado) {
        this.cat_estado = cat_estado;
    }
    
    
    
}
