package br.com.clean.arc.java.example.domain.vo;

import br.com.clean.arc.java.example.domain.entity.usuario.Usuario;

import java.time.LocalDate;

public class EnderecoVO {
    private String cep;
    private Integer numero;
    private String complemento;

    public EnderecoVO(String cep, Integer numero, String complemento) {
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public EnderecoVO(Builder builder){
        this.setCep(builder.cep);
        this.setNumero(builder.numero);
        this.setComplemento(builder.complemento);
    }

    /**
     * Design Pattern Builder
     * Classe Builder (Estatica e Internar) para criar instâncias de Usuario.
     * Permite a construção passo a passo de objetos Usuario com atributos opcionais.
     *
     * Neste padrão os atributos da Classe Usuario deveriam ser FINAL, para a garantia de imutabilidade. Quando precisar
     */
    public static class Builder {
        private String cep;
        private Integer numero;
        private String complemento;

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

        public EnderecoVO build() {
            return new EnderecoVO(this);
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
