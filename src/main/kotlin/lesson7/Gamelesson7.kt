package lesson7

class Player(
    val name: String
){
    val inventory = Inventory()
    val chest = Chest()
}

// Точка вход в программу
fun main(){
    val player = Player("Oleg")
    // Создание объекта класса Player - создание игрока
    println("Игрок ${player.name} зашел в игру")

    // Создание первого предмета в мире
    val sword = Item(
        1,
        "Меч железный",
        "Обычный и не самый надежный меч",
        50
    )

    val potion = Item(
        2,
        "Зелье здоровья",
        "Восстанавливает здоровье",
        20
    )

    // Добавляем предметы в инвентарь игрока
    player.inventory.addItem(sword)
    player.inventory.addItem(potion)
    player.chest.addItem(sword)
    player.chest.addItem(potion)
    //player.chest.addItem(hammer)
    // Отобразим инвентарь после подбора предмета в инвентарь
    player.inventory.inventoryPrint()
    player.inventory.findItemByName("Меч железный")
    player.inventory.findItemById(2)
    player.chest.open(player)
}