/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadisticaspoo;
import java.util.Scanner;
/**
 *
 * @author CINTHIA
 */
public class EstadisticasPOO {
    private float[] numeros;
    public EstadisticasPOO(float[] numeros){
        this.numeros= numeros;
    }
    public float promedio() {
        float suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }
    public float desviacion() {
        float suma = 0;
        float promedio = promedio();  // Usamos el método promedio() para obtener la media
        for (int i = 0; i < numeros.length; i++) {
            suma += Math.pow(numeros[i] - promedio, 2);
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
        EstadisticasPOO estadistica = new EstadisticasPOO(numeros);
        float promedio = estadistica.promedio();
        float desviacion = estadistica.desviacion();
        System.out.printf("El promedio es: %.2f\n", promedio);
        System.out.printf("La desviacion estandar es: %.5f\n", desviacion);
        scanner.close();
        
    }
    
}
