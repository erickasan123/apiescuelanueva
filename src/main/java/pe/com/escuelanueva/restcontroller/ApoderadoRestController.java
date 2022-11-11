
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
import pe.com.escuelanueva.entity.ApoderadoEntity;
import pe.com.escuelanueva.service.ApoderadoService;

@RestController
@RequestMapping("/apoderado")
public class ApoderadoRestController {
    
    @Autowired
    private ApoderadoService servicioapoderado;
    
    @GetMapping
    public List<ApoderadoEntity> findAll(){
        return servicioapoderado.findAll();
    }
    
    @GetMapping("/custom")
    public List<ApoderadoEntity> findAllCustom(){
        return servicioapoderado.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ApoderadoEntity> findById(@PathVariable Long id){
        return servicioapoderado.findById(id);
    }
    
    @PostMapping
    public ApoderadoEntity add(@RequestBody ApoderadoEntity a){
        return servicioapoderado.add(a);
    }
    
    @PutMapping("/{id}")
    public ApoderadoEntity update(@PathVariable long id, @RequestBody ApoderadoEntity a){
       a.setCodigo(id);
        return servicioapoderado.udpate(a);
    }
    
    @DeleteMapping("/{id}")
    public ApoderadoEntity delete(@PathVariable long id){
       ApoderadoEntity objApoderadoEntity  = new ApoderadoEntity();
       objApoderadoEntity.setEstado(false);
        return servicioapoderado.delete(objApoderadoEntity.builder().codigo(id).build());
    }
}
