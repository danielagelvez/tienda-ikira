/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iKirasushiroll.demo.repository;

import iKirasushiroll.demo.model.pedidoModelo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniela Gelvez
 */
@Repository
public interface pedidoRepositorio extends MongoRepository<pedidoModelo, ObjectId>{
    
}
