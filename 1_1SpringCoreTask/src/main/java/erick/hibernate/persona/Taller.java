package erick.hibernate.persona;
// Generated 16/12/2015 13:37:18 by Hibernate Tools 4.3.1

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Taller  implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int codigo;
     private int cedula;
     private String nombre;
     private String apellido;

    public Taller() {
    }

	
    public Taller(int codigo, int cedula, String nombre) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public Taller(int codigo, int cedula, String nombre, String apellido) {
       this.codigo = codigo;
       this.cedula = cedula;
       this.nombre = nombre;
       this.apellido = apellido;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCedula() {
        return this.cedula;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }




}


