interface Imprimivel{
    var nome : String
    var tipoDocumento: String

    fun imprimir(){

    }
}
class Foto ( override var nome: String , override var tipoDocumento: String ):Imprimivel {

    override fun imprimir() {
        println( "Eu sou uma  $tipoDocumento")
    }
}
    class Documento() : Imprimivel {
        override var nome: String = "meu documento"
        override var tipoDocumento: String = "documento word"

        override fun imprimir() {
           println( "Eu sou um $tipoDocumento")
        }

    }

    class Contrato(override var nome: String = " Contrato1",
            override var tipoDocumento: String = "contrato") : Imprimivel {


        override fun imprimir(){
           println( "Sou um $tipoDocumento muito legal de nome $nome")
        }

    }


    class Impressora() {
        var listaimprimivel = mutableListOf<Imprimivel>()
        fun adiciona(obj: Imprimivel) {
            listaimprimivel.add(obj)

        }

        fun ImprimeTudo() {
            for (i in listaimprimivel){
                i.imprimir()
            }
        }
    }


    fun main() {
        val foto = Foto("minha foto", "Selfie")
        val doc = Documento()
        val cont = Contrato("meu contrato", "contrato")
        val impressora = Impressora()
        impressora.adiciona(foto)
        impressora.adiciona(doc)
        impressora.adiciona(cont)
        impressora.ImprimeTudo()
}
