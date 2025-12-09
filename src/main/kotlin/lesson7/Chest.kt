package lesson7

class Chest {
    private val chestItems: MutableList<Item> = mutableListOf()

    fun addItem(item: Item){
        chestItems.add(item)
    }

    fun removeItem(item: Item): Boolean{
        val removed = chestItems.remove(item)
        if (!removed){
            println("предмет ${item.name} нельзя удалить из инвентаря")
        }

        return removed
    }

    fun open(player: Player){
        println("${player.name} открыл сундук!")

        print("Содержимое сундука: [")
        for (item in chestItems){
            println("[${item.name}, ${item.description}]")
        }
        println("]")

        for (item in chestItems){
            player.inventory.addItem(item)
            removeItem(item)
        }

        print("Содержимое сундука: [")
        for (item in chestItems){
            println("[${item.name}, ${item.description}]")
        }

        
    }
}