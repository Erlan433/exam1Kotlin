package lesson7

class Inventory{
    private val items: MutableList<Item> = mutableListOf()
    // private - Модификатор доступа, чтобы на список был доступен только через инвентарь
    // <Item> - указывает, что положить в список, можно исключительно объекты класса Item
    fun addItem(item: Item){
        // item - это параметр, который принимает метод и обрабатывает внутри себя
        // :Item - указывает, что в роли параметра можно положить только объекты класса Item
        items.add(item)
        // Добавляем переданный в параметре прдмет в список (инвентарь)
        // add - добавить в конец списка
        println("Предмет ${item.name} добавлен в инвентарь")
    }

    fun removeItem(item: Item): Boolean{
        // (): Boolean - указание какой тип данных функции после выполнения
        val removed = items.remove(item)
        // метод списка remove удаляет указанный элемент из списка возвращает true если нашел и удали в другом случае false
        if (removed){
            println("Предмет ${item.name} удален из списка")
        } else {
            println("предмет ${item.name} нельзя удалить из инвентаря")
        }

        return removed
    }
}