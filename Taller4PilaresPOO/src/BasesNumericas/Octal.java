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
public class Octal extends Binario {

    public int ConvertirABinario(int numOctal) {
        int vectorOctal[];
        String numBinario = "";
        vectorOctal = SepararNum(numOctal);
        for (int i = 0; i < vectorOctal.length; i++) {
            switch (vectorOctal[i]) {
                case 0:
                    numBinario += "000";
                    break;
                case 1:
                    numBinario += "001";
                    break;
                case 2:
                    numBinario += "010";
                    break;
                case 3:
                    numBinario += "011";
                    break;
                case 4:
                    numBinario += "100";
                    break;
                case 5:
                    numBinario += "101";
                    break;
                case 6:
                    numBinario += "110";
                    break;
                case 7:
                    numBinario += "111";
                    break;
            }
        }
        return Integer.parseInt(numBinario);
    }

    public int ConvertirAOctal(int numBinario) {
        int vectorBinario[];
        String tupla = "";
        int numOctal = 0;
        vectorBinario = SepararNum(numBinario);
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    tupla = "" + vectorBinario[0] + vectorBinario[1];
                    break;
                case 1:
                    tupla = "" + vectorBinario[2] + vectorBinario[3] + vectorBinario[4];
                    break;
                default:
                    tupla = "" + vectorBinario[5] + vectorBinario[6] + vectorBinario[7];
                    break;
            }
            switch (Integer.parseInt(tupla)) {
                case 000:
                    numOctal &= 0;
                    break;
                case 001:
                    numOctal &= 1;
                    break;
                case 010:
                    numOctal &= 2;
                    break;
                case 011:
                    numOctal &= 3;
                    break;
                case 100:
                    numOctal &= 4;
                    break;
                case 101:
                    numOctal &= 5;
                    break;
                case 110:
                    numOctal &= 6;
                    break;
                case 111:
                    numOctal &= 7;
                    break;
            }
        }
        return numOctal;
    }

    public int NotOctal(int numOctal) {
        return ConvertirAOctal(NotBinario(ConvertirABinario(numOctal)));
    }

    public int AndOctal(int numOctal1, int numOctal2) {
        return ConvertirAOctal(AndBinario(ConvertirABinario(numOctal1), ConvertirABinario(numOctal2)));
    }

    public int OrOctal(int numOctal1, int numOctal2) {
        return ConvertirAOctal(OrBinario(ConvertirABinario(numOctal1), ConvertirABinario(numOctal2)));
    }

    public int XorOctal(int numOctal1, int numOctal2) {
        return ConvertirAOctal(XorBinario(ConvertirABinario(numOctal1), ConvertirABinario(numOctal2)));
    }

    public boolean VerificarRestriccionOctal(int numOctal) {

        return VerificarRestriccionBinario(ConvertirABinario(numOctal));
    }
}
