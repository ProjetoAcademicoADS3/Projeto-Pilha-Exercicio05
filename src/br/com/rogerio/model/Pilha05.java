/*
 * 5. Fazer um programa que testa se um número inteiro é palíndromo ou não, ou
 * seja, um número cuja primeira metade é simétrico à segunda metade.
 * Exemplos: 1234321 – sim; 99 – sim; 1232 - não
 */
package br.com.rogerio.model;

import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class Pilha05 {

    int tamanho;
    int[] elemento;
    int topo;

    public Pilha05(int tamanho) {
        this.tamanho = tamanho;
        elemento = new int[tamanho];
        topo = -1;
    }

    public void push(int elemento) throws Exception {

        if (isFull()) {
            throw new Exception("A pilha está cheia!\n");
        }
        topo++;
        this.elemento[topo] = elemento;
    }

    public int pop() throws Exception {

        if (isEmpty()) {
            throw new Exception("A pilha está vazia!\n");
        }
        int elemento;
        elemento = this.elemento[topo];
        topo--;
        return elemento;
    }

    public boolean isEmpty() throws Exception {
        return topo == -1;
    }

    public boolean isFull() throws Exception {
        return topo == elemento.length - 1;
    }

    public int top() throws Exception {

        return this.elemento[topo];
    }
    
    public int quantElementos(){
        return topo +1;
    }

}
