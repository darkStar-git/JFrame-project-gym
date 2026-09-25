package DAO;

import model.Usuario;

public class LoginDAO {

    /**
     * Valida o tipo de acesso do usuário.
     * @return Retorna o perfil ("PROFESSOR", "ALUNO", "ATENDENTE") ou "INVALIDO".
     */
    public String autenticar(Usuario usuario) {
        String user = usuario.getUsuario().trim();
        String pass = usuario.getSenha().trim();

        if (user.equalsIgnoreCase("professor") && pass.equalsIgnoreCase("prof123")) {
            return "PROFESSOR";
        } else if (user.equalsIgnoreCase("aluno") && pass.equalsIgnoreCase("aluno123")) {
            return "ALUNO";
        } else if (user.equalsIgnoreCase("atendente") && pass.equalsIgnoreCase("atendente123")) {
            return "ATENDENTE";
        }

        return "INVALIDO";
    }
}