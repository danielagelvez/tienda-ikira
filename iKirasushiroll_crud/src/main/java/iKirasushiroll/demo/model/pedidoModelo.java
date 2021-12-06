/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.model;

import java.util.Date;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Daniela Gelvez
 */
@Document (collection = "pedido")
public class pedidoModelo {
    
    @Id
    private ObjectId id;
    private Integer id_usuario;
    private Integer id_rollos;
    private Integer id_bebidas;
    private Integer id_mesa;
    private Date fecha_pedido;
    private Integer total_pedido;
    private String estado_pedido;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getId_rollos() {
        return id_rollos;
    }

    public void setId_rollos(Integer id_rollos) {
        this.id_rollos = id_rollos;
    }

    public Integer getId_bebidas() {
        return id_bebidas;
    }

    public void setId_bebidas(Integer id_bebidas) {
        this.id_bebidas = id_bebidas;
    }

    public Integer getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(Integer id_mesa) {
        this.id_mesa = id_mesa;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public Integer getTotal_pedido() {
        return total_pedido;
    }

    public void setTotal_pedido(Integer total_pedido) {
        this.total_pedido = total_pedido;
    }

    public String getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }
    
    
}
