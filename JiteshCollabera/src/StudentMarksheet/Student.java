package StudentMarksheet;

import java.util.Scanner;

public class Student {

    int id;
    String name;
    int totalMarks;
    int avg;
    int a[] = new int[6];
    Scanner sc=new Scanner(System.lineSeparator());
    void read() {
        System.out.println("Name of Student is ");
        name = sc.nextLine();
        System.out.println("ID of students ");
        id = sc.nextInt();
        System.out.println("Marks of all Subjects are ");

        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }
    }
        void calculate() {
            for (int i = 0; i < 6; i++) {

                totalMarks = totalMarks + a[i];
                int avg = totalMarks / 6;
            }
        }
        void display()
        {
            System.out.println("Name of Student "+name);
            System.out.println("Id of Student "+id);
            System.out.println(" Marks of Student "+totalMarks);
            System.out.println(" Marks of Student "+avg);
        }


    }
