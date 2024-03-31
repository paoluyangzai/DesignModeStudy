fun main(args: Array<String>) {
    val people = listOf(
        People("Alice",20),
        People("Bob",30),
        People("Charlie",40),
                People("Charliey",40)
    )
    val result = people.filter {
        it.age>25
    }.map {
        it.name.uppercase()+it.age
    }.reduce { acc, s ->
        "$acc$s-"
    }
    println(result)
}

data class People(val name:String,val age:Int){

}
