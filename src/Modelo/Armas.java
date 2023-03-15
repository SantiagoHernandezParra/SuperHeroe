
package Modelo;


public class Armas {
    private String nom_arma;
    private int daño_arma;
    public Armas(String nom_arma,int daño_arma){
        this.nom_arma = nom_arma;
        this.daño_arma = daño_arma;
    }
    public String getnom_arma(){
        return nom_arma;
    }
    public int getprot_arma(){
        return daño_arma;
    }
    public void setnom_arma(String nom_arma){
        this.nom_arma = nom_arma;
    }
    public void setprot_esc(int daño_arma){
        this.daño_arma = daño_arma;
    }
}
