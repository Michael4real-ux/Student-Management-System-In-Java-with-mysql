package main;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to Student Management application");
        while(true){
            System.out.println("\n1.Add Student" +
                    "\n2.Show All Students+" +
                    "\n3.Get student based on roll number+" +
                    "\n4.Delete Student"+
                    "\n5.Update Student" +
                    "\n6.Exit");
            System.out.format("Enter choice: ");
            int ch=Integer.parseInt(scanner.nextLine());
            switch (ch){
                case 1:
                    System.out.println("Add Student");
                    System.out.format("Enter student name: ");
                    String name=scanner.nextLine();
                    System.out.format("Enter student college name: ");
                    String clgName=scanner.nextLine();
                    System.out.format("Enter city: ");
                    String city=scanner.nextLine();
                    System.out.format("Enter Percentage: ");
                    double percentage=Double.parseDouble(scanner.nextLine());

                    break;
                case 2:
                    System.out.println("Show all students ");

                    break;
                case 3:
                    System.out.println("Get student based on rollnumber");
                    System.out.format("Enter roll number");
                    int roll=Integer.parseInt(scanner.nextLine());


                    break;
                case 4:
                    System.out.println("Delete Student");
                    System.out.format("Enter roll number to delete: ");
                    int rollnum=Integer.parseInt(scanner.nextLine());

                    break;
                case 5:
                    System.out.println("Update the student");
                    System.out.println("\n1.Update name\n2.Update clgName");
                    System.out.format("Enter your choice: ");
                    int choice=Integer.parseInt(scanner.nextLine());
                    if(choice==1){
                        System.out.format("Enter roll number: ");
                        int rnum=Integer.parseInt(scanner.nextLine());
                        System.out.format("Enter new name: ");
                        String sname=scanner.nextLine();

                    }
                    break;
                case 6:
                    System.out.println("Thank You for using Student management application!!!");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choice..");
            }
        }
    }
}