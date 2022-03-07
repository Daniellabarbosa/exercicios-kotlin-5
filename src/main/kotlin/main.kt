fun main () {

    try {
        val cliente = Cliente(
            nome = "" , endereco= "",
            telefone=""
        )

        while(true){

            println("\n***Menu***\n")

            println("1 - Adicione itens no carrinho")
            println("2 - Remove itens do carrinho")
            println("3 - Liste os itens do carrinho")
            println("Digite qualquer outro valor para sair")

            var opc = 0

            while (true){
                println("\nDigite a opção desejada: ")

                try {
                    opc = readLine()!!.toInt()
                    break
                }catch (e: Exception){
                    println("Valor inválido")
                }
            }

            when(opc){

                1 -> {
                    println("Digite o item a ser adicionado: ")
                    val item = readLine()!!
                    cliente.addCompra(item)
                }
                2 -> {
                    println("Digite o item a ser removido: ")
                    val item = readLine()!!
                    cliente.removeCompra(item)
                }

                3 -> cliente.listarCompras()

                else -> break

            }

        }

    }catch (e: Exception){
        println(e.message)
    }



    }


