package lesson07.homeworks

fun main() {

    // 1. Числа от 1 до 5
    for (i in 1..5) {
        println(i)
    }

    // 2. Четные числа от 1 до 10
    for (i in 2..10 step 2) {
        println(i)
    }

    // 3. Числа от 5 до 1
    for (i in 5 downTo 1) {
        println(i)
    }

    // 4. Числа от 10 до 1, уменьшая на 2
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    // 5. Числа от 1 до 9 с шагом 2
    for (i in 1..9 step 2) {
        println(i)
    }

    // 6. Каждое третье число от 1 до 20
    for (i in 1..20 step 3) {
        println(i)
    }

    // 7. Числа от 3 до size, не включая size
    val size = 10

    for (i in 3 until size step 2) {
        println(i)
    }

    // 8. Квадраты чисел от 1 до 5
    var number = 1

    while (number <= 5) {
        println(number * number)
        number++
    }

    // 9. Уменьшение числа от 10 до 5
    var count = 10

    while (count >= 5) {
        count--
    }

    println(count)

    // 10. Числа от 5 до 1
    var i = 5

    do {
        println(i)
        i--
    } while (i >= 1)

    // 11. do while от 5 до 10
    var counter = 5

    do {
        println(counter)
        counter++
    } while (counter < 10)

    // 12. break при достижении 6
    for (i in 1..10) {
        if (i == 6) {
            break
        }

        println(i)
    }

    // 13. while с break при достижении 10
    var value = 1

    while (true) {
        println(value)

        if (value == 10) {
            break
        }

        value++
    }

    // 14. continue - пропускаем четные числа
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }

        println(i)
    }

    // 15. continue - пропускаем числа, кратные 3
    var current = 1

    while (current <= 10) {
        if (current % 3 == 0) {
            current++
            continue
        }

        println(current)
        current++
    }

    // Задачи повышенной сложности


    // 1. Таблица умножения
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j}\t")
        }
        println()
    }

    // 2. Сумма чисел от 1 до arg
    fun sumNumbers(arg: Int): Int {
        var sum = 0

        for (i in 1..arg) {
            sum += i
        }

        return sum
    }

    println(sumNumbers(10))

    // 3. Факториал числа
    fun factorial(arg: Int): Long {
        var result = 1L
        var number = 1

        while (number <= arg) {
            result *= number
            number++
        }

        return result
    }

    println(factorial(5))

    // 4. Сумма всех четных чисел от 2 до arg
    fun sumEvenNumbers(arg: Int): Int {
        var sum = 0
        var number = 2

        while (number <= arg) {
            sum += number
            number += 2
        }

        return sum
    }

    println(sumEvenNumbers(10))

    // 5. Прямоугольник 5x3 из символов *
    fun printRectangle() {
        var row = 1

        while (row <= 3) {
            var column = 1

            while (column <= 5) {
                print("*")
                column++
            }

            println()
            row++
        }
    }

    printRectangle()

    // 6. Сумма четных и нечетных чисел от 1 до arg
    fun sumEvenAndOdd(arg: Int) {
        var evenSum = 0
        var oddSum = 0

        for (i in 1..arg) {
            if (i % 2 == 0) {
                evenSum += i
            } else {
                oddSum += i
            }
        }

        println("Сумма четных: $evenSum")
        println("Сумма нечетных: $oddSum")
    }

    sumEvenAndOdd(10)
}