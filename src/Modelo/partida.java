
package Modelo;
public class partida {
    private int val_resultado;
    private Superheroe Atacante;
    private Superheroe Victima;
    private Escudo escudo;
    private Armas arma;
    public partida(int val_resultado, Superheroe Atacante, Superheroe Victima, Armas arma){
        this.val_resultado = val_resultado;
        this.Atacante = Atacante;
        this.Victima = Victima;
        this.escudo = escudo;
        this.arma = arma;
    }
    public int getval_resultado(){
        return val_resultado;
    }
    public Superheroe getAtacante(){
        return Atacante;
    }
    public Superheroe getVictima(){
        return Victima;
    }
    public Escudo getescudo(){
        return escudo;
    }
    public Armas getarma(){
     return arma;
    }
    public void  setval_resultado(int val_resultado){
        this.val_resultado = val_resultado;
    }
    public void setAtacante(Superheroe Atacante){
        this.Atacante = Atacante;
    }
    public void setVictima(Superheroe Victoma){
        this.Victima = Victima;
    }
    public void setescudo(Escudo escudo){
        this.escudo = escudo;
    }
    public void setarma(Armas arma){
        this.arma = arma;
    }
}
