/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author CINTHIA
 */
public class JuegoAdivinaNumero extends Juego{
    private int numeroAAdivinar;
    public JuegoAdivinaNumero(int vidas) {
        setNumeroDeVidas(vidas);
    }

    public boolean validaNumero(int n) {
        return n >= 0 && n <= 10;
    }

    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Adivina un numero entre 0 y 10: ");
            int intento = sc.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Numero fuera de rango. Intenta de nuevo.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste!!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El numero es mayor.");
                    } else {
                        System.out.println("El numero es menor.");
                    }
                } else {
                    System.out.println("¡Se acabaron las vidas! El numero era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }

    public int getNumeroAAdivinar() {
        return numeroAAdivinar;
    }

    public void setNumeroAAdivinar(int numeroAAdivinar) {
        this.numeroAAdivinar = numeroAAdivinar;
    }

}
