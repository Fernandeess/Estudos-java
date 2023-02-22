/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author mfrodrigues2
 */
public class Produtos {
    public String nomeProduto;
    public Integer qntdProduto;
    public Double price;
    public void addProdutos(Integer estoque){
       this.qntdProduto+= estoque;
    }
    public void subProdutos(Integer estoque){
        this.qntdProduto-= estoque;
    }
}
