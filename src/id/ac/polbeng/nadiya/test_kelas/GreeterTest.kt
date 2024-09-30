//nor nadiya
package id.ac.polbeng.nadiya.test_kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello Proggrammer"
    println(greeter.with_ret_val("Nadiya"))
}