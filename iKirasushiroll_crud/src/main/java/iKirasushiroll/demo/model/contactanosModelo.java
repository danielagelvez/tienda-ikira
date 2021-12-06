/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Daniela Gelvez
 */
@Document(collection = "contactanos")
public class contactanosModelo {
    
    @Id
    private String id;
    private String nombre_usuario;
    private String correo_usuario;
    private String sugerencia_usuario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getSugerencia_usuario() {
        return sugerencia_usuario;
    }

    public void setSugerencia_usuario(String sugerencia_usuario) {
        this.sugerencia_usuario = sugerencia_usuario;
    }

  
    
    
}
