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
@Document(collection = "bebidas")
public class bebidasModelo {
    
    @Id
    private String id;
    private String nombre_bebida;
    private String precio_bebida;
    private String imagen_bebida;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre_bebida() {
        return nombre_bebida;
    }

    public void setNombre_bebida(String nombre_bebida) {
        this.nombre_bebida = nombre_bebida;
    }

    public String getPrecio_bebida() {
        return precio_bebida;
    }

    public void setPrecio_bebida(String precio_bebida) {
        this.precio_bebida = precio_bebida;
    }

    public String getImagen_bebida() {
        return imagen_bebida;
    }

    public void setImagen_bebida(String imagen_bebida) {
        this.imagen_bebida = imagen_bebida;
    }

    
    
}
