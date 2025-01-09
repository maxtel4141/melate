fun main() {
    println("Generador de Números para el Melate")
    
    // Function to generate 6 unique random numbers between 1 and 56
    fun generateNumbers(): Set<Int> {
        val numbers = mutableSetOf<Int>()
        while (numbers.size < 6) {
            val num = (1..56).random()
            numbers.add(num)
        }
        return numbers
    }

    // Generate user and winning numbers
    val userNumbers = generateNumbers()
    val winningNumbers = generateNumbers()

    // Display the generated numbers
    println("Números Generados: ${userNumbers.joinToString(", ")}")
    println("Números Ganadores: ${winningNumbers.joinToString(", ")}")

    // Compare numbers
    val matches = userNumbers.intersect(winningNumbers)
    val result = if (matches.size >= 2) {
        "¡Felicidades, ganaste! Coincidencias: ${matches.size}"
    } else {
        "¡Sigue participando! Coincidencias: ${matches.size}"
    }

    // Display the result
    println(result)
}
