class Student {
    var name : String = "Ayush" ;
    var age : Byte = 19 ;
}

fun main(args: Array<String>) {

    println("Hello Students") ;

    var object1 = Student() ;
    println("Name is : ${object1.name}") ;

    object1.name = "Harshit" ;

    println("Name is : " + object1.name) ;
}

