/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.controller;

import iKirasushiroll.demo.model.contactanosModelo;
import iKirasushiroll.demo.repository.contactanosRepositorio;
import java.util.List;
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
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/api/contactanos")
public class contactanosControlador {
    
    @Autowired
    private contactanosRepositorio contactanos;
    
    @PostMapping("/insertar")
    public contactanosModelo insertarContacto(@Validated @RequestBody contactanosModelo cm){
    
        return contactanos.insert(cm);
    }
    
    @GetMapping("/consultar")
    public List <contactanosModelo> consultarTodos(){
        
        return contactanos.findAll();
    }
    
    @PutMapping("/actualizar/{id}")
    public contactanosModelo actualizarContactos(@PathVariable (value="id") String id, @Validated @RequestBody contactanosModelo varU){
        varU.setId(id);
        return contactanos.save(varU);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarContacto(@PathVariable String id){
        contactanos.deleteById(id);
    }
}
