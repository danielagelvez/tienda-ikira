/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.controller;

import iKirasushiroll.demo.model.usuarioModelo;
import iKirasushiroll.demo.repository.usuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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
@RequestMapping("api/usuario")
public class usuarioControlador {
    
    @Autowired
    private usuarioRepositorio usuarios;
    
    @Autowired private MongoTemplate mongo;
    
    @PostMapping ("/insertar")
    public usuarioModelo insertarUsuario(@Validated @RequestBody usuarioModelo ro){
        
        return usuarios.insert(ro);
    }
    
    @GetMapping("/consultar")
    public List<usuarioModelo> consultarTodos(){
        
        return usuarios.findAll();
    }
    
    @GetMapping("/consultarUsuario/{usuario}")
    public List<usuarioModelo> consultarUsuario(@PathVariable (value="usuario") String usuario){
        
       Query q=new Query();
       q.addCriteria(Criteria.where("usuario").is(usuario));
       
       return mongo.find(q, usuarioModelo.class );
       
    }
    
    @GetMapping("/consultarVariosParametros/{usuario}/{clave_usuario}")
    public List<usuarioModelo> consultarVariosParametros(@PathVariable (value="usuario") String usuario, @PathVariable (value="clave_usuario") String clave_usuario){
        
       Query q=new Query();
       q.addCriteria(Criteria.where("usuario").is(usuario).and ("clave_usuario").is(clave_usuario));
       
       return mongo.find(q, usuarioModelo.class );
       
    }
    
    @PutMapping("/actualizar/{id}")
    public usuarioModelo actualizarUsuario(@PathVariable (value="id") String id, @Validated @RequestBody usuarioModelo varU){
        varU.setId(id);
        return usuarios.save(varU);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario(@PathVariable String id){
        usuarios.deleteById(id);
    }
    
}
