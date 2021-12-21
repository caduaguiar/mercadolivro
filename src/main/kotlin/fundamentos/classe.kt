package fundamentos

class classe {
}

class Pessoa(var nome: String, var idade: Int){
    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, idade: ${idade   }"
    }
}

class Carro(cor: String, anoFabricacao: Int, val dono: Dono){

}

class Dono(var nome: String, var idade: Int){

}

fun main(){
    var cadu = Pessoa("Cadu",  29)
    print(cadu)

    var carro = Carro("Branco", 2010, Dono("Cadu", 29))

}