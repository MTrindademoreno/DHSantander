open class Ingresso (var valor: Double = 100.0){
    open fun imprimeValor(){
        println(valor)

    }
}

open class Vip(valor:Double, var valorAdicional: Double): Ingresso(valor){
    constructor(valor: Double) : this(valor,50.0)
    fun rVip() {
        var iv =valor+valorAdicional
        println("ingresso Vip Valor:")
        println(iv)


    }

}
class Normal( valor: Double): Ingresso(valor){

    override fun imprimeValor() {
        println("ingresso Normal Valor:")
        super.imprimeValor()


    }
}

class CamaroteInferior(var adicionalCI:Double,valorAdicional: Double,valor: Double): Vip(valorAdicional,valor){
        fun imprimeCamarote(local: String){
        var ci = adicionalCI+valorAdicional+valor
        println("ingresso Camarote Inferior")
        println(ci)
            println("Cadeira Nº : $local")
    }

}

class CamaroteSuperior (var adicionalCS: Double,valorAdicional: Double,valor:Double):Vip(valorAdicional,valor){
    fun imprimeCamaroteSuperior (local:String){
        var cs = adicionalCS + valorAdicional + valor
        println("ingresso Camarote Superior")
        println(cs)
        println("Cadeira Nº : $local")

    }
}
fun main(){
    val ingresso = Ingresso()
    val normal = Normal(ingresso.valor)
    val ingressoVip = Vip(ingresso.valor)
    val camaroteInferior =CamaroteInferior(50.0,ingressoVip.valorAdicional,ingresso.valor)
    val camaroteSuperior = CamaroteSuperior(100.0,ingressoVip.valorAdicional,ingresso.valor)


println("-------------------INGRESSOS-----------------------------")
println("digite 1 para ingresso normal ou 2 para ingresso Vip")

    if(readLine() == "1"){
        normal.imprimeValor()
    }else{
       println("Digite 1 para Camarote Inferior ou 2 para Camarote Superior ou 3 para  Ingresso Vip")
        when(readLine()){

            "1" -> {println("digite o numero da cadeira ")
                var cadeira= readLine()
            camaroteInferior.imprimeCamarote(cadeira.toString())}

            "2" -> {  println("digite o numero da cadeira ")
                var cadeira1= readLine()
                camaroteSuperior.imprimeCamaroteSuperior(cadeira1.toString())}

             "3" -> {ingressoVip.rVip() }

        }

    }
}


//ok
