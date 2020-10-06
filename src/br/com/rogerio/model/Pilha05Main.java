/*
 * 5. Fazer um programa que testa se um número inteiro é palíndromo ou não, ou
 * seja, um número cuja primeira metade é simétrico à segunda metade.
 * Exemplos: 1234321 – sim; 99 – sim; 1232 - não
 */
package br.com.rogerio.model;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class Pilha05Main {

    public static void main(String[] args) throws Exception {
        int tamanho = 10;
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        numero = scan.nextInt();

        if (eCapicua(numero)) {
            System.out.println("é capicua");
        } else {
            System.out.println("não é capicua");
        }

    }

    public static boolean eCapicua(int valor) throws Exception {
        int aux = valor;
        Pilha05 p = new Pilha05(50);

        while (aux != 0) {
            p.push(aux % 10);
            aux = aux / 10;
        }
        int num = p.quantElementos() / 2;
        for (int i = 0; i < num; i++) {
            if (p.top() != valor % 10) {
                return false;
            }
            p.pop();
            valor = valor / 10;
        }
        return true;
    }

}
