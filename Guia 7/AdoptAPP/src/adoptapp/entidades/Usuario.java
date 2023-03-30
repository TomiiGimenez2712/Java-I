package adoptapp.entidades;

import java.util.Date;


public class Usuario {
    public String nombre;
    public String apellido;
    public String dni;
    public Date naciemiento;
    public String ciudad;
    public String provincia;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String dni, Date naciemiento, String ciudad, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.naciemiento = naciemiento;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }
    
    

}
