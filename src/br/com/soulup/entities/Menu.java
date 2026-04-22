package br.com.soulup.entities;

import br.com.soulup.entities.subEntities.Missoes;
import br.com.soulup.entities.subEntities.Tabela;

public class Menu {
   private Tabela tabela;
   private Usuario usuario;
   private Missoes missoes;


    int escolha;


    public void opcoesMenu(){
    while (escolha != -1 ){
        System.out.println(
            "\nSeja bem vinda(o) " + usuario.getNome() +
            "\n1. Missões Diarias."+
            "\n2. Dados da Conta."+
            "\n3. Ranking." +
            "\n4. Pontos." +
            "\n-1. Sair!"
        );
        if (escolha == 1){


        }
    }
    }


}
