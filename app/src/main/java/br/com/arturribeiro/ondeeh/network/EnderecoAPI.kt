package br.com.arturribeiro.ondeeh.network

import br.com.arturribeiro.ondeeh.model.Endereco
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoAPI {

    @GET("/ws/{cep}/json")
    fun pesquisar (@Path("cep")cep: String): Observable<Endereco>

}