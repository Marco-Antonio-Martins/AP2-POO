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
public class Carro {
    private String codigo, placa, marca, modelo, ano, descrição;
    private double valorDoBem;
    private boolean foiVendido=false;

    public Carro() {
    }

    public Carro(String codigo, String placa, String marca, String modelo, String ano, String descrição, double valorDoBem, boolean foiVendido) {
        this.codigo = codigo;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.descrição = descrição;
        this.valorDoBem = valorDoBem;
        this.foiVendido = foiVendido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getValorDoBem() {
        return valorDoBem;
    }

    public void setValorDoBem(double valorDoBem) {
        this.valorDoBem = valorDoBem;
    }

    public boolean isFoiVendido() {
        return foiVendido;
    }

    public void setFoiVendido(boolean foiVendido) {
        this.foiVendido = foiVendido;
    }
    
    public double calculaValorVenda(){
        return valorDoBem * 0.05;
    }


    @Override
    public String toString() {
        return "Carro{" + "codigo=" + codigo + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", descri\u00e7\u00e3o=" + descrição + ", valorDoBem=" + valorDoBem + ", foiVendido=" + foiVendido + '}';
    }
    
    
}
