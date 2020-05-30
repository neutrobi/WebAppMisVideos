package conectBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author denwa
 */
public class Consultas extends Conection {

    public boolean autenticacion(String usuario, String contraseña) {
        PreparedStatement pet = null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT * FROM usuarios where usuario= ? and pass = ?";
            pet = getConection().prepareStatement(consulta);
            pet.setString(1, usuario);
            pet.setString(2, contraseña);
            rs = pet.executeQuery();

            if (rs.absolute(1)) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if(pet != null) pet.close();
                if(rs != null) rs.close();
            }catch(Exception e){
                System.out.println("Error" + e);
            }
        }
        return false;
    }
    
    /*public static void main(String[] args){
      Consultas co = new Consultas();
        System.out.println(co.autenticacion("neos","123"));
    }*/
    
    public boolean registrar(String nombre, String apellido, String usuario, String contraseña){
        
        PreparedStatement pst = null;        
        
        try{
            String consulta = "INSERT INTO usuarios (apellido, usuario, nombre, pass) VALUES (?,?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1, apellido);
            pst.setString(2, usuario);
            pst.setString(3, nombre);
            pst.setString(4, contraseña);
            
            
            if(pst.executeUpdate()== 1){
            return true;
            }
        }catch (Exception e) {
            System.out.println("Error" + e);
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if(pst != null) pst.close();
            }catch(Exception e){
                System.out.println("Error" + e);
            }
        }
    return false;
   }
    
    public boolean comentarios(String comentario){
        
        PreparedStatement pst = null;        
        
        try{
            String consulta = "INSERT INTO comentarios (comentarios) VALUES (?)";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1, comentario);
            
            if(pst.executeUpdate()== 1){
            return true;
            }
        }catch (Exception e) {
            System.out.println("Error" + e);
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if(pst != null) pst.close();
            }catch(Exception e){
                System.out.println("Error" + e);
            }
        }
    return false;
   }
    
    public boolean AgregarVideo(String usuarioVideo, String titulo, String url, String plataforma, String urlCompleta){
        
        PreparedStatement pst = null;        
        
        try{
            String consulta = "INSERT INTO AgregarVideo (usuarioVideo,titulo,url,plataforma,urlCompleta) VALUES (?,?,?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1, usuarioVideo);
            pst.setString(2, titulo);
            pst.setString(3, url);
            pst.setString(4, plataforma);
            pst.setString(5, urlCompleta);
            
            if(pst.executeUpdate()== 1){
            return true;
            }
        }catch (Exception e) {
            System.out.println("Error" + e);
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if(pst != null) pst.close();
            }catch(Exception e){
                System.out.println("Error" + e);
            }
        }
    return false;
   }
    
    public boolean EditarVideo(int id_video, String usuarioVideo, String titulo, String url, String plataforma, String urlCompleta){
        
        PreparedStatement pst = null;        
        
        try{
            String consulta = "UPDATE agregarvideo "
                    + "SET usuarioVideo = ?,"
                    + "titulo = ?,"
                    + "url = ?,"
                    + "plataforma = ?,"
                    + "urlCompleta = ?"
                    + "WHERE id_video ="+ id_video +"";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1, usuarioVideo);
            pst.setString(2, titulo);
            pst.setString(3, url);
            pst.setString(4, plataforma);
            pst.setString(5, urlCompleta);
            
            
            if(pst.executeUpdate()== 1){
            return true;
            }
        }catch (Exception e) {
            System.out.println("Error" + e);
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if(pst != null) pst.close();
            }catch(Exception e){
                System.out.println("Error" + e);
            }
        }
    return false;
   }
    
    public boolean BorrarVideo(int id_video){
        
        PreparedStatement pst = null;        
        
        try{
            String consulta = "DELETE FROM agregarvideo WHERE id_video = " + id_video;
            pst = getConection().prepareStatement(consulta);
            
            if(pst.executeUpdate()== 1){
            return true;
            }
        }catch (Exception e) {
            System.out.println("Error" + e);
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if(pst != null) pst.close();
            }catch(Exception e){
                System.out.println("Error" + e);
            }
        }
    return false;
   }
    /*
     public static void main(String[] args){
      Consultas co = new Consultas();
         System.out.println(co.EditarVideo(10,"Krono","Kurtas - La Mujer Perfecta (Lyric Video)","QD0aSAe67CI","YouTube"));
    }*/
}


