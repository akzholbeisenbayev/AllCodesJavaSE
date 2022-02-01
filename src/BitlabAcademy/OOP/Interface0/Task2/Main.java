package BitlabAcademy.OOP.Interface0.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Staff staff1 = new Staff(1, "dfsf", "dfsf", 250000);
        Staff staff2 = new Staff(2, "aida", "dfsf", 300000);
        Staff staff3 = new Staff(3, "dfsf", "dfsf", 350000);
        Staff staff4 = new Staff(4, "dfsf", "dfsf", 380000);
        Staff staff5 = new Staff(5, "kaldfsfamkas", "dfsf", 320000);

        HRManagers manager1 = new HRManagers(6, "dfsf", 150000);
        HRManagers manager2 = new HRManagers(7, "dfsf", 170000);
        HRManagers manager3 = new HRManagers(8, "dfsf", 180000);
        HRManagers manager4 = new HRManagers(9, "dfsf", 190000);
        HRManagers manager5 = new HRManagers(10, "dfsf", 200000);

        Programmers programmer1 = new Programmers(11, "kkk", 500000, 50000, 0.1);
        Programmers programmer2 = new Programmers(12, "ddd", 550000, 70000, 0.2);
        Programmers programmer3 = new Programmers(13, "aaa", 558000, 78000, 0.5);
        Programmers programmer4 = new Programmers(14, "rrr", 600000, 100000, 0.7);
        Programmers programmer5 = new Programmers(15, "qqq", 650000, 150000, 0.8);

        Worker[] workers = {staff1, staff2, staff3, staff4, staff5, manager1, manager2, manager3, manager4, manager5, programmer1, programmer2, programmer3, programmer4, programmer5};

        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getSalary() > max) {
                max = workers[i].getSalary();
                index = i;
            }
        }
        System.out.println("Max Salary: " + workers[index].getWorkerData());

        System.out.println("-------------------------------------------");
        Worker[] temp = {programmer1};

        //150, 100, 90, 70w
        for (int i = 0; i < workers.length; i++) {
            for (int j = i + 1; j < workers.length; j++) {
                if (workers[i].getSalary() < workers[j].getSalary()) {
                    temp[0] = workers[i];
                    workers[i] = workers[j];
                    workers[j] = temp[0];
                }
            }
            System.out.println(workers[i].getWorkerData() + " ");
        }


    }
}