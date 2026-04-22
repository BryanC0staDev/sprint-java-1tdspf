package br.com.soulup.entities;

import javax.swing.*;

public class Login {
    private String senha;
    private String email;
    boolean contacriada = false ;

    //setter e Getter//


        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }


        public void configuraLogin(){
            while (!contacriada ){
            System.out.println("Para usar o nosso sistema, é nescessario que se cadastre, ou entre em sua conta\n\n Digite 1 para se Cadastrar!\n\n Digite 2 para Logar em sua Conta!");
            int escolha = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastro\n\n2-Login"));
                if (escolha == 1) {
                    System.out.println("Vamos te Cadastrar em nosso Sistema");
                    setEmail(JOptionPane.showInputDialog("Insira seu Email: "));
                    System.out.println("email = " + email);
                    setSenha(JOptionPane.showInputDialog("Digite sua Senha: "));
                    System.out.println("senha = " +senha);
                    System.out.println("Agora faça Login Usando seus dados\n\n");

                }

                else if (escolha == 2){
                    String checkagememail = JOptionPane.showInputDialog("Digite seu email:");
                    String checkagemsenha = JOptionPane.showInputDialog("Digite sua senha:");


                    if ((checkagememail.startsWith(getEmail())) && (checkagemsenha.startsWith(getSenha()))){
                        System.out.println("\n\nSeja Bem vindo\n\n\n\nAgora vamos completar seu Cadastro:\n\n  ");
                        contacriada = true;
                    }
                    else {
                        System.out.println("\n\nEmail ou Senha Invaliidos\n\n\n\n\n\n");


                    }
                }
            }
        }
}
