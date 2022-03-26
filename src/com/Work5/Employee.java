package com.Work5;

public class Employee {
    private String ФИО;
    private String Должность;
    private String email;
    private int Телефон;
    private int Зарплата;
    private int Возраст;

    public Employee(String ФИО,String Должность,String email,int Телефон,int Зарплата,int Возраст) {
        this.ФИО = ФИО;
        this.Должность = Должность;
        this.email = email;
        this.Телефон = Телефон;
        this.Зарплата = Зарплата;
        this.Возраст = Возраст;
    }

    public int getВозраст() {
        return Возраст;
    }

    public void info() {
        System.out.printf("Фио: %s, Должность: %s, email: %s, Телефон: %d, Зарплата: %d, Возраст: %d\n", ФИО, Должность, email, Телефон, Зарплата, Возраст);
    }




}
