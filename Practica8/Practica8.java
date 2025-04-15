/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica8;

/**
 *
 * @author CINTHIA
 */
public class Practica8 {
    class A{
        public int x,z;
        A(int x, int z){
            this.x=x;
            this.z=z;
        }
        public void incrementaXZ(){
            x=x+1;
            z=z+1;
        }
        public void incrementaZ(){
            z=z+1;
        }
    }
    class B{
        public int y,z;
        B(int y, int z){
            this.y=y;
            this.z=z;
        }
        public void incrementaYZ(){
            y=y+1;
            z=z+1;
        }
        public void incrementaZ(){
            z=z+1;
        }
        
    }
    class D extends A{
        public int y;
        D(int x,int y,int z){
            super(x,z);
            this.y=y;
        }
        public void incrementaXYZ(){
            x=x+1;
            y=y+1;
            z=z+1;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Practica8 p=new Practica8();
        D d=p.new D(5,3,2);
        System.out.println("(" +d.x + "," + d.y + "," + d.z+ ")");
        d.incrementaXYZ();
        System.out.println("incrementaXYZ: (" +d.x + "," + d.y + "," + d.z+ ")");
    }
    
