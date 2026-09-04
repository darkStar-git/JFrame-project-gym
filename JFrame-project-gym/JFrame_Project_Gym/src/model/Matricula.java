package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Matricula {
    private int idMatricula;
    private Aluno aluno;
    private Plano plano;
    private Professor Professor;
    private LocalDate dataNasc;
    private String status;

    public Matricula(int idMatricula, Aluno aluno, Plano plano, Professor Professor) {
        this.idMatricula = idMatricula;
        this.aluno = aluno;
        this.plano = plano;
        this.Professor = Professor;
        this.dataNasc = LocalDate.now();
        this.status = "ATIVA";
    }

    public int getIdMatricula() { return idMatricula; }
    public Aluno getAluno() { return aluno; }
    public Plano getPlano() { return plano; }
    public Professor getInstrutor() { return Professor; }
    public LocalDate getDataMatricula() { return dataNasc; }
    public String getStatus() { return status; }

    public void setIdMatricula(int idMatricula) { this.idMatricula = idMatricula; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }
    public void setPlano(Plano plano) { this.plano = plano; }
    public void setProfessor(Professor Professor) { this.Professor = Professor; }
    public void setStatus(String status) { this.status = status; }

    public void cancelar() { this.status = "CANCELADA"; }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Matricula #" + idMatricula +
               "\n  Aluno    : " + aluno.getNome() +
               "\n  Plano    : " + plano.getTipo() +
               "\n  Professor: " + Professor.getNome() +
               "\n  Data Nascimento     : " + dataNasc.format(fmt) +
               "\n  Status   : " + status;
    }
}
