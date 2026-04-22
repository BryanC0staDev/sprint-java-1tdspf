package br.com.soulup.entities.subEntities;

import javax.swing.*;

public class Missoes {
    private int pontos;
    private int contadorPontos = 0;
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


    public void missoes() {
        while (escolha != 5) {
            System.out.println(
                    "Escolha a Missao que deseja Fazer:\n\nobs: apenas é possivel concluir duas missões por dia." +
                            "\n1.Redução de CO2 (transporte publio ou que nao gere combustao) + 2 pontos" +
                            "\n2.Recolher Lixo da Rua + 4 pontos" +
                            "\n3.Reciclagem + 2 pontos" +
                            "\n4.Economizar água + 2 pontos" +
                            "\nOu Digite 5 para retornar ao menu Principal"

            );
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite a missao que deseja concluir"));

            if (contadorMissoes == 2) {
                System.out.println("Voce Atingiu o Limite de Missões! Meus Parabéns");
                System.out.println("Voltando ao Menu!");
                escolha = 5;


            } else {
                if (escolha == 1) {
                    System.out.println("Parabéns,você conclui a Missão de numero 1!!!  + 2 PONTOS!");
                    pontos = 2;
                    contadorPontos += pontos;
                    contadorMissoes++;
                } else if (escolha == 2) {
                    System.out.println("Parabéns,você conclui a Missão de numero 2!!!  + 4 PONTOS!");
                    pontos = 4;
                    contadorPontos += pontos;
                    contadorMissoes++;
                } else if (escolha == 3) {
                    System.out.println("Parabéns,você conclui a Missão de numero 3!!!  + 2 PONTOS!");
                    pontos = 2;
                    contadorPontos += pontos;
                    contadorMissoes++;
                } else if (escolha == 4) {
                    System.out.println("Parabéns,você conclui a Missão de numero 4!!!  + 2 PONTOS!");
                    pontos = 2;
                    contadorPontos += pontos;
                    contadorMissoes++;

                } else if (escolha == 5) {
                    System.out.println("Retornando ao Menu!");
                } else {
                    System.out.println("Opção Invalida");
                }

            }

        }
    }
}
