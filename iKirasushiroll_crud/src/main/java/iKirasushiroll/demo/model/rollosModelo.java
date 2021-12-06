/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Daniela Gelvez
 */
@Document (collection = "rollos")
public class rollosModelo {
    
    @Id
    private String id;
    private String nombre_rollos;
    private String ingredientes_rollos;
    private String precio_rollos;
    private String imagen_rollos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre_rollos() {
        return nombre_rollos;
    }

    public void setNombre_rollos(String nombre_rollos) {
        this.nombre_rollos = nombre_rollos;
    }

    public String getIngredientes_rollos() {
        return ingredientes_rollos;
    }

    public void setIngredientes_rollos(String ingredientes_rollos) {
        this.ingredientes_rollos = ingredientes_rollos;
    }

    public String getPrecio_rollos() {
        return precio_rollos;
    }

    public void setPrecio_rollos(String precio_rollos) {
        this.precio_rollos = precio_rollos;
    }

    public String getImagen_rollos() {
        return imagen_rollos;
    }

    public void setImagen_rollos(String imagen_rollos) {
        this.imagen_rollos = imagen_rollos;
    }

   
    
}
