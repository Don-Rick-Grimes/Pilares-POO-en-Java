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
public class Bidimensional {

    protected double area;
    private double semiperimetro; //para la area de un triangulo - formula de Heron
    private double altura; //altura de un triangulo

    public void SetArea(double _area) {
        area = _area;
    }

    public double GetArea() {
        return area;
    }

    public void SetSemiperimetro(double _semiperimetro) {
        semiperimetro = _semiperimetro;
    }

    public double GetSemiperimetro() {
        return semiperimetro;
    }

    public void SetAltura(double _altura) {
        altura = _altura;
    }

    public double GetAltura() {
        return altura;
    }

    public void CalcularArea(double Lado) {     //Cuadrado
        SetArea(Math.pow(Lado, 2));
    }

    public void CalcularArea(double Lado1, double Lado2) {     //Rectangulo
        SetArea(Lado1 * Lado2);

    }

    public void CalcularArea(double Lado1, double Lado2, double Lado3) {  //triangulo
        double s = CalcularSemiperimetro(Lado1, Lado2, Lado3);
        SetArea(Math.sqrt(s * (s - Lado1) * (s - Lado2) * (s - Lado3))); // Formula de Heron
    }

    public void CalcularArea(double LadoA, double LadoB, double LadoC, double LadoD) {     //Trapecio
        CalcularArea(LadoA - LadoB, LadoC, LadoD);
        SetArea(CalcularAltura(GetArea(), LadoA - LadoB) * (LadoA + LadoB) / 2);

    }

    public void CalcularAreaCirculo(double radio) {     //Circulo
        SetArea(Math.PI * Math.pow(radio, 2));
    }

    public double CalcularSemiperimetro(double Lado1, double Lado2, double Lado3) {
        SetSemiperimetro((Lado1 + Lado2 + Lado3) / 2);
        return GetSemiperimetro();
    }

    public double CalcularAltura(double AreaTriangulo, double BaseTriangulo) {  //calcula la altura de un triangulo, misma del trapecio que lo vontiene
        SetAltura((2 * AreaTriangulo) / 2);
        return GetAltura();
    }
}
