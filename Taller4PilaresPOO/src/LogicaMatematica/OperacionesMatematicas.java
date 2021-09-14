/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaMatematica;

/**
 * factorial, inverso, potencia y raíz enésima.
 *
 * @author janeth
 */
public class OperacionesMatematicas extends OperacionesTrigonometricas {

    public double Factorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public double Inverso(double num) {
        return (1 / num);
    }

    public double Potencia(double num, double potencia) {
        return (Math.pow(num, potencia));
    }

    public double RaizEnesima(double num, double n) {
        return (Math.pow(num, 1 / n));
    }


}
