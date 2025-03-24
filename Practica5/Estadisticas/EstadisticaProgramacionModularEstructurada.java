/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadisticaprogramacionmodularestructurada;
import java.util.Scanner;
/**
 *
 * @author CINTHIA
 */
public class EstadisticaProgramacionModularEstructurada {
    public static float promedio(float[] numeros) {
        float suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        return suma / numeros.length;
    }
    public static float desviacion(float[] numeros, float promedio) {
        float suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = (float) (suma + Math.pow(numeros[i] - promedio, 2));
        }
        return (float) Math.sqrt(suma / (numeros.length - 1));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        String[] partes = entrada.split(" ");
        float[] numeros = new float[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = Float.parseFloat(partes[i]);
        }
        float promedio = promedio(numeros);
        System.out.printf("El promedio es: %.2f\n", promedio);
        float desviacion = desviacion(numeros, promedio);
        System.out.printf("La desviacion estandar es: %.5f\n", desviacion);
        scanner.close();
        
    }
    
}
