package br.com.minhaempresa.buscadordecep.principal;

public record Endereco(String logradouro, String cep, String localidade,
                       String bairro, String complemento, String uf) {
}
