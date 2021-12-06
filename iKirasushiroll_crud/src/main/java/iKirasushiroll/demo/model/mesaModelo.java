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
@Document(collection = "mesa")
public class mesaModelo {
    
    @Id
    private ObjectId id;
    private String numero_personas;
    private String estado;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNumero_personas() {
        return numero_personas;
    }

    public void setNumero_personas(String numero_personas) {
        this.numero_personas = numero_personas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
