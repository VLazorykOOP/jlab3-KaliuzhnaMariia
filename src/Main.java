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
    }