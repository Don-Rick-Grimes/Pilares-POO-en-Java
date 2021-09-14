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
public class Cubo extends Tridimensional {

    public double CalcularVolumenCubo() {
        this.CalcularVolumen();
        return GetVolumen();
    }
    public Cubo(double _altura){
    altura=_altura;
    }
}
