fun main() {
    val numbers = Array(10) { index ->
        index * index
    }

    var evenValues = ""
    var sum = 0
    var largest = numbers[0]

    for (index in numbers.indices) {
        println("numbers[$index] = ${numbers[index]}")

        if (numbers[index] % 2 == 0) {
            evenValues += "${numbers[index]} "
        }
        sum += numbers[index]
        if (numbers[index] > largest) {
            largest = numbers[index]
        }
    }
    println("\nEven values:")
    println(evenValues)
    println("\nSum: $sum")
    println("Largest value: $largest")
}
