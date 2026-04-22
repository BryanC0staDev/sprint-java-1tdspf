package br.com.soulup.main;

import br.com.soulup.entities.*;
import br.com.soulup.entities.subEntities.Tabela;

import javax.swing.*;


public class TesteSistema {
    //statics//


    static String texto(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    static double real(String real){
        return Double.parseDouble(JOptionPane.showInputDialog(real));
    }
    static int inteiro(String inteiro){
        return Integer.parseInt(JOptionPane.showInputDialog(inteiro));
    }


        public static void main(String[] args) {

            System.out.println(
                    "#####################################" +
                            "\nSeja Bem Vindo ao Soul Up!" +
                            "\n\nOque é este sistema?:" +
                            "\nEste sistema funciona a base de uma pontuação que aumenta \nde acordo com ações que contribuam para o nosso meio ambiente !"+
                            "\n\n#####################################\n\n\n ps: 'caso se esqueça da senha, apenas cadastre-se novamente!' "

            );

                Login login = new Login();
                login.configuraLogin();


//    public Usuario( String nome,int idade,String cpf,String sexo) {
            Usuario objusuario = new Usuario (
                    texto("Digite seu nome: "),
                    inteiro("Digite sua idade: "),
                    texto("Digite seu cpf: "),
                    texto("Digite seu sexo: ")
            );


            // public Endereco(String logradouro, int numero, String complemento, String cep, String cidade, String estado, String bairro) {
            Endereco endereco = new Endereco(
                    texto("Digite seu Logradouro: "),
                    inteiro("Digite o numero: "),
                    texto("Digite o Complemento: "),
                    texto("Digite o Cep: "),
                    texto("Digite a sua Cidade: "),
                    texto("Digite seu estado : "),
                    texto("Digite seu bairro: ")

            );
            objusuario.setEndereco(endereco);


            Menu menu = new Menu((objusuario));
            menu.opcoesMenu();


            Tabela tabela = new Tabela();






        }
    }


