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
public class Cilindro extends Tridimensional {

    private double radio;

    public void SetRadio(double _radio) {
        radio = _radio;
    }

    public double GetRadio() {
        return radio;
    }

    public double CalcularVolumenCilindro() {
        this.CalcularVolumen(altura, radio);
        return GetVolumen();
    }
    public Cilindro(double _altura,double _radio){
    altura=_altura;
    radio=_radio;
    }
}
