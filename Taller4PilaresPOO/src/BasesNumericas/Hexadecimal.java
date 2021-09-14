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
public class Hexadecimal extends Binario {

    public int ConvertirABinario(String numHexadecimal) {
        String vectorHexadecimal[];
        String numBinario = "";
        vectorHexadecimal = SepararString(numHexadecimal);
        for (int i = 0; i < vectorHexadecimal.length; i++) {
            switch (vectorHexadecimal[i]) {
                case "0":
                    numBinario += "0000";
                    break;
                case "1":
                    numBinario += "0001";
                    break;
                case "2":
                    numBinario += "0010";
                    break;
                case "3":
                    numBinario += "0011";
                    break;
                case "4":
                    numBinario += "0100";
                    break;
                case "5":
                    numBinario += "0101";
                    break;
                case "6":
                    numBinario += "0110";
                    break;
                case "7":
                    numBinario += "0111";
                    break;
                case "8":
                    numBinario += "1000";
                    break;
                case "9":
                    numBinario += "1001";
                    break;
                case "A":
                    numBinario += "1010";
                    break;
                case "B":
                    numBinario += "1011";
                    break;
                case "C":
                    numBinario += "1100";
                    break;
                case "D":
                    numBinario += "1101";
                    break;
                case "E":
                    numBinario += "1110";
                    break;
                case "F":
                    numBinario += "1111";
                    break;
            }
        }
        return Integer.parseInt(numBinario);
    }

    public String ConvertirAHexadecimal(int numBinario) {
        int vectorBinario[];
        String tupla="";
        String numHexadecimal = "";
        vectorBinario = SepararNum(numBinario);
        for (int i = 0; i < 2; i++) {
            switch (i) {
                case 0:
                    tupla = ""+vectorBinario[0] + vectorBinario[1] + vectorBinario[2] + vectorBinario[3];
                    break;
                default:
                    tupla =""+ vectorBinario[4] + vectorBinario[5] + vectorBinario[6] + vectorBinario[7];
                    break;
            }
            switch (Integer.parseInt(tupla)) {
                case 0000:
                    numHexadecimal += "0";
                    break;
                case 0001:
                    numHexadecimal += "1";
                    break;
                case 0010:
                    numHexadecimal += "2";
                    break;
                case 0011:
                    numHexadecimal += "3";
                    break;
                case 0100:
                    numHexadecimal += "4";
                    break;
                case 0101:
                    numHexadecimal += "5";
                    break;
                case 0110:
                    numHexadecimal += "6";
                    break;
                case 0111:
                    numHexadecimal += "7";
                    break;
                case 1000:
                    numHexadecimal += "8";
                    break;
                case 1001:
                    numHexadecimal += "9";
                    break;
                case 1010:
                    numHexadecimal += "A";
                    break;
                case 1011:
                    numHexadecimal += "B";
                    break;
                case 1100:
                    numHexadecimal += "C";
                    break;
                case 1101:
                    numHexadecimal += "D";
                    break;
                case 1110:
                    numHexadecimal += "E";
                    break;
                case 1111:
                    numHexadecimal += "F";
                    break;
            }
        }
        return numHexadecimal;
    }

    public String[] SepararString(String numHexadecimal) {
        String numSeparado[];
        numSeparado = numHexadecimal.split("");
        return numSeparado;
    }

    public String NotHexadecimal(String numHexadecimal) {
        return ConvertirAHexadecimal(NotBinario(ConvertirABinario(numHexadecimal)));
    }

    public String AndHexadecimal(String numHexadecimal1, String numHexadecimal2) {
        return ConvertirAHexadecimal(AndBinario(ConvertirABinario(numHexadecimal1), ConvertirABinario(numHexadecimal2)));
    }

    public String OrHexadecimal(String numHexadecimal1, String numHexadecimal2) {
        return ConvertirAHexadecimal(OrBinario(ConvertirABinario(numHexadecimal1), ConvertirABinario(numHexadecimal2)));
    }

    public String XorHexadecimal(String numHexadecimal1, String numHexadecimal2) {
        return ConvertirAHexadecimal(XorBinario(ConvertirABinario(numHexadecimal1), ConvertirABinario(numHexadecimal2)));
    }

    public boolean VerificarRestriccionHexadecimal(String numHexadecimal) {

        return VerificarRestriccionBinario(ConvertirABinario(numHexadecimal));
    }

}
