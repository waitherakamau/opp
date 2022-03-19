fun main(){
    var me=Human("Effence",23,60)
    me.eat(3)
    println(me.weight)
    me.birthday()

    var w= user("Effence","Kamau","kamaue@gmail.com","o748103961","mommy567")
    println(w.firstName)
    println(w.email)





}

class Human(var name:String, var age:Int, var weight:Int) {
    fun eat(foodweight: Int) {
        weight += foodweight
        println("I am eating $foodweight kgs  of food")

    }

    fun speak(speech: String) {
        println(speech)
    }

    fun birthday() {
        age += 1
        println(age)

    }
}
data class user(var firstName:String,var lastName:String,var email:String,var phoneNumber :String,var password:String)





