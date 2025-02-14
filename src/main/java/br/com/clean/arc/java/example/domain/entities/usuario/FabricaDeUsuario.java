package br.com.clean.arc.java.example.domain.entities.usuario;

import br.com.clean.arc.java.example.domain.vo.EnderecoVo;

import java.time.LocalDate;

public class FabricaDeUsuario {
    private Usuario usuario;

    public Usuario comNomeCpfNascimento(String nome, String cpf, LocalDate nascimento){
        this.usuario = new Usuario(cpf, nome, nascimento, "");
        return this.usuario;
    }

    public Usuario incluiEndereco(String cep, Integer numero, String complemento) {
        this.usuario.setEndereco(new EnderecoVo(cep, numero, complemento));
        return this.usuario;
    }

}
