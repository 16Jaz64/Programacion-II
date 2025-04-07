/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion;

/**
 *
 * @author CINTHIA
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JuegoAdivinaNumero juego1=new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2=new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3=new JuegoAdivinaImpar(3);
        System.out.println("---- Juego 1: Adivina un numero ----");
        juego1.juega();
        System.out.println("---- Juego 2: Adivina un numero Par----");
        juego2.juega();
        System.out.println("---- Juego 3: Adivina un numero Impar----");
        juego3.juega();
    }
    
}
