package lesson08.homeworks

fun main() {

    // 1. Преобразование строк

    fun transformPhrase(phrase: String): String {
        var result = phrase

        if (result.contains("невозможно")) {
            result = result.replace(
                "невозможно",
                "совершенно точно возможно, просто требует времени"
            )
        }

        if (result.startsWith("Я не уверен")) {
            result += ", но моя интуиция говорит об обратном"
        }

        if (result.contains("катастрофа")) {
            result = result.replace("катастрофа", "интересное событие")
        }

        if (result.endsWith("без проблем")) {
            result = result.replace(
                "без проблем",
                "с парой интересных вызовов на пути"
            )
        }

        val words = result.trim().split(Regex("\\s+"))

        if (words.size == 1) {
            result = "Иногда, $result, но не всегда"
        }

        return result
    }

    println(transformPhrase("Это невозможно выполнить за один день"))
    println(transformPhrase("Я не уверен в успехе этого проекта"))
    println(transformPhrase("Произошла катастрофа на сервере"))
    println(transformPhrase("Этот код работает без проблем"))
    println(transformPhrase("Удача"))


    // 2. Извлечение даты и времени из строки лога

    val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"

    val rightPart = log.split("->")[1].trim()
    val dateAndTime = rightPart.split(" ")

    val date = dateAndTime[0]
    val time = dateAndTime[1]

    println(date)
    println(time)


    // 3. Маскирование номера кредитной карты

    val cardNumber = "4539 1488 0343 6467"

    val digitsToMask = cardNumber.count { it.isDigit() } - 4
    var maskedCount = 0

    val maskedCard = buildString {
        for (char in cardNumber) {
            if (char.isDigit() && maskedCount < digitsToMask) {
                append("*")
                maskedCount++
            } else {
                append(char)
            }
        }
    }

    println(maskedCard)


    // 4. Форматирование адреса электронной почты

    val email = "username@example.com"

    val formattedEmail = email
        .replace("@", " [at] ")
        .replace(".", " [dot] ")

    println(formattedEmail)


    // 5. Извлечение имени файла из пути

    val path = "C:/Пользователи/Документы/report.txt"

    val fileName = path.substring(path.lastIndexOf("/") + 1)

    println(fileName)


    // 6. Создание аббревиатуры из фразы

    val phrase = "Котлин лучший язык программирования"

    val words = phrase.split(" ")
    var abbreviation = ""

    for (word in words) {
        abbreviation += word[0]
    }

    println(abbreviation)
}