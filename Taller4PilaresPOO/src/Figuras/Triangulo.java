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
public class Triangulo extends Bidimensional {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double _ladoA, double _ladoB, double _ladoC) {
        ladoA = _ladoA;
        ladoB = _ladoB;
        ladoC = _ladoC;
    }

    public void SetLadoA(double _ladoA) {
        ladoA = _ladoA;
    }

    public double GetLadoA() {
        return ladoA;
    }

    public void SetLadoB(double _ladoB) {
        ladoB = _ladoB;
    }

    public double GetLadoB() {
        return ladoB;
    }

    public void SetLadoC(double _ladoC) {
        ladoC = _ladoC;
    }

    public double GetLadoC() {
        return ladoC;
    }

    public double CalcularAreaTriangulo() {
        CalcularArea(ladoA, ladoB, ladoC);
        return GetArea();
    }
}
