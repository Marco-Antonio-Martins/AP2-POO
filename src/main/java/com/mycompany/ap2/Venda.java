/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ap2;

/**
 *
 * @author marco
 */
public class Venda {
    private int codigo;
    private Cliente comprador;
    private Carro carroVendido;

    public Venda() {                  
    }

    public Venda(int codigo, Cliente comprador, Carro carroVendido) {
        this.codigo = codigo; 
        this.comprador = comprador;
        this.carroVendido = carroVendido;
        this.carroVendido.setFoiVendido(true);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Carro getCarroVendido() {
        return carroVendido;
    }

    public void setCarroVendido(Carro carroVendido) {
        this.carroVendido = carroVendido;
    }

    @Override
    public String toString() {
        return "Venda{" + "codigo=" + codigo + ", comprador=" + comprador + ", carroVendido=" + carroVendido + '}';
    }    
    
}
