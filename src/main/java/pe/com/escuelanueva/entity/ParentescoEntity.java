
package pe.com.escuelanueva.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//LIBRERIAS PARA OPTIMIZAR CÓDIGO
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity (name="ParentescoEntity")
@Table(name="PARENTESCO")

public class ParentescoEntity  implements Serializable {
    
    //Serializado
    private static final long serialVersionUID =1L;
    
    //Atributos
    @Id
    @Column(name="CODPAR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name="DESCPAR")
    private String descripcion;
    
    @Column(name="ESTPAR")
    private boolean estado;
           
}
