package ru.mirea.lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ИНН (4 цифры)");
        try {
            int inn = sc.nextInt();
            if (inn > 9999 | inn < 1000) {
                System.out.println("Неправильный ИНН");
            }
            else {
                System.out.println(inn);
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неправильный формат ввода");
        }

        //Task 2
        System.out.println();
        System.out.println("Без сортировок");
        Students st = new Students();
        st.getStudents();

        System.out.println();
        System.out.println("Сортировка по ID");
        st.sortById();
        st.getStudents();

        System.out.println();
        System.out.println("Сортировка по Name");
        st.sortByName();
        st.getStudents();

        System.out.println();
        try {
            Student stu = st.find(sc.next());
            System.out.println(stu.idNumber_);
            System.out.println(stu.name_);
        } catch (NullPointerException e) {
            throw new NullPointerException("Student NOT found!");
        }
    }
}
