package org.example;

public class Util {

    public int validaFuncaoOjetivo(int coeficientes[][]){
        int menor = 0, c = 0;

        for(int coluna = 0; coluna < 7; coluna++){
            if(coeficientes[0][coluna] <= menor){
                menor = coeficientes[0][coluna];
                c = coluna;
            }
        }

        return c;
    }

    public int obtemLinhaPivo(int coluna, int coeficientes[][]){
        int linha = 0, l = 0, menor = 100000;

        for(linha = 1; linha < 4; linha++){
            coeficientes[linha][6] = coeficientes[linha][6] / coeficientes[linha][coluna];
            System.out.println(coeficientes[linha][6]);
            if(coeficientes[linha][6] <= menor){
                menor = coeficientes[linha][6];
                l = linha;
            }
        }

        return l;

    }


}
