package lesson7

class Inventory{
    private val items: MutableList<Item> = mutableListOf()
    // private - Модификатор доступа, чтобы на список был доступен только через инвентарь
    // <Item> - указывает, что положить в список, можно исключительно объекты класса Item
    fun addItem(item: Item){
        val existingItem = items.find { it.id == item.id }
        // item - это параметр, который принимает метод и обрабатывает внутри себя
        // :Item - указывает, что в роли параметра можно положить только объекты класса Item
        if (existingItem != null){
            existingItem.count += 1
        } else {
            items.add(item)
        }

        // Добавляем переданный в параметре предмет в список (инвентарь)
        // add - добавить в конец списка
        println("Предмет ${item.name} добавлен в инвентарь")
    }

    fun removeItem(item: Item): Boolean{
        val existingItem = items.find { it.id == item.id }
        // (): Boolean - указание какой тип данных функции после выполнения
        // метод списка remove удаляет указанный элемент из списка возвращает true если нашел и удали в другом случае false
        if (existingItem != null) {
            if (existingItem.count > 1) {
                // У предмета больше одного экземпляра, уменьшаем количество
                existingItem.count -= 1 // или existingItem.count = existingItem.count -1
                println("Количество предмета ${item.name} уменьшено на 1")
                return true // Указываем, что удаление произошло (частично)
            } else {
                // У предмета остался один экземпляр, удаляем его полностью
                val removed = items.remove(existingItem)
                if (removed) {
                    println("Предмет ${item.name} удален из списка")
                } else {
                    println("Предмет ${item.name} не найден в инвентаре (ошибка при удалении)")
                }
                return removed // Возвращаем true, если удаление успешно
            }
        } else {
            println("Предмет ${item.name} не найден в инвентаре")
            return false // Предмет не найден и не был удален
        }
    }

    fun inventoryPrint(){
        if (items.isEmpty()){
            println("Инвентарь пуст")
            return
        }

        print("Содержимое инвенторя: [")

        for (item in items){
            print("[id: ${item.id}, ${item.name}, ${item.description}, кол-во: ${item.count}]")
            //вывод индекса слота, в котором лежи предмет
            // вывод информации о типе предмета
            //вывод информации о количестве предмета в слоте
        }

        println("]")
    }
}