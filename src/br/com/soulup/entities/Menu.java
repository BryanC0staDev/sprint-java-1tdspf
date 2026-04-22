package br.com.soulup.entities;

import br.com.soulup.entities.subEntities.Missoes;
import br.com.soulup.entities.subEntities.Tabela;
import br.com.soulup.main.TesteSistema;

import javax.swing.*;


public class Menu extends TesteSistema {
   Tabela tabela;
   Missoes missoes = new Missoes();
   int escolha;
   private Usuario usuario;

    public Menu (Usuario usuario){
        this.usuario = usuario;
    }


    public void opcoesMenu(){
    while (escolha != 5 ){
        System.out.println(
            "\nSeja bem vinda(o) " +
            "\n1. Missões Diarias."+
            "\n2. Dados da Conta."+
            "\n3. Ranking." +
            "\n4. Pontos." +
            "\n5. Sair!"
        );
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Seja bem vinda(o)! \n Digite uma das opções a baixo para seguir com sua navegação" + "\n1.Missões Diarias.\n2.Dados da Conta.\n3.Ranking.\n4.Pontos.\n5.Sair!"));

        if (escolha == 1){
            missoes.missoes();
        } else if (escolha == 2) {
            usuario.cadastro();


        }
    }
    }


}
