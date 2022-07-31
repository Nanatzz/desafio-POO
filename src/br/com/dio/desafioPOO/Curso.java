package br.com.dio.desafioPOO;

public class Curso extends  Conteudo{
    private int cargaHoraria;
    @Override
    public double calculoXp() {
        return XP_INICIAL + cargaHoraria;
    }
    public Curso() {
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
