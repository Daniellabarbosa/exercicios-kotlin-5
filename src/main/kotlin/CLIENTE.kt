class Cliente(private val nome: String) {


        private var endereco = ""
        private var telefone = ""
        private var listaDeCompras = mutableListOf<String>()


        constructor(
                nome: String,
                endereco: String,
                telefone: String

        ) : this(nome) {
                this.endereco = endereco
                this.telefone = telefone


        }

        constructor(
                nome: String,
                endereco: String,
                telefone: String,
                listaDeCompras: MutableList<String>

        ) : this(nome, endereco, telefone) {
                this.listaDeCompras = listaDeCompras
        }


        init {
                if (nome.isEmpty()) {
                        throw Exception("Classe sendo instanciada de maneira incorreta!")
                } else {
                        println("Classe instanciada!")
                }
        }


        fun addCompra(item: String) {

                if (item.isEmpty()) {
                        println("Item Inválido")
                } else {
                        listaDeCompras.add(item)
                        println("Item adcionado")
                }

        }

        fun removeCompra(item: String) {
                if (item.isEmpty()) {
                        println("Item inválido")
                } else if (listaDeCompras.contains(item)) {
                        listaDeCompras.remove(item)
                        println("Item removido")
                }
        }

        fun listarCompras() {
                listaDeCompras.forEach {
                        println(it)
                }

        }
}

