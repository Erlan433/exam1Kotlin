fun main(){

    // 1. вопрос: ПОДПИСАН !!!(возможно я вру, никому нельзя доверять!)


    // 2. задание
    val characterLevel: Int = 5
    if (characterLevel > 5){
        println("characterName - опытный Патапим")
    }else{
        println("characterName - еще зеленый")
    }


    // 3. задание
    for (n in 1..10){
        println("$n")
    }


    // 4. задание
    calculateExperience(4)


    // 5. задание
    val sword = Weapon("Меч", 25)
    sword.displayInfo()
}

fun calculateExperience(level: Int): Int{
    return level * 100
}

class Weapon(
    val name: String,
    val damage: Int
){
    fun displayInfo(){
        println("$name (Урон: $damage)")
    }
}

