
package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.escuelanueva.entity.ApoderadoEntity;

/**
 *
 * @author Desconocido
 */
public interface ApoderadoService {
    //Funcion para mostrar todos los datos
    List<ApoderadoEntity> findAll(); 
    
    //Funcion para mostrar los apoderados habilitados
    List<ApoderadoEntity> findAllCustom();
    
    //Funcion para buscar un apoderados por codigo
    Optional<ApoderadoEntity> findById(Long id);
    
    //funcion para registrar
    ApoderadoEntity add(ApoderadoEntity a);
    
    //funcion para actualizar
    ApoderadoEntity udpate(ApoderadoEntity a);
    
    //funcion para eliminar
    ApoderadoEntity delete(ApoderadoEntity a);
}
