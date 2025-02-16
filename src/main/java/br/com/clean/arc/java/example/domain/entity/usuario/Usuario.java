package br.com.clean.arc.java.example.domain.entity.usuario;

import br.com.clean.arc.java.example.domain.vo.EnderecoVO;

import java.time.LocalDate;

public class Usuario {

    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;

    private EnderecoVO endereco;

    public Usuario(Builder builder){
        this.cpf = builder.cpf;
        this.nome = builder.nome;
        this.nascimento = builder.nascimento;
        this.email = builder.email;
        this.endereco = new EnderecoVO(builder.cep, builder.numero, builder.complemento);
    }

    /**
     * Design Pattern Builder
     * Classe Builder (Estatica e Internar) para criar instâncias de Usuario.
     * Permite a construção passo a passo de objetos Usuario com atributos opcionais.
     *
     * Neste padrão os atributos da Classe Usuario deveriam ser FINAL, para a garantia de imutabilidade. Quando precisar
     */
    public static class Builder {
        private String cpf;
        private String nome;
        private LocalDate nascimento;
        private String email;
        private String cep;
        private Integer numero;
        private String complemento;

        public Builder(String cpf) {
            this.cpf = cpf;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder nascimento(LocalDate nascimento) {
            this.nascimento = nascimento;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public Builder numero(Integer numero) {
            this.numero = numero;
            return this;
        }

        public Builder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }

    }


    public EnderecoVO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoVO endereco) {
        this.endereco = endereco;
    }

    public Usuario(String cpf, String nome, LocalDate nascimento, String email) {
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("Cpf no padrão incorreto!");
        }

        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
