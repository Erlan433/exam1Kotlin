package lesson8

fun main(){
    val gameTime = GameTime()

    val player = Player(
        "Oleg",
        0.0,
        2.0
    )

    val enemy = Enemy(
        1,
        10.0,
        -1.0
    )

    println("Начальное положение персонажей: ")
    player.printPosition()
    enemy.printPosition()

    val maxBattleTimeSeconds = 5.0

    while (true){
        // Каждая итерация цикла - будет для нас игровым кадром
        gameTime.update()
        // Подсчет времени игрового

        val dt = gameTime.deltaTimeSeconds

        // Обновляем позиции объектов с учетом прошедшего времени
        player.update(dt)
        enemy.update(dt)

        //Вывод информации с форматированием
        println("Прошло времмени: ${"%.3f".format(gameTime.totalTimeSeconds)} сек")
        // %.3f - значит отобразить только 3 символа после запятой (если число 3.45463645 выведет: 3.454)
        // format(число которое надо отформатировать)

        player.printPosition()
        enemy.printPosition()

        //считает оставшееся рассстояние между игроком и врагом
        val distance = enemy.x - player.x

        if (distance <= 0.0){
            println("Игра завершена, цели достигли друг друга")
            break // прерывает выполните цикла while
        }

        if (gameTime.totalTimeSeconds >= maxBattleTimeSeconds) {
            println("Время боя истекло!")
            break
        }
    }
}