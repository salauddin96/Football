fun main() {
    val input = readLine()!!
    if (isDangerous(input)) {
        println("YES")
    } else {
        println("NO")
    }
}

fun isDangerous(input: String): Boolean {
    // Initialize counters for consecutive players
    var consecutiveZeros = 0
    var consecutiveOnes = 0

    // Iterate through the input string
    for (char in input) {
        if (char == '0') {
            consecutiveZeros++
            consecutiveOnes = 0 // Reset consecutive ones
        } else {
            consecutiveOnes++
            consecutiveZeros = 0 // Reset consecutive zeros
        }

        // Check if there are seven consecutive players of the same team
        if (consecutiveZeros >= 7 || consecutiveOnes >= 7) {
            return true
        }
    }

    // If no dangerous situation is found
    return false
}
