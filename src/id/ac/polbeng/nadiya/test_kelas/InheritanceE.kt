//nor nadiya
package id.ac.polbeng.nadiya.test_kelas

open class NewPerson {
    open var age: Int = 1
}

class CheckedPerson: NewPerson() {
    override var age: Int = 1
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Age cannot be negative")
        }
}

fun main() {
    val person = NewPerson()
    person.age = -5 // Masih bekerja, karena di kelas NewPerson tidak ada pengecekan

    val checkedPerson = CheckedPerson()

    // Penanganan pengecualian IllegalArgumentException
    try {
        checkedPerson.age = -5 // Melempar pengecualian IllegalArgumentException
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
