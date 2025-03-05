/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola;

/**
 *
 * @author CINTHIA
 */
public class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;

    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = -1;
        this.fin = -1;
    }

    public void insert(long e) {
        if (isFull()) {
            System.out.println("----------COLA LLENA--------");
            return;
        }
        if (isEmpty()) {
            inicio = 0;
            fin = 0;
        } else if (fin == n - 1) { 
            fin = 0;
        } else {
            fin++;
        }
        arreglo[fin] = e;
    }

    public long remove() {
        if (isEmpty()) {
            System.out.println("----------COLA VACIA--------");
            return -1;
        }
        long elemento = arreglo[inicio];

        if (inicio == fin) { 
            inicio = -1;
            fin = -1;
        } else if (inicio == n - 1) { 
            inicio = 0;
        } else {
            inicio++;
        }
        return elemento;
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("----------COLA VACIA--------");
            return -1;
        }
        return arreglo[inicio];
    }

    public boolean isEmpty() {
        return inicio == -1;
    }

    public boolean isFull() {
        if (isEmpty()) return false;
        if (inicio == 0 && fin == n - 1) return true;
        return fin + 1 == inicio;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        if (fin >= inicio) {
            return fin - inicio + 1;
        } else {
            return (n - inicio) + (fin + 1);
        }
    }

    public static void main(String[] args) {
        Cola cola = new Cola(5);

        cola.insert(6);
        cola.insert(18);
        cola.insert(27);
        cola.insert(34);
        cola.insert(49);

        System.out.println(cola.remove());
        System.out.println(cola.remove());
        System.out.println(cola.remove());
        System.out.println(cola.remove());
        System.out.println(cola.remove());

    }
}
