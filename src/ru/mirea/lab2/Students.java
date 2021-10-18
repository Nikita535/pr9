package ru.mirea.lab2;

import java.util.ArrayList;

public class Students {
    private ArrayList<Student> arr = new ArrayList<>();
    Student st;
    static String[] names = new String[] { "Nikita", "Ivan", "Pasha", "Igor", "Sasha", "Ilya" };

    public Students() {
        for(int i=0;i<5;i++){
            int a=(int) (Math.random()*40+20);
            arr.add(new Student(a,names[i%names.length]));
        }
    }

    public void getStudents() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i).idNumber_ + "\t\t");
        }
        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i).name_ + "\t");
        }
        System.out.println();
    }

    public void sortById() {
        for(int i = 1; i < arr.size(); i++) {
            for(int j = i; j > 0 && arr.get(j-1).idNumber_ > arr.get(j).idNumber_; j--) {
                Student tmp = arr.get(j - 1);
                arr.set(j - 1, arr.get(j));
                arr.set(j, tmp);
            }
        }
    }

    public void sortByName() {
        for(int i = 1; i < arr.size(); i++) {
            for(int j = i; j > 0 && arr.get(j-1).name_.charAt(0) > arr.get(j).name_.charAt(0); j--) {
                Student tmp = arr.get(j - 1);
                arr.set(j - 1, arr.get(j));
                arr.set(j, tmp);
            }
        }
    }

    public Student find(String name) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).name_.equals(name)) {
                return arr.get(i);
            }
        }
        return null;
    }
}
