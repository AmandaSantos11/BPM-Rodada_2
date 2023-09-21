package org.example.desafio_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversao conversao = new Conversao();

        System.out.println("Digite um número:");
        long numero = scanner.nextInt();

        System.out.println("Entrada: "+numero);
        System.out.println("Saída: "+conversao.converterNumeroRecebido(numero));
    }
}