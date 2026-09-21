package lesson06.homeworks

fun main() {
    defineSeason(3)
    calculatePetAge(5)
    chooseTransport(3)
    calculateBonus(1500)
    defineDocumentType("pdf")
    convertTemperature(25.0, 'C')
    recommendClothing(15)
    chooseMovieCategory(17)
}

// Задание 1: Определение сезона
fun defineSeason(month: Int) {
    if (month !in 1..12) {
        println("Некорректный номер месяца")
        return
    }

    when (month) {
        12, 1, 2 -> println("Зима")
        3, 4, 5 -> println("Весна")
        6, 7, 8 -> println("Лето")
        9, 10, 11 -> println("Осень")
    }
}

// Задание 2: Расчет возраста питомца
fun calculatePetAge(dogAge: Int) {
    if (dogAge < 0) {
        println("Возраст не может быть отрицательным")
        return
    }

    val humanAge = if (dogAge <= 2) {
        dogAge * 10.5
    } else {
        2 * 10.5 + (dogAge - 2) * 4
    }

    println(humanAge)
}

// Задание 3: Определение способа перемещения
fun chooseTransport(distance: Int) {
    if (distance < 0) {
        println("Длина маршрута не может быть отрицательной")
        return
    }

    when {
        distance <= 1 -> println("пешком")
        distance <= 5 -> println("велосипед")
        else -> println("автотранспорт")
    }
}

// Задание 4: Расчет бонусных баллов
fun calculateBonus(purchaseAmount: Int) {
    if (purchaseAmount < 0) {
        println("Сумма покупки не может быть отрицательной")
        return
    }

    val bonusPoints = if (purchaseAmount <= 1000) {
        purchaseAmount / 100 * 2
    } else {
        purchaseAmount / 100 * 3
    }

    println(bonusPoints)
}

// Задание 5: Определение типа документа
fun defineDocumentType(extension: String) {
    when (extension.lowercase()) {
        "txt", "doc", "docx", "pdf" -> println("Текстовый документ")
        "jpg", "jpeg", "png", "gif" -> println("Изображение")
        "xls", "xlsx", "csv" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

// Задание 6: Конвертация температуры
fun convertTemperature(temperature: Double, unit: Char) {
    when (unit.uppercaseChar()) {
        'C' -> {
            val fahrenheit = temperature * 9 / 5 + 32
            print(fahrenheit)
            print("F")
        }

        'F' -> {
            val celsius = (temperature - 32) * 5 / 9
            print(celsius)
            print("C")
        }

        else -> println("Некорректная единица измерения")
    }
}

// Задание 7: Подбор одежды по погоде
fun recommendClothing(temperature: Int) {
    when {
        temperature < -30 || temperature > 35 ->
            println("не выходить из дома")

        temperature < 10 ->
            println("куртка и шапка")

        temperature <= 18 ->
            println("ветровка")

        else ->
            println("футболка и шорты")
    }
}

// Задание 8: Выбор фильма по возрасту
fun chooseMovieCategory(age: Int) {
    if (age < 0) {
        println("Возраст не может быть отрицательным")
        return
    }

    when {
        age <= 9 -> println("детские")
        age <= 18 -> println("подростковые")
        else -> println("18+")
    }
}