
package Modelo;
public class Superheroe {
    private String heroe;
    private int salud;
    public Superheroe(String heroe, int salud){
        this.heroe = heroe;
        this.salud = salud;
    }
    public Superheroe(){}
    public String getherore(){
        return heroe;
    }
    public int getsalud(){
        return salud;
    }
    public void setheroe(String heroe){
        this.heroe = heroe;
    }
    public void setsalud(int salud){
    this.salud = salud;
    }
    
}
