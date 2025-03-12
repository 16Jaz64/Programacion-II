/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author CINTHIA
 */
public class FigurasGeometricas {
    double area(double radio){
        return Math.PI*radio*radio;
    }
    double area(double base,double altura){
        return base*altura;
    }
    double area(float base, float altura){
        return (base*altura)/2;
    }
    double area(double base1,double base2,double altura){
        return ((base1+base2)*altura)/2;
    }
    double area(double perimetro,float apotema){
        return (perimetro*apotema)/2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FigurasGeometricas f1=new FigurasGeometricas();
        FigurasGeometricas f2=new FigurasGeometricas();
        FigurasGeometricas f3=new FigurasGeometricas();
        FigurasGeometricas f4=new FigurasGeometricas();
        FigurasGeometricas f5=new FigurasGeometricas();
        System.out.println("EL AREA DEL CIRCULO ES: "+f1.area(3));
        System.out.println("EL AREA DEL RECTANGULO ES: "+f2.area(9, 4));
        System.out.println("EL AREA DEL TRIANGULO RECTANGULO ES: "+f3.area(6, 5));
        System.out.println("EL AREA DEL TRAPECIO ES: "+f4.area(6, 4, 7));
        System.out.println("EL AREA DEL PENTAGONO ES: "+f5.area(12, 3));
        // TODO code application logic here
    }
    
}
