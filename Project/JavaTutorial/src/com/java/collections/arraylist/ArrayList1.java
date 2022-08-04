package com.java.collections.arraylist;

import java.util.*;

public class ArrayList1 {

    public static class Student {
        int id, age;
        String name, city;

        public  Student(int id, String name, int age, String city) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public int getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String getCity() {
            return city;
        }

        public String toString() {
            return "[id=" + id + ", Name=" + name + ", Age=" + age +", City="+city +"]"+"\n";
        }
    }


    //Method for sorting the arrayList by city name..
    public static void sortByCity(ArrayList<Student> students) {

        students.sort((o1, o2)
                -> o1.getCity().compareTo(
                o2.getCity()));
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Kusum", 16, "BBSR");
        Student s2 = new Student(2, "Jitesh", 23, "BLSR");
        Student s3 = new Student(3, "Mitesh", 17, "BRMP");
        Student s4 = new Student(4, "Jyoti", 23, "Puri");
        Student s5 = new Student(5, "Rashmi", 26, "KDP");
        Student s6 = new Student(6, "Sourav", 25, "KDP");
        Student s7 = new Student(7, "Som", 15, "CTC");
        Student s8 = new Student(8, "Aryan", 21, "BRMP");
        Student s9 = new Student(9, "Piyush", 22, "BLSR");
        Student s10 = new Student(10, "Komal", 19, "BBSR");

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);

//  Sort the students by city name
        sortByCity(students);
      System.out.println(students);

//  Sort the students by age in reverse order
        

//  Print the students who from city Cuttack and Age greater than 10 and less than 18

        for (Student x:students) {
            if((x.city.equalsIgnoreCase("CTC")) && (x.age>10 && x.age<18)){
                System.out.println(x);

            }
        }

//  Delete the students where age is greater than 18

        Iterator<Student> x=students.iterator();
        while (x.hasNext()){
            Student s=x.next();
            if(s.age>18){
                x.remove();
                continue;
            }
            System.out.println(s);
        }
    }
}

