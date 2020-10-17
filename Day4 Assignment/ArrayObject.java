import java.util.Scanner;
import java.lang.*;
class Avenger{
public String name,weapon,planet,power;
public int age;
Scanner sc=new Scanner(System.in);
public void getDetails(){
System.out.println("enter avenger name:");
name=sc.next();
System.out.println("enter avenger weapon:");
weapon=sc.next();
System.out.println("enter avenger planet:");
sc.nextLine();
planet=sc.nextLine();
System.out.println("enter avenger age:");
age=sc.nextInt();
System.out.println("enter avenger power:");
power=sc.next();
}
public void displayDetails(){
System.out.println("the avenger name is"+" "+name+" "+"with age"+" "+age+" "+"with a weapon is"+" "+weapon+" "+"and he belongs to"+" "+planet +" "+"planet"+" "+"with a"+" "+power+" "+"power");
}
}
public class ArrayObject{
public static void main(String args[]){
Avenger[] e=new Avenger[5];
for(int i=0;i<5;i++){
e[i]=new Avenger();
}
for(int i=0;i<5;i++){
e[i].getDetails();
e[i].displayDetails();
}
}
}