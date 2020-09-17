open class Cliente(var numCliente: Int, var sobrenome: String, var rg: String, var cpf: String)
class Cheque(var valor: Double, var bancoEmissor: String, var dataPagamento: String)

open class Conta(var titular: Cliente, var saldo: Double) {
    open fun deposito(valorOp: Double) {
        saldo += valorOp
        println("Deposito realizado no valor de $valorOp o saldo é : $saldo")
    }

    open fun saque(valorOp: Double) {
        saldo -= valorOp
        if (saldo > valorOp) {
            saldo -= valorOp
            println("Saque realizado no valor de $valorOp o saldo é : $saldo")
        } else {
            println("Operação não realizada, saldo insuficiente")

        }
    }

    open fun saldo() {
        println(saldo)
    }
}


open class ContaCorrente(  var limiteCheque: Double, titular: Cliente, saldo: Double) :
    Conta(titular, saldo) {
    var aux = -1100.0

   constructor( titular: Cliente) : this( 1500.0, titular,1000.0)

    override fun deposito(valorOp: Double) {
        super.deposito(valorOp)
    }

    override fun saque(valorOp: Double) {
        if (saldo + limiteCheque > valorOp) {
            saldo -= valorOp
            println("Saque realizado no valor de $valorOp o saldo é : $saldo")
        } else {
            println("Operação não realizada, saldo insuficiente")

        }
    }

    override fun saldo() {
        if (saldo != aux) {
            aux = saldo
            if (saldo < 0) {
                var limitedisponivel = limiteCheque + saldo
                println(" o saldo é $saldo , o limite disponivel é $limitedisponivel")
            } else {
                println(" o saldo é $saldo , o limite disponivel é $limiteCheque")
            }

        } else {
            println("o Saldo é $saldo, o limite disponivel é $limiteCheque")
        }


    }

    fun depositoCheque(cheque: Cheque) {
        deposito(cheque.valor)


    }

}

class Poupança(var taxaJuros: Double, titular: Cliente, saldo: Double) : Conta(titular, saldo) {
    override fun deposito(valorOp: Double) {
        super.deposito(valorOp)
    }

    override fun saque(valorOp: Double) {
        if (saldo > valorOp) {
            saldo -= valorOp
            println("Saque realizado no valor de $valorOp o saldo é : $saldo")
        } else {
            println("Operação não realizada, saldo insuficiente")

        }

    }

    override fun saldo() {
        super.saldo()
    }

    fun recolheJuros() {
        var juros = saldo * (taxaJuros / 100)
        saldo = saldo + juros
        println("valor de $juros creditado referente aos juros/mês, o saldo é $saldo")

    }


}



fun main() {
    val cliente = Cliente(123, "Trindade", "1232435454", "12346578911")
    val conta = ContaCorrente (cliente)
    val conta2 = Poupança(3.0, cliente, 100.0)
    conta2.deposito(100.0)
    conta2.saldo()
    conta2.saldo()


}