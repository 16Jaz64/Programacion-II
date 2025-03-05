/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila;

/**
 *
 * @author CINTHIA
 */
public class Pila {
    private long[] arreglo;
    private int top;
    private int n;
    
    public Pila(int n){
        this.n=n;
        this.arreglo = new long[n];
        this.top=-1;
    }
    //pila llena?
    public boolean isFull(){
        return top==n-1;
    }
    //pila vacia?
    public boolean isEmpty(){
        return top==-1;
    }
    //adicion
    public void push(long e ){
        if(isFull()){
            System.out.println("-----------PILA LLENA---------");
        }
        else{
            arreglo[++top]=e;
        }
    }
    
    //eliminar
    public long pop(){
        if(isEmpty()){
            System.out.println("-----------PILA VACIA---------");
            return -1;
        }
        else{
            return arreglo[top--];
        }
    }
    //
    public long peek(){
        
            return arreglo[top];
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila pila= new Pila(6);
        pila.push(1);
        pila.push(3);
        pila.push(9);
        pila.push(15);
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }
    
}
