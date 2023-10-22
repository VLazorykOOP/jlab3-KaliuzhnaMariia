import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Java Lab 3 ");
        System.out.println("Enter the number of task: ");
        int choice = s.nextInt();
        switch (choice){
            case 1: {
                Task1();
                break;
            }
            case 2:{
                Task2();
                break;
            }
            case 3:{

                break;
            }
            default:{
                System.out.println("No such task. Please choose from 1 to 3!");
            }
        }
    }
    public static void Task1(){
        Student s1 = new Student("Leo", "Maxwell", 1, 2, 241);
        Professop p1 = new Professop("Fred", "Weiss", 2, 5);
        HeadOfDepartment h1 = new HeadOfDepartment("Rebecca", "Banks", 3, 10,"Computer Science");
        String sinfo = s1.toString();
        System.out.println(sinfo);
        String pinfo = p1.toString();
        System.out.println(pinfo);
        String hinfo = h1.toString();
        System.out.println(hinfo);
        List<Person> personList = new ArrayList<>();
        personList.add(s1);
        personList.add(p1);
        personList.add(h1);
        System.out.println(personList);
    }

    public static void Task2(){
        Date d1 = new Date(2022, 04, 30);
        Date d2 = new Date(2005, 11, 26);
        System.out.println("First:  " + d1);
        System.out.println("Second:  " + d2);
        Date d3 = d1.increment();
        System.out.println("Is Date 1 equal to Date 2: " + d1.equals(d2));
        System.out.println("Date 1 after increment: " + d3);
        Time t1 = new Time(18, 59, 58);
        Time t2 = new Time(20, 15, 05);
        System.out.println("First:  " + t1);
        System.out.println("Second:  " + t2);
        Time t3 = t1.increment();
        System.out.println("Is Date 1 equal to Date 2: " + t1.equals(t2));
        System.out.println("Time 1 after increment: " + t3);
        List<Triad> triadList = new ArrayList<>();
        triadList.add(d1);
        triadList.add(d2);
        triadList.add(d3);
        triadList.add(t1);
        triadList.add(t2);
        triadList.add(t3);
        System.out.println(triadList);
    }
    }