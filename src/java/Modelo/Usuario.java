

package Modelo;



public class Usuario {
    private int usu_id;
    private String usu_nombre;
    private String usu_apellidos;
    private String usu_email;
    private String usu_telefono;
    private String usu_password;
    private String usu_fecharegistro;
    private String usu_tipo;
    private String usu_estado;

    public Usuario() {
    }

    public Usuario(int usu_id, String usu_nombre, String usu_apellidos, String usu_email, String usu_telefono, String usu_password, String usu_fecharegistro, String usu_tipo, String usu_estado) {
        this.usu_id = usu_id;
        this.usu_nombre = usu_nombre;
        this.usu_apellidos = usu_apellidos;
        this.usu_email = usu_email;
        this.usu_telefono = usu_telefono;
        this.usu_password = usu_password;
        this.usu_fecharegistro = usu_fecharegistro;
        this.usu_tipo = usu_tipo;
        this.usu_estado = usu_estado;
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public String getUsu_nombre() {
        return usu_nombre;
    }

    public void setUsu_nombre(String usu_nombre) {
        this.usu_nombre = usu_nombre;
    }

    public String getUsu_apellidos() {
        return usu_apellidos;
    }

    public void setUsu_apellidos(String usu_apellidos) {
        this.usu_apellidos = usu_apellidos;
    }

    public String getUsu_email() {
        return usu_email;
    }

    public void setUsu_email(String usu_email) {
        this.usu_email = usu_email;
    }

    public String getUsu_telefono() {
        return usu_telefono;
    }

    public void setUsu_telefono(String usu_telefono) {
        this.usu_telefono = usu_telefono;
    }

    public String getUsu_password() {
        return usu_password;
    }

    public void setUsu_password(String usu_password) {
        this.usu_password = usu_password;
    }

    public String getUsu_fecharegistro() {
        return usu_fecharegistro;
    }

    public void setUsu_fecharegistro(String usu_fecharegistro) {
        this.usu_fecharegistro = usu_fecharegistro;
    }

    public String getUsu_tipo() {
        return usu_tipo;
    }

    public void setUsu_tipo(String usu_tipo) {
        this.usu_tipo = usu_tipo;
    }

    public String getUsu_estado() {
        return usu_estado;
    }

    public void setUsu_estado(String usu_estado) {
        this.usu_estado = usu_estado;
    }
    
    
    
}
