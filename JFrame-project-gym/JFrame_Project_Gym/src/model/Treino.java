package model;

public class Treino {
    private String nomeAluno;
    private String objetivo;
    private String exercicios;

    public Treino(String nomeAluno, String objetivo, String exercicios) {
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
}