/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.controller;

import iKirasushiroll.demo.model.franquiciasModelo;
import iKirasushiroll.demo.repository.franquiciasRepositorio;
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
@CrossOrigin (origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping ("/api/franquicias")
public class franquiciasControlador {
    
    @Autowired
    private franquiciasRepositorio franquicias;
    
    @PostMapping ("/insertar")
    public franquiciasModelo insertarFranquicias(@Validated @RequestBody franquiciasModelo b){
        
        return franquicias.insert(b);
    }
    
    @GetMapping("/consultar")
    public List<franquiciasModelo> consultarFranquicias(){
        
        return franquicias.findAll();
    }
    
     @PutMapping("/actualizar/{id}")
    public franquiciasModelo actualizarFranquicias(@PathVariable (value="id") String id, @Validated @RequestBody franquiciasModelo varU){
        varU.setId(id);
        return franquicias.save(varU);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarFranquicias(@PathVariable String id){
        franquicias.deleteById(id);
    }
}
