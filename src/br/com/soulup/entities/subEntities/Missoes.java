package br.com.soulup.entities.subEntities;

public class Missoes {
    private int pontos;
    private  int contadorPontos = 0;
    private int contadorMissoes = 0;
    int escolha;

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getContadorPontos() {
        return contadorPontos;
    }

    public void setContadorPontos(int contadorPontos) {
        this.contadorPontos = contadorPontos;
    }

    public int getContadorMissoes() {
        return contadorMissoes;
    }

    public void setContadorMissoes(int contadorMissoes) {
        this.contadorMissoes = contadorMissoes;
    }



    public void  missoes(){
    while (contadorMissoes <4){
        System.out.println(
                "Escolha a Missao que deseja Fazer:" +
                        "\nRedução de CO2 (transporte publio ou que nao gere combustao) + 2 pontos" +
                        "\nRecolher Lixo da Rua + 4 pontos"+
                        "\nReciclagem + 2 pontos" +
                        "\n"

        );


    }

    }
}
