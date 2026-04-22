package br.com.soulup.main;

import br.com.soulup.entities.Endereco;
import br.com.soulup.entities.Login;
import br.com.soulup.entities.Tabela;
import br.com.soulup.entities.Usuario;

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
                            "\n\n#####################################\n\n\n ps: dados existentes:\n emailbase@gmail.com,senha: 000"

            );

                Login login = new Login();
                login.configuraLogin();



            Usuario usuario = new Usuario();
            Endereco endereco = new Endereco();
            Tabela tabela = new Tabela();








        }
    }


