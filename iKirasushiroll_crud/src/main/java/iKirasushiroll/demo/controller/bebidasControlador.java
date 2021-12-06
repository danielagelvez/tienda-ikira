/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.controller;

import iKirasushiroll.demo.model.bebidasModelo;
import iKirasushiroll.demo.repository.bebidasRepositorio;
import java.util.List;
import java.util.Optional;
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
@RequestMapping ("/api/bebidas")
public class bebidasControlador {
   
    @Autowired
    private bebidasRepositorio bebidas;
    
    @PostMapping ("/insertar")
    public bebidasModelo insertarBebidas(@Validated @RequestBody bebidasModelo b){
        
        return bebidas.insert(b);
    }
    
    @GetMapping("/consultar")
    public List <bebidasModelo> consultarTodos(){
        
        return bebidas.findAll();
    }
    @GetMapping("/consultarIndividual/{id}")
    public Optional <bebidasModelo> consultarBebidasID(@PathVariable(value="id") String ident){
        
        return bebidas.findById(ident);
    }
        

    
    @PutMapping("/actualizar/{id}")
    public bebidasModelo actualizarBebidas(@PathVariable  (value="id") String id, @Validated @RequestBody bebidasModelo varU){
        varU.setId(id);
        return bebidas.save(varU);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarBebidas(@PathVariable String id){
        bebidas.deleteById(id);
    }
}
