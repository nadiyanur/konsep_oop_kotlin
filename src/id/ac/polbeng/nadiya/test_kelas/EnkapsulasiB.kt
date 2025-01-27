//nor nadiya
package id.ac.polbeng.nadiya.test_kelas

import java.util.*

class EmployeeA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field
    var name: String = _name
        get() {
            return field.uppercase(Locale.getDefault())
        }
        set(value) {
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Age must be greater than zero")
        }
}

fun main() {
    val emp = EmployeeA(1101, "Jono", 25)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")

    // Menangani pengecualian IllegalArgumentException
    try {
        emp.age = -1
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
