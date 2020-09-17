class Aluno(var Ra: String, var nome: String, var sobrenome: String) {


    fun assistirAula(materia: Materia) {

        println("O aluno ${this.nome}Assistindo aula ${materia.nome}")

    }

    fun fazerLicao(materia: Materia) {
        println("O aluno ${this.nome} está Fazendo lição de ${materia.nome}")
    }


}

class Aula(materia: Materia, var hinicio: Int, var htermino: Int) {

}


class Professor(var nome: String, var rd: String) : Docente {
    override fun darAula(materia: Materia) {
        println("O Professor ${this.nome} da aula de ${materia.nome} ")
    }

    override fun fazerChamada(materia: Materia) {
        println("o professor ${this.nome} faz chammada na aula de ${materia.nome}")
    }

}

class Curso(var nome: String, professor: Professor) {
    var listaAluno: MutableList<Aluno> = mutableListOf()
    var listaAula: MutableList<Aula> = mutableListOf()
    fun adicionaAluno(al: Aluno) {
        this.listaAluno.add(al)

    }

    fun adicionaAula(au: Aula) {
        this.listaAula.add(au)
    }

    fun listaAlunos() {

        listaAluno.forEach { println(it.nome) }
    }


}

class Turma(var nome: String, curso: Curso) {

}

class Materia(var nome: String) {


}

interface Docente {
    fun darAula(materia: Materia)

    fun fazerChamada(materia: Materia)
}


fun main() {


    val aluno1 = Aluno("663767ra", "marcio", "Jeremov")
    val aluno2 = Aluno("12312897089", "julio", "terra")
    val aluno3 = Aluno("3u4283", "gilberto", "silva")
    val aluno4 = Aluno("y58923789", "manoel", "batista")
    val professor1 = Professor("Svetlana Isackova", "123rd")
    val professor2 = Professor("joao", "1234rd")
    val professoor3 = Professor("mario", "12345rd")
    val professor4 = Professor("luiz", "123456rd")
    val materia1 = Materia("Linguagem de programaçao")
    val materia2 = Materia("Segurança da informaçao")
    val materia3 = Materia("Estrutura de dados")
    val materia4 = Materia("Algoritimo")
    val aula1 = Aula(materia1, 11, 12)
    val aula2 = Aula(materia2, 12, 13)
    val aula3 = Aula(materia3, 13, 14)
    val aula4 = Aula(materia4, 14, 15)
    val curso1 = Curso("Engenharia", professor1)


    curso1.adicionaAluno(aluno1)
    curso1.adicionaAluno(aluno2)
    curso1.adicionaAluno(aluno3)
    curso1.adicionaAluno(aluno4)
    curso1.adicionaAula(aula1)
    curso1.adicionaAula(aula2)
    curso1.adicionaAula(aula3)
    curso1.adicionaAula(aula4)

    aluno1.assistirAula(materia1)
    aluno2.fazerLicao(materia1)
    professor1.fazerChamada(materia1)
    professor2.darAula(materia2)
    curso1.listaAlunos()


}

//ok