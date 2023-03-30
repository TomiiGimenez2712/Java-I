package adoptapp.entidades;

import java.util.Date;

public class Mascota {
    
    private int energia;
    private String tipo;
    private String raza;
    private String color;
    private String sexo;
    private Date edad;
    
    public Mascota(){
        this.energia=1000;
    }

    public Mascota(String tipo, String raza, String sexo){
      this.tipo= tipo;
      this.raza=raza;
      this.sexo=sexo;
      this.energia=1000;
  }

    public Mascota(String tipo, String raza, String color, String sexo, Date edad) {
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
        this.energia=1000;
    }
  

//--------Seters----------------
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }
    
    
    //--------Getters----------------

    public String getTipo() {
        return tipo;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getEdad() {
        return edad;
    }

   
    
    /**
     * Funcion destinada a pasear
     * @param restarEnergia
     * @return energia
     */
    public int pasear (int restarEnergia){
        energia -= restarEnergia;
        return energia;
    }
    
    /**
     *  Función que depende las vueltas resta energia
     * @param restarEnergia
     * @param vueltas
     * @return energia
     */
     public int pasear (int restarEnergia, int vueltas){
         for (int i = 0; i < vueltas; i++) {
              energia -= restarEnergia;
         }
        
        return energia;
    }

     
     
    @Override
    public String toString() {
        return "Mascota{" + "energia=" + energia + ", tipo=" + tipo + ", raza=" + raza + ", color=" + color + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
    
   

    
    

}
