package br.com.arturribeiro.ondeeh.model

data class Endereco (
        val logradouro: String,
        val complemento: String,
        val bairro: String,
        val localidade: String,
        val uf: String
)