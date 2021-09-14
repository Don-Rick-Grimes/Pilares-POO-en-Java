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
public class PiramideBaseCuadrada extends Tridimensional {

    private double ladoBase;

    public void SetLadoBase(double _ladoBase) {
        ladoBase = _ladoBase;
    }

    public double GetLadoBase() {
        return ladoBase;
    }

    public double CalcularVolumenPiramideBC() {
        this.CalcularVolumen(ladoBase);
        return GetVolumen();
    }
    public PiramideBaseCuadrada(double _altura, double _ladoBase){
    altura=_altura;
    ladoBase=_ladoBase;
    }
}
