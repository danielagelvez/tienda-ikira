/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.controller;

import iKirasushiroll.demo.model.rollosModelo;
import iKirasushiroll.demo.repository.rollosRepositorio;
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
@CrossOrigin (origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping ("api/rollos")
public class rollosControlador {
    @Autowired
    private rollosRepositorio rollos;
    
    @PostMapping ("/insertar")
    public rollosModelo insertarRollos(@Validated @RequestBody rollosModelo ro){
        
        return rollos.insert(ro);
    }
    
    @GetMapping("/consultar")
    public List<rollosModelo> consultarRollos(){
        
        return rollos.findAll();
    }
     @GetMapping("/consultarIndividual/{id}")
    public Optional <rollosModelo> consultarRollosID(@PathVariable(value="id") String ident){
        
        return rollos.findById(ident);
    }
     @PutMapping("/actualizar/{id}")
    public rollosModelo actualizarRollos(@PathVariable (value="id") String id, @Validated @RequestBody rollosModelo varU){
        varU.setId(id);
        return rollos.save(varU);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarRollos(@PathVariable String id){
        rollos.deleteById(id);
    }
    
}
