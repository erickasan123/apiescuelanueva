
package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.escuelanueva.entity.DistritoEntity;

/**
 *
 * @author Desconocido
 */
public interface DistritoService {
    
    //Funcion para mostrar todos los datos
    List<DistritoEntity> findAll(); 
    
    //Funcion para mostrar los distritos habilitados
    List<DistritoEntity> findAllCustom();
    
    //Funcion para buscar un distrito por codigo
    Optional<DistritoEntity> findById(Long id);
    
    //funcion para registrar
    DistritoEntity add(DistritoEntity d);
    
    //funcion para actualizar
    DistritoEntity udpate(DistritoEntity d);
    
    //funcion para eliminar
    DistritoEntity delete(DistritoEntity d);

}
