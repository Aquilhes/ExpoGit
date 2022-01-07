/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Iván Ancallay <ivan.ancallay@gmail.com - www.contacsolutions.com>
 */
public class Atributos {

    String propietario, color, placa, matriculado;
    double valorComercial;
    int anioFabricacion;

    public Atributos() {
    }

    public Atributos(String propietario, String color, String placa, String matriculado, double valorComercial, int anioFabricacion) {
        this.propietario = propietario;
        this.color = color;
        this.placa = placa;
        this.matriculado = matriculado;
        this.valorComercial = valorComercial;
        this.anioFabricacion = anioFabricacion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(String matriculado) {
        this.matriculado = matriculado;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void Atributos(String propietario) {
        this.propietario = propietario;

        JOptionPane.showInternalMessageDialog(null, "Los datos son: ");
    }

    public String calcularAnio() {
        double anioActual = 2021 - anioFabricacion;
        if (anioActual >= 2) {
            return "No necesita revision";
        } else {
            return "Necesita revision";
        }
    }

    public String datos() {
        String información = "informacion:\n"
                + "propietario: " + propietario + "\n"
                + "valor: " + valorComercial + "\n"
                + "color: " + color + "\n"
                + "placa: " + placa + "\n"
                + "matricula: " + matriculado + "\n"
                + "año fabricacion: " + anioFabricacion + "\n";
        return información;
    }
}
