package br.com.clean.arc.java.example.domain.entity.usuario;

import br.com.clean.arc.java.example.domain.vo.EnderecoVO;

import java.time.LocalDate;

/**
 * Classe "Sem uso", mudei para o padrão de projeto Builder na Entidade de Dominio Usuario
 */
public class UsuarioBuilder {
    private Usuario usuario;

    public Usuario comNomeCpfNascimento(String nome, String cpf, LocalDate nascimento){
        this.usuario = new Usuario(cpf, nome, nascimento, "");
        return this.usuario;
    }

    public Usuario incluiEndereco(String cep, Integer numero, String complemento) {
        this.usuario.setEndereco(new EnderecoVO(cep, numero, complemento));
        return this.usuario;
    }

}
