/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.controller;

import iKirasushiroll.demo.model.reservaModelo;
import iKirasushiroll.demo.repository.reservaRepositorio;
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
@RequestMapping("/api/reservas")
public class reservasControlador {
    
    @Autowired
    private reservaRepositorio reserva;
    
    @PostMapping ("/insertar")
    public reservaModelo insertarReservas(@Validated @RequestBody reservaModelo rm){
        
        return reserva.insert(rm);
    }
    
    @GetMapping("/consultar")
    public List<reservaModelo> consultarReservas(){
        
        return reserva.findAll();
    }
    
    @PutMapping("/actualizar /{id}")
    public reservaModelo actualizarReservas(@PathVariable (value="id") ObjectId id, @Validated @RequestBody reservaModelo varU){
        varU.setId(id);
        return reserva.save(varU);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarReservas(@PathVariable ObjectId id){
        reserva.deleteById(id);
    }
    
    
}
