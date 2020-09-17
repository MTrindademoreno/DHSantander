interface IRecebivel {
    fun totalizaReceita(): Double
    fun t_String()


}


class Clienter(val nome: String, val codigo: Int) : RegistroRecebimentos() {
    val recebimentoCliente = mutableListOf<IRecebivel>()
    fun AdicionaRecebimentosCliente(o: IRecebivel) {
        recebimentoCliente.add(o)
        AdicionaRecebimentos(o)



    }

    fun ApresentarRecebimentoCliente() {
        println("o Cliente $nome de codigo $codigo fez o seguinte pedido:")
        for (r in recebimentoCliente) {
            r.t_String() // chamada do método abstrato
        }

    }
}

class ItemVenda(val produto: String, val quantidade: Int, val valor: Double) : IRecebivel {


    override fun totalizaReceita(): Double {

        return quantidade * valor

    }

    override fun t_String() {
        println("$produto------$quantidade-----$valor------Total----${totalizaReceita()}")

    }


}

open class ItemServico(val servico: String, val horas: Int, val precoHora: Double) : IRecebivel {


    override fun totalizaReceita(): Double {

        return horas * precoHora
    }

    override fun t_String() {
        println("$servico------$horas-------$precoHora-----Total-----${totalizaReceita()}")

    }


}

open class RegistroRecebimentos {


    val Recebimentos = mutableListOf<IRecebivel>()
    var Total: Double = 0.0
    open fun AdicionaRecebimentos(r: IRecebivel) {

        var receb = r.totalizaReceita()
        Total += receb

        Recebimentos.add(r)

    }

    open fun ApresentarRecebimentos() {

        println("Pedidos realizados:")
        for (r in Recebimentos) {
            r.t_String() // chamada do método abstrato
        }

        println("Valor total  :--------------------- $Total")

    }
}

fun main() {


    val pedido1 = ItemVenda("Martelo", 3, 30.0)
    val pedido2 = ItemVenda("Alicate", 6, 26.0)
    val pedido3 = ItemServico("Corte", 5, 10.0)
    val pedido4 = ItemServico("Solda", 15, 15.0)


    var registroRecebimentos = RegistroRecebimentos()

    var clientenovo = Clienter("marcio", 12)
    clientenovo.AdicionaRecebimentosCliente(pedido1)
    clientenovo.AdicionaRecebimentosCliente(pedido2)
    clientenovo.ApresentarRecebimentoCliente()


    registroRecebimentos.ApresentarRecebimentos()


}