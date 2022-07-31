package br.com.dio.desafioPOO;

public abstract class Conteudo {

     protected static final  double XP_INICIAL = 10d;

     private String titulo;
     private String descricao;

     public abstract  double calculoXp();

     public String getTitulo() {
          return titulo;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public String getDescricao() {
          return descricao;
     }

     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }
}
