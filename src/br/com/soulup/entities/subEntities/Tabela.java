package br.com.soulup.entities.subEntities;

import br.com.soulup.entities.Usuario;

public class Tabela  {
    private Usuario usuario;
    private Missoes objMissoes = new Missoes();



    private int pontosUsuario = objMissoes.getContadorPontos();
    private int posicao;
    private String usuarioExemplo1 = "Igor Blacconaro Santos";
    private int pontosUsuarioExemplo1 = 4;
    private String usuarioExemplo2 = "Bryan Costa Silva";
    private int pontosUsuarioExemplo2 = 5;
    private  String usuarioExemplo3 = "Andrew Rodrigues Lima da Silva";
    private int  pontosUsuarioExemplo3 =6;
    private String usuarioExemplo4 = "Bryan Costa Silva";
    private int pontosUsuarioExemplo4= 0;





    //Setters e Getters//


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Missoes getObjMissoes() {
        return objMissoes;
    }

    public void setObjMissoes(Missoes objMissoes) {
        this.objMissoes = objMissoes;
    }

    public int getPontosUsuario() {
        return pontosUsuario;
    }

    public void setPontosUsuario(int pontosUsuario) {
        this.pontosUsuario = pontosUsuario;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public String getUsuarioExemplo1() {
        return usuarioExemplo1;
    }

    public void setUsuarioExemplo1(String usuarioExemplo1) {
        this.usuarioExemplo1 = usuarioExemplo1;
    }

    public int getPontosUsuarioExemplo1() {
        return pontosUsuarioExemplo1;
    }

    public void setPontosUsuarioExemplo1(int pontosUsuarioExemplo1) {
        this.pontosUsuarioExemplo1 = pontosUsuarioExemplo1;
    }

    public String getUsuarioExemplo2() {
        return usuarioExemplo2;
    }

    public void setUsuarioExemplo2(String usuarioExemplo2) {
        this.usuarioExemplo2 = usuarioExemplo2;
    }

    public int getPontosUsuarioExemplo2() {
        return pontosUsuarioExemplo2;
    }

    public void setPontosUsuarioExemplo2(int pontosUsuarioExemplo2) {
        this.pontosUsuarioExemplo2 = pontosUsuarioExemplo2;
    }

    public String getUsuarioExemplo3() {
        return usuarioExemplo3;
    }

    public void setUsuarioExemplo3(String usuarioExemplo3) {
        this.usuarioExemplo3 = usuarioExemplo3;
    }

    public int getPontosUsuarioExemplo3() {
        return pontosUsuarioExemplo3;
    }

    public void setPontosUsuarioExemplo3(int pontosUsuarioExemplo3) {
        this.pontosUsuarioExemplo3 = pontosUsuarioExemplo3;
    }

    public String getUsuarioExemplo4() {
        return usuarioExemplo4;
    }

    public void setUsuarioExemplo4(String usuarioExemplo4) {
        this.usuarioExemplo4 = usuarioExemplo4;
    }

    public int getPontosUsuarioExemplo4() {
        return pontosUsuarioExemplo4;
    }

    public void setPontosUsuarioExemplo4(int pontosUsuarioExemplo4) {
        this.pontosUsuarioExemplo4 = pontosUsuarioExemplo4;
    }

    public void posicaoTabela() {
        pontosUsuario = objMissoes.getContadorPontos();
        if ((pontosUsuario >= pontosUsuarioExemplo1) && (pontosUsuario >= pontosUsuarioExemplo2) && (pontosUsuario >= pontosUsuarioExemplo3) && (pontosUsuario>=pontosUsuarioExemplo4)) {
            System.out.println(
                    "\n1." + usuario.getNome() + " " + pontosUsuario + " Pontos"+
                            "\n2." + usuarioExemplo3 + " " + pontosUsuarioExemplo3 + " Pontos" +
                            "\n3." + usuarioExemplo2 + " " + pontosUsuarioExemplo2 + " Pontos" +
                            "\n4." + usuarioExemplo1 + " " + pontosUsuarioExemplo1 + " Pontos" +
                            "\n5." + usuarioExemplo4 + " " + pontosUsuarioExemplo4 + " Pontos"
            );
        }else if ((pontosUsuario < pontosUsuarioExemplo1) && (pontosUsuario >= pontosUsuarioExemplo2) && (pontosUsuario > pontosUsuarioExemplo3) && (pontosUsuario>pontosUsuarioExemplo4)){
            System.out.println(
                    "\n1." + usuarioExemplo3 + " " + pontosUsuarioExemplo3 + " Pontos" +
                    "\n2." + usuario.getNome() + " " + pontosUsuario + " Pontos"+
                    "\n3." + usuarioExemplo2 + " " + pontosUsuarioExemplo2 + " Pontos" +
                    "\n4." + usuarioExemplo1 + " " + pontosUsuarioExemplo1 + " Pontos" +
                    "\n5." + usuarioExemplo4 + " " + pontosUsuarioExemplo4 + " Pontos"
            );
            }else if ((pontosUsuario <= pontosUsuarioExemplo1) && (pontosUsuario <= pontosUsuarioExemplo2) && (pontosUsuario > pontosUsuarioExemplo3) && (pontosUsuario>pontosUsuarioExemplo4)){
        System.out.println(
                                "\n1." + usuarioExemplo3 + " " + pontosUsuarioExemplo3 + " Pontos" +
                                "\n2." + usuarioExemplo2 + " " + pontosUsuarioExemplo2 + " Pontos" +
                                "\n3." + usuario.getNome() + " " + pontosUsuario + " Pontos" +
                                "\n4." + usuarioExemplo1 + " " + pontosUsuarioExemplo1 + " Pontos" +
                                "\n5." + usuarioExemplo3 + " " + pontosUsuarioExemplo4 + " Pontos"
        );
    }
     else if ((pontosUsuario <= pontosUsuarioExemplo1) && (pontosUsuario <= pontosUsuarioExemplo2) && (pontosUsuario <= pontosUsuarioExemplo3) && (pontosUsuario > pontosUsuarioExemplo4)){
            System.out.println(
                                "\n1." + usuarioExemplo3 + " " + pontosUsuarioExemplo3 + " Pontos" +
                                "\n2." + usuarioExemplo2 + " " + pontosUsuarioExemplo2 + " Pontos" +
                                "\n3." + usuarioExemplo1 + " " + pontosUsuarioExemplo1 + " Pontos" +
                                "\n4." + usuario.getNome() + " " + pontosUsuario + " Pontos"+
                                "\n5." + usuarioExemplo4 + " " + pontosUsuarioExemplo4 + " Pontos"
        );
    }else if (pontosUsuario == 0){
            System.out.println("Voce tem 0 pontos");
        }
    }


}





