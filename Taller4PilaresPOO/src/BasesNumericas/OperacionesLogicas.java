/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasesNumericas;

/**
 *
 * @author janeth
 */
public class OperacionesLogicas {

    public int Not(int num) {
        if (num == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int And(int numA, int numB) {
        String tupla=""+numA+numB;
        switch (Integer.parseInt(tupla)) {
            case 00:
                return 0;
            case 01:
                return 0;
            case 10:
                return 0;
            default:
                return 1;
        }
    }

    public int Or(int numA, int numB) {
        String tupla=""+numA+numB;
        switch (Integer.parseInt(tupla)) {
            case 00:
                return 0;
            case 01:
                return 1;
            case 10:
                return 1;
            default:
                return 1;
        }
    }

    public int Xor(int numA, int numB) {
        String tupla=""+numA+numB;
        switch (Integer.parseInt(tupla)) {
            case 00:
                return 0;
            case 01:
                return 1;
            case 10:
                return 1;
            default:
                return 0;
        }
    }
}
