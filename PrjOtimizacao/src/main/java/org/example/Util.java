package org.example;

public class Util {

    public int validaFuncaoOjetivo(int coeficientes[][]){
        int menor = 0, c = 0;

        for(int coluna = 0; coluna < 6; coluna++){
            if(coeficientes[0][coluna] <= menor){
                menor = coeficientes[0][coluna];
                c = coluna;
            }
        }

        return c;
    }

    public boolean para(int coeficientes[][]){

        for(int coluna = 0; coluna < 6; coluna++){
            if(coeficientes[0][coluna] < 0){
                return false;
            }
        }

        return true;
    }

    public int obtemLinhaPivo(int coluna, int coeficientes[][]){
        int linha = 0, l = 0, menor = 100000;
        double aux = 0;

        try {

            for(linha = 1; linha < 4; linha++){
                if (coeficientes[linha][coluna] != 0) {
                    aux = coeficientes[linha][6] / coeficientes[linha][coluna];
                }
                System.out.println(aux);
                if(aux <= menor){
                    menor = (int)aux;
                    l = linha;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return l;
    }

    public void atualizaLinhas(int colunaPivo, int linhaPivo, int[][] coeficientes){
        for(int linha = 0; linha < 4; linha++){
            double c = coeficientes[linha][colunaPivo];
            for(int coluna = 0; coluna < 7; coluna++){
                if(!(linha == linhaPivo)){
                    coeficientes[linha][coluna] = (int) (coeficientes[linha][coluna] -( c * coeficientes[linhaPivo][coluna]));
                }
            }
        }

        for(int linha = 0; linha < 4; linha++){
            for(int coluna = 0; coluna < 7; coluna++){
                System.out.print(coeficientes[linha][coluna] + " ");
            }
            System.out.println("");
        }

    }

    public void atualizaSainteEntrante(String[] variaveisBasicas, String[] variaveis, int coluna, int linha){
        variaveisBasicas[linha] = variaveis[coluna];
    }

}
