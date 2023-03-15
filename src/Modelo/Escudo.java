
package Modelo;

public class Escudo {
    private String nom_escudo;
    private int prot_esc;
    public Escudo (String nom_escudo, int prot_esc){
        this.nom_escudo = nom_escudo;
        this.prot_esc = prot_esc;
    }
  public String gtnom_escudo(){
    return nom_escudo;
  }
  public int getprot_esc(){
    return prot_esc;
  }
  public void setnom_escudo(String nom_escudo){
    this.nom_escudo = nom_escudo;
  }
  public void setprot_esc(int prot_esc){
    this.prot_esc = prot_esc;
  }
  
}
