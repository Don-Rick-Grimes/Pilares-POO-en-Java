/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaMatematica;

/**
 *
 * @author janeth
 */
public class OperacionesTrigonometricas extends OperacionesBasicas {

    public double Seno(double num) {
        return Math.sin(num * Math.PI / 180);
    }

    public double Coseno(double num) {
        return Math.cos(num * Math.PI / 180);
    }

    public double Tangente(double num) {
        return Math.tan(num * Math.PI / 180);
    }
}
