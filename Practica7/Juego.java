/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

/**
 *
 * @author CINTHIA
 */
public class Juego {
    private int numeroDeVidas, record; 
    
    
    public void reiniciaPartida(){
        numeroDeVidas=3;
    } 
    public void actualizaRecord(){
        record++;
    }
    public boolean quitaVida(){
        numeroDeVidas--;
        return numeroDeVidas>0;
    }
    public int getNumeroDeVidas(){
        return numeroDeVidas;
    }
    public int getRecord(){
        return record;
    }
    public void setNumeroDeVidas(int nomeroDeVidas){
        this.numeroDeVidas=numeroDeVidas;
    }
}
