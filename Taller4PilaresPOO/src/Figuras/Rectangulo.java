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
public class Rectangulo extends Bidimensional {

    private double largo;
    private double ancho;

    public void SetLargo(double _largo) {
        largo = _largo;
    }

    public double GetLargo() {
        return largo;
    }

    public void SetAncho(double _ancho) {
        ancho = _ancho;
    }

    public double GetAncho() {
        return ancho;
    }
    public Rectangulo(double _largo, double _ancho){
    largo=_largo;
    ancho=_ancho;
    }

    public double CalcularAreaRectangulo() {
        CalcularArea(largo, ancho);
        return GetArea();
    }
}
