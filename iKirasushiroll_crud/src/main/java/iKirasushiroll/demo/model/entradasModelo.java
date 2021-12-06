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
@Document (collection="entradas")
public class entradasModelo {
    
    @Id
    private String id;
    private String nombre_entrada;
    private String ingredientes_entrada;
    private String precio_entrada;
    private String imagen_entrada;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre_entrada() {
        return nombre_entrada;
    }

    public void setNombre_entrada(String nombre_entrada) {
        this.nombre_entrada = nombre_entrada;
    }

    public String getIngredientes_entrada() {
        return ingredientes_entrada;
    }

    public void setIngredientes_entrada(String ingredientes_entrada) {
        this.ingredientes_entrada = ingredientes_entrada;
    }

    public String getPrecio_entrada() {
        return precio_entrada;
    }

    public void setPrecio_entrada(String precio_entrada) {
        this.precio_entrada = precio_entrada;
    }

    public String getImagen_entrada() {
        return imagen_entrada;
    }

    public void setImagen_entrada(String imagen_entrada) {
        this.imagen_entrada = imagen_entrada;
    }

    
    
}
