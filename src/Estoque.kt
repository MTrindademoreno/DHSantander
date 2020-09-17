class Estoque (var nome: String, var qtdAtual:Int, var qtdMinima: Int) {


    init {
        if (qtdMinima < 0) {
            qtdMinima = 0
        }
        if (qtdAtual < 0) {
            qtdAtual = 0
        }
    }

    fun mudarNome(nome: String) {

    }

    fun mudarQtdMinima(qtdMinima: Int) {

    }

    fun repor(qtd: Int) {
        qtdAtual += qtd

    }

    fun darBaixa(qtd: Int) {
        qtdAtual -= qtd

    }

    fun mostra() {
        println("Produto ${nome}---Quantidade Mínima: ${qtdMinima} Qauantidade Atual ${qtdAtual} Precisa repor: ${precisaRepor()} ")

    }

    fun precisaRepor(): Boolean {
    return qtdAtual <= qtdMinima
    }
}







fun main(){
    val estoque =Estoque("copo",-4,-9)
    val estoque2 = Estoque("prato",10,11)
    val estoque3 = Estoque("caneca",12,9)
    estoque2.mostra()

}