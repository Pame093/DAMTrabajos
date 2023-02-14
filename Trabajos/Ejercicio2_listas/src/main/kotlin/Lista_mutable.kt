fun main(args: Array<String>) {

    val mutablemeses: MutableList<String> = mutableListOf("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre")

    mutablemeses.add("Diciembre")  //Añadimos un valor a la lista
    println (mutablemeses.add(0, "MESES:"))  //Añadimos un valor a la lista en la posicion que queremos
    println (mutablemeses.none()) //Nos devuelve un true si está vacía la lista
    println (mutablemeses.firstOrNull()) //Nos devolverá el primer campo, y si no hay, un null.
    println (mutablemeses.elementAtOrNull(6)) //El elemento del índice 2, si no hay, devolverá un null
    println (mutablemeses.lastOrNull())//Último valor de la lista o null
    

    for (item in mutablemeses) {  //nos devolvería el contenido de cada uno de los valores de la lista.
        println(item)
    }

    for ((indice, item) in mutablemeses.withIndex()) {  //la posición de cada uno de los valores la posicion y su contenido
        println("La posición $indice contiene $item")
    }



}
