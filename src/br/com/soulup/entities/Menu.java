package br.com.soulup.entities;

import br.com.soulup.entities.subEntities.Missoes;
import br.com.soulup.entities.subEntities.Tabela;
import br.com.soulup.main.TesteSistema;

import javax.swing.*;


public class Menu  {
private Tabela tabela = new Tabela();
private Missoes missoes = new Missoes();

    int escolha;
    private Usuario usuario;


    //setters e Getters//


    public Tabela getTabela() {
        return tabela;
    }

    public void setTabela(Tabela tabela) {
        this.tabela = tabela;
    }

    public Missoes getMissoes() {
        return missoes;
    }

    public void setMissoes(Missoes missoes) {
        this.missoes = missoes;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    //Instanciando Objetos//
    public Menu (Usuario usuario,Tabela tabela){
        this.usuario = usuario;
        this.tabela = tabela;

        tabela.setUsuario(usuario);
        tabela.setObjMissoes(missoes);
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
        } else if (escolha == 3) {
            tabela.setUsuario(usuario);
            tabela.posicaoTabela();

        } else if (escolha == 4) {
            missoes.contarPontos();
        }
        else if (escolha == 5 ){
            System.out.println("OK, SAINDO!, OBRIGADO POR PARTICIPAR!!!");
        }
        else{
            System.out.println("Opção Invalida!");
        }
    }
    }


}
