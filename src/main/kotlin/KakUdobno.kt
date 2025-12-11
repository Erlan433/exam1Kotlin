import kotlin.random.Random

class Entiti(
    val name: String,
    var health: Int,
    var attack: Int
)

fun main() {
    val geroy = Entiti("герой", 100, Random.nextInt(10, 25))
    val monstr = Entiti("Монстр", 100, Random.nextInt(5, 30))
    var finish: Boolean = true
    var turn = true //true ход героя, false ход монстра
    while (finish){
        var shansKrit = Random.nextInt(1, 100)
        var shansProm = Random.nextInt(1, 100)
        if (geroy.health <= 0){
            println("Герой умер, монстр победил!")
            finish = false
        } else if(monstr.health <= 0){
            println("Монстр умер, герой победил!")
            finish = false
        } else {
            if (turn) {
                if (shansProm <= 20) {
                    println("герой промахнулся!")
                    turn = false
                } else if (shansKrit <= 30) {
                    monstr.health -= geroy.attack
                    println("герой нанес кртический удар монстру ${geroy.attack} урона, у монстра осталось ${monstr.health}")
                    geroy.attack = Random.nextInt(20, 35)
                    turn = false
                } else {
                    monstr.health -= geroy.attack
                    println("герой нанес монстру ${geroy.attack} урона, у монстра осталось ${monstr.health}")
                    geroy.attack = Random.nextInt(10, 25)
                    turn = false
                }
            } else {
                if (shansProm <= 20){
                    println("монстр промахнулся!")
                    turn = true
                } else if (shansKrit <= 30) {
                    geroy.health -= monstr.attack
                    println("монстр нанес критический урон герой ${monstr.attack} урона, у героя осталось ${geroy.health}")
                    monstr.attack = Random.nextInt(15, 40)
                    turn = true
                } else {
                    geroy.health -= monstr.attack
                    println("монстр нанес герой ${monstr.attack} урона, у героя осталось ${geroy.health}")
                    monstr.attack = Random.nextInt(5, 30)
                    turn = true
                }
            }
        }
    }
}