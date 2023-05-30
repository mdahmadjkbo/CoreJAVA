//23-07-22
import java.util.Scanner;
class ReadName
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=input.nextLine();
        System.out.println("Enter your age");
        int age=input.nextInt();
        System.out.println("Enter your Con");
        long Con=input.nextLong();
        System.out.println("--------------");
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your Con is "+Con);
    }
}
//javac ReadName.java
//java ReadName
        