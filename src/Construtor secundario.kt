class Construtor (val ferramentas: String, var funcionarios: Int){
    var prazo :Int = 0

    constructor(ferramentas: String,funcionarios: Int, teste:Int):this(ferramentas,funcionarios)//sempre referenciar o construtor primário

    constructor(ferramentas: String):this(ferramentas, 4)// ao reduzir a exigência de parâmetros é sempre necessário incluir um valor default?

    constructor(funcionarios: Int, prazo:Int): this("todas",funcionarios){// não é possivel inicializar o parametro "var prazo" como é feito no construtor principal
       this.prazo= prazo

    }
    fun prazo(){


        println("o prazo de entrega é de ${this.prazo} dias")// não é possivel utilizar o parametro prazo , pois não foi instanciado como as variaveis do primeiro parametro
    }
    fun construir(){
        println("ferramenta usada: $ferramentas, número de funcionários $funcionarios" )

    }
    fun reformar(){
        println( " Em reforma ,numero de funcionários ${funcionarios*2}")
    }
}

fun main(){
    val con = Construtor("martelo",3)
    con.construir()
    val con1 = Construtor("marreta")
    con1.construir()
    val con2 = Construtor("furadeira",8,7)
    con2.construir()
    val con3 = Construtor(5,10)
    con3.reformar()
    con3.prazo()



}