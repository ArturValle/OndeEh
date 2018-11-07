package br.com.arturribeiro.ondeeh.ui.pesquisa

import br.com.arturribeiro.ondeeh.base.BaseView
import br.com.arturribeiro.ondeeh.model.Endereco

interface PesquisaView : BaseView{

    fun atualizaEndereco(endereco: Endereco)

    fun showErro(erro:String)

    fun showLoading()

    fun hideLoading()


}