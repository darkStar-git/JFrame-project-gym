package model;

public class Treino {
    private String nomeAluno;
    private String objetivo;
    private String exercicios;
    private String cpfAluno;
    private String descricao;

    public Treino() {}

    // NOVO CONSTRUTOR: Adiciona este construtor com 2 parâmetros
    public Treino(String cpfAluno, String descricao) {
        this.cpfAluno = cpfAluno;
        this.descricao = descricao;
    }

    public Treino(String nomeAluno, String objetivo, String exercicios,String cpfAluno, String descricao) {
        this.cpfAluno = cpfAluno;
        this.descricao = descricao;
        this.nomeAluno = nomeAluno;
        this.objetivo = objetivo;
        this.exercicios = exercicios;
    }

    public String getNomeAluno() { return nomeAluno; }
    public void setNomeAluno(String nomeAluno) { this.nomeAluno = nomeAluno; }

    public String getObjetivo() { return objetivo; }
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }

    public String getExercicios() { return exercicios; }
    public void setExercicios(String exercicios) { this.exercicios = exercicios; }

    @Override
    public String toString() {
        return nomeAluno + " - " + objetivo;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}