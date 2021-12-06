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
@Document (collection = "franquicias")
public class franquiciasModelo {
    
    @Id
    private String id;
    private String nombre_Ufranquicia;
    private String correo_Ufranquicia;
    private String numero_contacto;
    private String horario;
    private String medio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre_Ufranquicia() {
        return nombre_Ufranquicia;
    }

    public void setNombre_Ufranquicia(String nombre_Ufranquicia) {
        this.nombre_Ufranquicia = nombre_Ufranquicia;
    }

    public String getCorreo_Ufranquicia() {
        return correo_Ufranquicia;
    }

    public void setCorreo_Ufranquicia(String correo_Ufranquicia) {
        this.correo_Ufranquicia = correo_Ufranquicia;
    }

    public String getNumero_contacto() {
        return numero_contacto;
    }

    public void setNumero_contacto(String numero_contacto) {
        this.numero_contacto = numero_contacto;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

   
    
    
}
