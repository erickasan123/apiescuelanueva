
package pe.com.escuelanueva.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.escuelanueva.entity.DistritoEntity;
import pe.com.escuelanueva.service.DistritoService;

@RestController
@RequestMapping("/distrito")

public class DistritoRestController {
    @Autowired
    private DistritoService servicio;
    
    @GetMapping
    public List<DistritoEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<DistritoEntity> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity d){
        return servicio.add(d);
    }
    
    @PutMapping("/{id}")
    public DistritoEntity update(@PathVariable long id, @RequestBody DistritoEntity d){
       d.setCodigo(id);
        return servicio.udpate(d);
    }
    
    @DeleteMapping("/{id}")
    public DistritoEntity update(@PathVariable long id){
       DistritoEntity objDistritoEntity  = new DistritoEntity();
       objDistritoEntity.setEstado(false);
        return servicio.delete(DistritoEntity.builder().codigo(id).build());
    }
    
}
    
    

    
