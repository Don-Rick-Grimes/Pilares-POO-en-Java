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
public class Trapecio extends Bidimensional {

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;

    public Trapecio(double _ladoA, double _ladoB, double _ladoC, double _ladoD) {
        ladoA = _ladoA;
        ladoB = _ladoB;
        ladoC = _ladoC;
        ladoD = _ladoD;
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

    public void SetLadoD(double _ladoD) {
        ladoD = _ladoD;
    }

    public double GetLadoD() {
        return ladoD;
    }

    public double CalcularAreaTrapecio() {
        CalcularArea(ladoA, ladoB, ladoC, ladoD);
        return GetArea();
    }

}
