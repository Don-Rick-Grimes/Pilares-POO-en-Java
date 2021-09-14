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
public class Binario extends OperacionesLogicas {

    private int vectorA[];
    private int vectorB[];

    public void SetVectorA(int[] _vectorA) {
        vectorA = _vectorA;
    }

    public int[] GetetVectorA(int numBinario) {
        return vectorA;
    }

    public void SetVectorB(int[] _vectorB) {
        vectorB = _vectorB;
    }

    public int[] GetetVectorB(int numBinario) {
        return vectorB;
    }

    public int NotBinario(int numBinario) {
        vectorA = SepararNum(numBinario);
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = Not(vectorA[i]);
        }
        return ConcatenarVector(vectorA);
    }

    public int AndBinario(int numBinario1, int numBinario2) {
        vectorA = SepararNum(numBinario1);
        vectorB = SepararNum(numBinario2);
        int vector[];
        int cond;
        if(vectorA.length>vectorB.length){
        cond=vectorA.length;
        }
        else{
        cond=vectorB.length;
        }
        
        for (int i = 0; i < cond;i++) {
            vectorA[i] = And(vectorA[i], vectorB[i]);
        }
        return ConcatenarVector(vectorA);
    }

    public int OrBinario(int numBinario1, int numBinario2) {
        vectorA = SepararNum(numBinario1);
        vectorB = SepararNum(numBinario2);
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = Or(vectorA[i], vectorB[i]);
        }
        return ConcatenarVector(vectorA);
    }

    public int XorBinario(int numBinario1, int numBinario2) {
        vectorA = SepararNum(numBinario1);
        vectorB = SepararNum(numBinario2);
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = Xor(vectorA[i], vectorB[i]);
        }
        return ConcatenarVector(vectorA);
    }

    public int[] SepararNum(int num) {
        String vectorNumString[];
        vectorNumString = ("" + num).split("");
        int vectorNumInt[] = new int[vectorNumString.length];
        for (int i = (vectorNumString.length - 1); i >= 0; i--) {
            vectorNumInt[i] = Integer.parseInt(vectorNumString[i]);
        }
        return vectorNumInt;
    }

    public int ConcatenarVector(int[] _vector) {
        String numConcatenado = "";
        for (int i = 0; i < _vector.length; i++) {
            numConcatenado += _vector[i];
        }
        return Integer.parseInt(numConcatenado);
    }

    public boolean VerificarRestriccionBinario(int numBinario) {
        return numBinario <= 11111111;
    }
}
