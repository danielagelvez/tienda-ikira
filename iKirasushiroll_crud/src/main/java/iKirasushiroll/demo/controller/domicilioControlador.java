/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.controller;

import iKirasushiroll.demo.model.domicilioModelo;
import iKirasushiroll.demo.repository.domicilioRepositorio;
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
@CrossOrigin (origins =  "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping ("api/domicilio")
public class domicilioControlador {
    @Autowired
    private domicilioRepositorio domicilio;
    
    @PostMapping ("/insertar")
    public domicilioModelo insertarSolicitud(@Validated @RequestBody domicilioModelo ro){
        
        return domicilio.insert(ro);
    }
    
    @GetMapping("/consultar")
    public List<domicilioModelo> consultarDomicilios(){
        
        return domicilio.findAll();
    }
    
    @PutMapping("/actualizar/{id}")
    public domicilioModelo actualizarDomicilio(@PathVariable (value="id") ObjectId id, @Validated @RequestBody domicilioModelo varU){
        varU.setId(id);
        return domicilio.save(varU);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarDomicilio(@PathVariable ObjectId id){
        domicilio.deleteById(id);
    }
    
}
