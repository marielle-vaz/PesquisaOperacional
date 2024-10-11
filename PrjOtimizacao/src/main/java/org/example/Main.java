package org.example;

import java.net.StandardSocketOptions;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Util u = new Util();

        int coeficientes[][] = {
                {1, -3, -2, 0, 0, 0, 0},
                {0,  2,  1, 1, 0, 0, 100},
                {0,  1,  1, 0, 1, 0, 80},
                {0,  1,  0, 0, 0, 1, 40}
        };

        String variaveisBasicas[] = {"z", "f1", "f2", "f3"};

        String variaveis[] = {"z", "x1", "x2", "f1", "f2", "f3"};

        int coluna = u.validaFuncaoOjetivo(coeficientes);

        if(coluna == 0){
            System.out.println("A matriz está otimizada!");
        } else {
            System.out.println("A coluna que possui o menor número é: " + coluna);
        }

        int linhaPivo = u.obtemLinhaPivo(coluna, coeficientes);

        System.out.println("Linha pivô: " +linhaPivo);



        u.atualizaLinhas(coluna, linhaPivo, coeficientes);


    }

    /*
    @Override
    public String toString() {
        return  "coeficientes=" + Arrays.deepToString(coeficientes) +
                "\nvariaveisBasicas=" + Arrays.toString(variaveisBasicas) +
                "\nvariaveis=" + Arrays.toString(variaveis);
    }*/

}