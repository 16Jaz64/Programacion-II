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
public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int n) {
        if (n >= 0 && n <= 10 && n % 2 == 0) {
            return true;
        } else {
            System.out.println("Numero invalido. Debe ser PAR entre 0 y 10.");
            return false;
        }
    }
    @Override
    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        setNumeroAAdivinar(rand.nextInt(6) * 2);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Adivina un numero PAR entre 0 y 10: ");
            int intento = sc.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Numero fuera de rango o no es par. Intenta de nuevo.");
                continue;
            }

            if (intento == getNumeroAAdivinar()) {
                System.out.println("Acertaste!!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (intento < getNumeroAAdivinar()) {
                        System.out.println("El numero es mayor.");
                    } else {
                        System.out.println("El numero es menor.");
                    }
                } else {
                    System.out.println("Se acabaron las vidas!! El numero era: " + getNumeroAAdivinar());
                    break;
                }
            }
        }
    }
    
}
