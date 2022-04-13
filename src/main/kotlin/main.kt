fun main() {
    var myNameList = myNames(listOf("Dave","Faith","Grace","Jane","Lewis","Meek","Victor","Mercy","Fiona","Caroline"))
    var tall = myHeight(listOf(10,11,12,13,14,15))
    println(tall)
    var x = Person("Happiness", 23, 54, 55)
    var y = Person("Grace", 19, 40, 60)
    var z = Person("Frank", 24, 30, 44)
    var b = Person("David", 30, 45, 75)
    var myListPerson = mutableListOf(x,y,z,b)
    var peeps = myListPerson.sortedByDescending {person -> person.age}
    println(peeps)

    var e = Person("Wanda", 50, 45, 82)
    var f = Person("Njeri", 54, 43, 81)
    var fullList = mutableListOf(e,f)
    println(fullList.plus(myListPerson))


    var subaru = Vehicle("KBZ107L",23)
    var jeep = Vehicle("KCD230P",45)
    var mustang = Vehicle("KVT184D",34)
    var range = Vehicle("KJS345M",21)
    var locomotive = listOf(subaru, jeep, mustang, range)
    println(myVehicle(locomotive))
}


fun myNames(names: List<String>): List<String>{
    names.forEachIndexed { index, s ->
        if (index%2==0){
            println(s)
        }
    }
    return names
}

fun myHeight(height: List<Int>): String{
    var addition = height.sum()
    var average = height.average()
    var both = "$addition, $average"

    return both

}

data class Person(var names: String, var age: Int, var height:Int, var weight: Int){

}
fun Individual(people2:List<Person>): List<Any>{

    return listOf()
}

data class Vehicle(var registration: String, var mileage: Int, ){

}

fun myVehicle(taxi:List<Vehicle>):Int{
    var y = 0
    taxi.forEach { x -> x.mileage
        y+=x.mileage

    }
    var total = y/taxi.count()
    return total
}