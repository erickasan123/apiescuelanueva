
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
import pe.com.escuelanueva.entity.ParentescoEntity;
import pe.com.escuelanueva.service.ParentescoService;

@RestController
@RequestMapping("/parentesco")
public class ParentescoRestController {
    @Autowired
    private ParentescoService servicioparentesco;
    
    @GetMapping
    public List<ParentescoEntity> findAll(){
        return servicioparentesco.findAll();
    }
    
    @GetMapping("/custom")
    public List<ParentescoEntity> findAllCustom(){
        return servicioparentesco.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ParentescoEntity> findById(@PathVariable Long id){
        return servicioparentesco.findById(id);
    }
    
    @PostMapping
    public ParentescoEntity add(@RequestBody ParentescoEntity d){
        return servicioparentesco.add(d);
    }
    
    @PutMapping("/{id}")
    public ParentescoEntity update(@PathVariable long id, @RequestBody ParentescoEntity d){
       d.setCodigo(id);
        return servicioparentesco.udpate(d);
    }
    
    @DeleteMapping("/{id}")
    public ParentescoEntity update(@PathVariable long id){
       ParentescoEntity objParentescoEntity  = new ParentescoEntity();
       objParentescoEntity.setEstado(false);
        return servicioparentesco.delete(objParentescoEntity.builder().codigo(id).build());
    }
}
