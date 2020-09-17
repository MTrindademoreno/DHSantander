import kotlin.random.Random

class Fatura() {
    var listaItens = mutableListOf<Item>()
    var dec = ""

    fun dec() {
        if (listaItens.size == 0) {
            println("Digite 1 para adicionar um item")
            dec = readLine().toString()
            compra()

        } else {
            println("Digite 1 para adicionar item ou 2 para fechar fatura")
            dec = readLine().toString()
            println("Total da fatura : ${getTotalFatura()}")
        }
    }

    fun compra() {
        while (dec == "1") {
            println("digite o item")
            var mitem = readLine().toString()
            println("digite a quantidade")
            var mqtd: Int = readLine()?.toInt() ?: 0
            println("digite o valor do item")
            var mpreco: Double = readLine()?.toDouble() ?: 0.0
            var mnitem = Random.nextInt()
            var mmitem = Item(mnitem, mitem, mqtd, mpreco)
            addItem(mmitem)
            dec()
            ImprimeFatura()
        }


    }

    fun addItem(elemento: Item) {
        listaItens.add(elemento)
    }

    fun getTotalFatura(): Double {
        var total = 0.0

        listaItens.forEach {

            total += it.preco * it.qtde
        }
        return total
    }


    fun ImprimeFatura() {
        var total = getTotalFatura()

        listaItens.forEach {
            println("Itens comprados:")
            println("Numero do Item${it.numItem} Descrição: ${it.descItem}, Quantidade compra${it.qtde}, Preço: ${it.preco} ")
        }

    }

}

class Item(var numItem: Int, var descItem: String, var qtde: Int, var preco: Double) {


    init {
        if (qtde < 0) {
            qtde = 0
        }
        if (preco < 0) {
            preco = 0.0
        }
    }


}

fun main() {

    val fat = Fatura()
    fat.dec()

}//ok