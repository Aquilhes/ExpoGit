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
public class App {

    public static void main(String[] args) {
        Atributos obj = new Atributos();
        String propietario = JOptionPane.showInputDialog(null, "propietario");
        String valor = JOptionPane.showInputDialog(null, "valor");
        String color = JOptionPane.showInputDialog(null, "color");
        String placa = JOptionPane.showInputDialog(null, "placa");
        String matriculado = JOptionPane.showInputDialog(null, "matriculado");
        String anio = JOptionPane.showInputDialog(null, "anio");
        int valorComercial = Integer.parseInt(valor);
        int anioF = Integer.parseInt(anio);

        obj.setPropietario(propietario);
        obj.setValorComercial(valorComercial);
        obj.setColor(color);
        obj.setMatriculado(matriculado);
        obj.setAnioFabricacion(anioF);

        JOptionPane.showMessageDialog(null, obj.datos() + "\n" + obj.calcularAnio() + "\n");
    }

}
