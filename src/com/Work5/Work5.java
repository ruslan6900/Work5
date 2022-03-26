package com.Work5;

public class Work5 {

    public static void main(String[] args) {
	// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        //2. Конструктор класса должен заполнять эти поля при создании объекта.
        //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        //4. Создать массив из 5 сотрудников.
        //Пример:
        //Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        //persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        //потом для каждой ячейки массива задаем объект
        //persArray[1] = new Person(...);
        //...
        //persArray[4] = new Person(...);
        //
        //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        OOP();
    }
    static void OOP () {

        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        emplArray[1] = new Employee("Masha Mashova", "Bugalter", "Masha@lol.com",890236446, 5000, 50);
        emplArray[2] = new Employee("Larisa Abramova", "Bugalter", "Latisa@lol.com",890236336, 4500, 32);
        emplArray[3] = new Employee("Boris Lohov", "IT", "Lohov00ass@lol.com",890451446, 3000, 23);
        emplArray[4] = new Employee("Masha Popova", "Director", "Director@lol.com",890236466, 7500, 42);
            for (int i = 0; i < emplArray.length; i++) {
                if (emplArray[i].getВозраст()<40) {
                    emplArray[i].info();
                }
        }
    }
}
