package lesson8

open class GameObject(
    // open - открыть класс для того, чтобы его можно было наследовать
    // Теперь можно делать дочерние классы от GameObject

    var x: Double, // x - позиция по координате X (горизонтально)

    var speed: Double // Скорость перемещения объекта (сколько юнитов пройдет объект за 1 секунду
){
    open fun update(deltaTimeSeconds: Double){
        // open внутри метода позволяет дочерним классом переопределить его (override)
        // Метод update - будет обновлять состояние объекта (то есть влиять на перемещение, бой и любое действие объекта

        x += speed * deltaTimeSeconds
        // Считаем сколько единиц(юнитов) по x должны пройти за delta времени
        // Пример:
        // speed = 2.0 (2 юнита/сек), a delta = 0.5 сек
        // тогда d = 2.0 * 0.5 (пойдет с такой скоростью и дельтой = 1 юнит за секунду)
    }
}

class Player(
    val name: String,
    x: Double,
    speed: Double
): GameObject(x, speed){
    // : GameObject - наследование родительского класса (x, speed) то свойство которые наследуются
    fun printPosition(){
        println("$name находиться в положение по x = $x")
    }
}

class Enemy(
    val id: Int,
    x: Double,
    speed: Double
): GameObject(x, speed){
    fun printPosition(){
        println("враг с id:$id находиться в положение по x = $x")
    }
}