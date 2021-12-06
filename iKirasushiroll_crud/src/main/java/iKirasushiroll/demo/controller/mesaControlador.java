/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.controller;

import iKirasushiroll.demo.model.mesaModelo;
import iKirasushiroll.demo.repository.mesaRepositorio;
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
@RequestMapping ("/api/mesa")
public class mesaControlador {
    @Autowired
    private mesaRepositorio mesa;
    
     
    @PostMapping ("/insertar")
    public mesaModelo insertarMesa(@Validated @RequestBody mesaModelo me){
        
        return mesa.insert(me);
    }
    
    @GetMapping("/consultar")
    public List<mesaModelo> consultarMesa(){
        
        return mesa.findAll();
    }
    
    @PutMapping("/actualizar/{id}")
    public mesaModelo actualizarMesa(@PathVariable (value="id") ObjectId id, @Validated @RequestBody mesaModelo varU){
        varU.setId(id);
        return mesa.save(varU);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarMesa(@PathVariable ObjectId id){
        mesa.deleteById(id);
    }
}
