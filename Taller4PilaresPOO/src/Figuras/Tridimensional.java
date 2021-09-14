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
public class Tridimensional {

    protected double volumen;
    protected double altura;

    public void SetVolumen(double _volumen) {
        volumen = _volumen;
    }

    public double GetVolumen() {
        return volumen;
    }

    public void SetAltura(double _altura) {
        altura = _altura;
    }

    public double GetAltura() {
        return altura;
    }

    public void CalcularVolumen() {  // Cubo
        Cuadrado ObjCuadrado = new Cuadrado(altura);
        volumen = altura * ObjCuadrado.CalcularAreaCuadrado();
    }

    public void CalcularVolumen(double ladoBase) {//piramide de base cuadrada
        Cuadrado ObjCuadrado = new Cuadrado(ladoBase);
        volumen = altura * ObjCuadrado.CalcularAreaCuadrado() / 3;
    }

    public void CalcularVolumen(double altura, double radio) { //Cilindro 
        Circulo ObjCirculo = new Circulo(radio);
        volumen = altura * ObjCirculo.CalcularAreaCirculo();
    }
}
