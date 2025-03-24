/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacionescuadraticasprogramacionmodularestructurada;
import java.util.Scanner;
/**
 *
 * @author CINTHIA
 */
public class EcuacionesCuadraticasProgramacionModularEstructurada {
    
   public static double getDiscriminante(double a, double b, double c){
        return (b*b)-(4*a*c);
    }
    
    public static double getRaiz1(double a, double b, double discriminante){
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }
    
    public static double getRaiz2(double a, double b, double discriminante){
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }
    
    
    public static void resolEjercicio(double a, double b, double c) {
        double discriminante = getDiscriminante(a, b, c);
        
        if (discriminante > 0) {
            double r1 = getRaiz1(a, b, discriminante);
            double r2 = getRaiz2(a, b, discriminante);
            System.out.printf("LA ECUACION TIENE DOS RAICES %.6f y %.6f\n", r1, r2);
        } else if (discriminante == 0) {
            double r1 = -b / (2 * a);
            System.out.printf("LA ECUACION TIENE UNA RAIZ %.0f\n", r1);
        } else {
            System.out.println("LA ECUACION NO TIENE RAICES REALES");
        }
    }
    public static double[] valores(Scanner scanner) {
        double[] valores = new double[3];
        System.out.print("Ingrese a, b, c: ");
        String entrada = scanner.nextLine();  
        String[] partes = entrada.split(" ");
        
        for (int i = 0; i < 3; i++) {
            valores[i] = Double.parseDouble(partes[i]);
        }

        return valores;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        double[] valores1 = valores(scanner);
        double a = valores1[0], b = valores1[1], c = valores1[2];

        double[] valores2 = valores(scanner);
        double a2 = valores2[0], b2 = valores2[1], c2 = valores2[2];

        double[] valores3 = valores(scanner);
        double a3 = valores3[0], b3 = valores3[1], c3 = valores3[2];

        resolEjercicio(a, b, c);
        resolEjercicio(a2, b2, c2);
        resolEjercicio(a3, b3, c3);

        scanner.close();
        
        
        
    }
    
}
