class Driver{
public static void main(String[]args){
    Vehicle v=new Bike();//Runtime-Polymerisation
    System.out.println(v.getNoOfWheels());}
}