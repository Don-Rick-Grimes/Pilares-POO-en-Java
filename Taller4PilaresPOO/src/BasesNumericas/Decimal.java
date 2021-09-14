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
public class Decimal extends Binario {

    public int ConvertirABinario(int numDecimal) {
        String numBinAlReves = "";
        String numBinario = "";
        String vectorBinNumAlReves[];
        while (numDecimal > 0) {
            numBinAlReves += numDecimal % 2;
            numDecimal = numDecimal / 2;
        }
        vectorBinNumAlReves = numBinAlReves.split("");
        for (int i = (vectorBinNumAlReves.length - 1); i >= 0; i--) {
            numBinario += vectorBinNumAlReves[i];
        }
        return Integer.parseInt(numBinario);
    }

    public int ConvertirADecimal(int numBinario) {
        int vectorBinario[];
        vectorBinario = SepararNum(numBinario);
        int numDecimal = 0;
        for (int i = 0; i < vectorBinario.length; i++) {
            numDecimal += vectorBinario[i] * Math.pow(2, i);
        }
        return numDecimal;
    }

    public int NotDecimal(int numDecimal) {
        return ConvertirADecimal(NotBinario(ConvertirABinario(numDecimal)));
    }

    public int AndDecimal(int numDecimal1, int numDecimal2) {
        return ConvertirADecimal(AndBinario(ConvertirABinario(numDecimal1), ConvertirABinario(numDecimal2)));
    }

    public int OrDecimal(int numDecimal1, int numDecimal2) {
        return ConvertirADecimal(OrBinario(ConvertirABinario(numDecimal1), ConvertirABinario(numDecimal2)));
    }

    public int XorDecimal(int numDecimal1, int numDecimal2) {
        return ConvertirADecimal(XorBinario(ConvertirABinario(numDecimal1), ConvertirABinario(numDecimal2)));
    }

    public boolean VerificarRestriccionDecimal(int numDecimal) {

        return VerificarRestriccionBinario(ConvertirABinario(numDecimal));
    }
}
