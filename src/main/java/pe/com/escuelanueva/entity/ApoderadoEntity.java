
// @author Desconocido

package pe.com.escuelanueva.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity (name="ApoderadoEntity")
@Table(name="APODERADO")

public class ApoderadoEntity implements Serializable {
    
    private static final long serialVersionUID =1L;
    @Id
    @Column(name="CODAPO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name="NOMAPO")
    private String nombre;
    
    @Column(name="APEPAPO")
    private String apellidopaterno;
    
    @Column(name="APEMAPO")
    private String apellidomaterno;
    
    @Column(name="DNIAPO")
    private String dni;
    
    @Column(name="DIRAPO")
    private String direccion;
    
    @Column(name="TELAPO")
    private String telefono;
    
    @Column(name="CELAPO")
    private String celular;
    
    @Column(name="CORAPO")
    private String correo;
    
    @Column(name="SEXAPO")
    private String sexo;
    
    @Column(name="ESTAPO")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "CODDIS", nullable = false)
    private DistritoEntity distrito;
    
    @ManyToOne
    @JoinColumn(name = "CODPAR", nullable = false)
    private ParentescoEntity parentesco;
    
}
