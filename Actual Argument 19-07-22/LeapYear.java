//23-07-22
import java.util.Scanner;
class LeapYear
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Year");
        int year=input.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0)
{
            System.out.println("It is a Leap Year "+year);
}
        else

{
            System.out.println("It is not a Leap Year");
} 
    }
}
//javac LeapYear.java
//java LeapYear