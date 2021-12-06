/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.controller;

import iKirasushiroll.demo.model.pedidoModelo;
import iKirasushiroll.demo.repository.pedidoRepositorio;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Daniela Gelvez
 */
@RestController
@CrossOrigin (origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping ("api/pedido")
public class pedidoControlador {
    
    @Autowired
    private pedidoRepositorio pedido;
    
    @PostMapping ("/insertar")
    public pedidoModelo insertarPedido(@Validated @RequestBody pedidoModelo ro){
        
        return pedido.insert(ro);
    }
    
    @GetMapping("/consultar")
    public List<pedidoModelo> consultarPedido(){
        
        return pedido.findAll();
    }
    
    @PutMapping("/actualizar/{id}")
    public pedidoModelo actualizarPedido(@PathVariable (value="id") ObjectId id, @Validated @RequestBody pedidoModelo varU){
        varU.setId(id);
        return pedido.save(varU);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarPedido(@PathVariable ObjectId id){
        pedido.deleteById(id);
    }
}
