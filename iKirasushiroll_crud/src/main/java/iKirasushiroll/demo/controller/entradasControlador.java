/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.controller;

import iKirasushiroll.demo.model.entradasModelo;
import iKirasushiroll.demo.repository.entradasRepositorio;
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
@RequestMapping("/api/entradas")
public class entradasControlador {
    
    @Autowired
    private entradasRepositorio entrada;
    
    @PostMapping("/insertar")
    public entradasModelo insertarEntradas(@Validated @RequestBody entradasModelo e){
    
            return entrada.insert(e);
    }
    
    @GetMapping("/consultar")
        public List<entradasModelo> consultarTodos (){
            return entrada.findAll();
        }
    
    @GetMapping("/consultarIndividual/{id}")
    public Optional <entradasModelo> consultarEntradasID(@PathVariable(value="id") String ident){
        
        return entrada.findById(ident);
    }
        
    @PutMapping("/actualizar/{id}")
    public entradasModelo actualizarEntradas(@PathVariable (value="id") String id, @Validated @RequestBody entradasModelo varU){
        varU.setId(id);
        return entrada.save(varU);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarEntradas(@PathVariable String id){
        entrada.deleteById(id);
    }
     
    
     
}
