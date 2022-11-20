
package Modelo;

import Config.Conexion;
import java.sql.*;
import java.util.ArrayList;

import java.util.List;



public class UsuarioDAO {
    Conexion cn = new Conexion();
    Connection con ;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    public Usuario validar(String usu_nombre, String usu_password){
        Usuario usu = new Usuario();
        String sql = "select * from usuario where usu_nombre=? and usu_password=?";
        
        try{
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, usu_nombre);
            ps.setString(2, usu_password);
            rs=ps.executeQuery();
            while(rs.next()){
               usu.setUsu_nombre(rs.getString("usu_nombre"));
               usu.setUsu_apellidos(rs.getString("usu_apellidos"));
               usu.setUsu_email(rs.getString("usu_email"));
               usu.setUsu_telefono(rs.getString("usu_telefono"));
               usu.setUsu_tipo(rs.getString("tipousu_id"));
            }
        }catch(Exception e){
        }
        return usu;
    }
    
    //Crearemos las operaciones CRUD
    
    public List listar(){
        String sql="select * from usuario";
        List<Usuario>lista = new ArrayList<>();
        try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Usuario usu=new Usuario();
                usu.setUsu_id(rs.getInt(1));
                usu.setUsu_nombre(rs.getString(2));
                usu.setUsu_apellidos(rs.getString(3));
                usu.setUsu_email(rs.getString(4));
                usu.setUsu_telefono(rs.getString(5));
                usu.setUsu_password(rs.getString(6));
                usu.setUsu_fecharegistro(rs.getString(7));
                usu.setUsu_tipo(rs.getString(8));
                usu.setUsu_estado(rs.getString(9));
                lista.add(usu);
            }
        
        
        }catch (Exception e){
        
        }
        return lista;
    }
    
    public int agregar(Usuario u){
        String sql = "insert into usuario(usu_nombre, usu_apellidos, usu_email, usu_telefono, usu_password, usu_fecha_registro)values(?,?,?,?,?,?)";
        try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, u.getUsu_nombre());
            ps.setString(2, u.getUsu_apellidos());
            ps.setString(3, u.getUsu_email());
            ps.setString(4, u.getUsu_telefono());
            ps.setString(5, u.getUsu_password());
            ps.setString(6, u.getUsu_fecharegistro());
            
            ps.executeUpdate();
            
        
        } catch (Exception e) {
        }
        return resp;
    }
    
    public Usuario listarId(int id){
        Usuario usu = new Usuario();
        String sql = "select * from usuario where usu_id="+id;
        try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                usu.setUsu_nombre(rs.getString(2));
                usu.setUsu_apellidos(rs.getString(3));
                usu.setUsu_email(rs.getString(4));
                usu.setUsu_telefono(rs.getString(5));
                usu.setUsu_fecharegistro(rs.getString(6));
                usu.setUsu_tipo(rs.getString(8));
                usu.setUsu_estado(rs.getString(9));
            }
            
        
        }catch(Exception e){
        
        }
        return usu;
    }
    
    public int actualizar(Usuario u){
        String sql = "update usuario set usu_nombre=?, usu_apellidos=?, usu_email=?, usu_telefono=?, usu_password, usu_fecha_registro where usu_id=?" ;
        try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, u.getUsu_nombre());
            ps.setString(2, u.getUsu_apellidos());
            ps.setString(3, u.getUsu_email());
            ps.setString(4, u.getUsu_telefono());
            ps.setString(5, u.getUsu_password());
            ps.setString(6, u.getUsu_fecharegistro());
            ps.setInt(7, u.getUsu_id());
            ps.executeUpdate();
            
        
        } catch (Exception e) {
        }
        return resp;
        
    }
    public void delete(int id){
        String sql = "delete from usuario where usu_id =" +id;
        try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
                  
        
        }catch(Exception e){
        
        }
    
    }
    
    
}