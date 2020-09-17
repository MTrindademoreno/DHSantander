class Teste (var nome:String, var idade : Int)

class Calculo (idade: Int){
    var ano = 0
    init {
        ano = 2020 -idade
    }
}

fun main(){
    val teste = Teste("marcio ",9)
    println(teste.nome)
    val calculo = Calculo(10)
    println(calculo.ano)


}