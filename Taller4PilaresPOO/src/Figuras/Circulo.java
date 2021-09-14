/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author janeth
 */
public class Circulo extends Bidimensional {

    private double radio;

    public Circulo(double _radio) {
        radio = _radio;
    }

    public void SetRadio(double _radio) {
        radio = _radio;
    }

    public double GetRadio() {
        return radio;
    }

    public double CalcularAreaCirculo() {
        CalcularAreaCirculo(radio);
        return GetArea();
    }
}
