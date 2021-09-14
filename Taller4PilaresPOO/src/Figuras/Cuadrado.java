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
public class Cuadrado extends Bidimensional {

    private double lado;

    public void SetLado(double _lado) {
        lado = _lado;
    }

    public double GetLado() {
        return lado;
    }

    public double CalcularAreaCuadrado() {
        CalcularArea(lado);
        return GetArea();
    }
    public Cuadrado(double _lado){
    lado=_lado;
    }

}
