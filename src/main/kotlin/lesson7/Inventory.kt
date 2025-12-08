package lesson7

class Inventory{
    private val items: MutableList<Item> = mutableListOf()
    // private - Модификатор доступа, чтобы на список был доступен только через инвентарь
    // <Item> - указывает, что положить в список, можно исключительно объекты класса Item
    fun addItem(item: Item){
        val id = item.id
        // item - это параметр, который принимает метод и обрабатывает внутри себя
        // :Item - указывает, что в роли параметра можно положить только объекты класса Item
        if (item.count == 0){
            items.add(item)
        } else {

        }

        // Добавляем переданный в параметре предмет в список (инвентарь)
        // add - добавить в конец списка
        println("Предмет ${item.name} добавлен в инвентарь")
    }

    fun removeItem(item: Item): Boolean{
        val id = item.id
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

    fun inventoryPrint(){
        if (items.isEmpty()){
            println("Инвентарь пуст")
            return
        }

        print("Содержимое инвенторя: [")

        for (item in items){
            print("[id: ${item.id}, имя: ${item.name}, описание: ${item.description}, кол-во: ]")
            //вывод индекса слота, в котором лежи предмет
            // вывод информации о типе предмета
            //вывод информации о количестве предмета в слоте
        }

        println("]")
    }
}