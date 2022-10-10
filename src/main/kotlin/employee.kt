open class Employee(val name: String){
    fun sayHello(name: String){
        println("Hello $name, my name is ${this.name}")
    }
}

final class Manager(name: String) : Employee(name)
final class VicePresident(name: String) : Employee(name)

