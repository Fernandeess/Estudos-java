/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mfrodrigues2
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produtos produto01 = new Produtos();
        
        System.out.println("Nome do produto: ");
        produto01.nomeProduto = sc.next();
        
        System.out.println("Insira a quantidade: ");
        produto01.qntdProduto = sc.nextInt();
        
        System.out.println("Preço do produto: ");
        produto01.price = sc.nextDouble();
        sc.close();
        System.out.println(String.format("Confirmação: %s \n Estoque atual: %d \n Preço unitario: %.2fP",produto01.nomeProduto,produto01.qntdProduto,produto01.price));
    }
}
