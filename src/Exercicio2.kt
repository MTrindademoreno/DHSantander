import kotlin.math.max

fun main(){
    retornaMaior()
    println(comparaTexto("agora compara", "agora nao compara"))
    inteiroPar(8)
    println(ComparaNum(1,2,3,4))
    imparesCem()
    cemPositivos()
    println(fatorial())
    


}

fun retornaMaior() {
    val list = listOf(1, 2, 0, 9, 8, 100, 52, 4)
    var maior = 0
    for (item in list) {
        if (maior < item) {
            maior = item
        }

    }
    println("o maior é $maior")
}



fun comparaTexto(texto1 :String, texto2: String):Boolean{
     return if (texto1==texto2)true else false


}


fun inteiroPar(x:Int){
    return if (x % 2 != 0) {
        println("Impar")}
else {
        println("par")    }

}


fun ComparaNum(numA:Int,numB:Int,numC:Int,numD:Int): Boolean{
    return (numA > numC && numA > numD || numB > numC && numB> numD)
}

fun imparesCem (){
    var count = 0
    while (count<= 100){
        if (count%2!=0){
        println(count)}
        count++
    }

}
fun cemPositivos(){
    var i = 1
    while (i <=100){
        println(i)
        i++
    }
}

fun fatorial ():Int {
    var num = 3
    var fatorial = 1
    if (num ==0){
        return 1
    }else{
        for (i in fatorial..num ){
            fatorial = fatorial * i

        }
        return fatorial
    }



}