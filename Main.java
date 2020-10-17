import java.lang.System;
class employee
{
String name;
int age;
String city;
void display()
{
System.out.println("my name is:"+name);
System.out.println("the age is:"+age);
System.out.println("the city is:"+city);
}
}
class Main{
public static void main(String args[]){
employee n=new employee();
n.name="abhilash";
n.age=19;
n.city="devarakonda";
n.display();
employee n1=new employee();
n1.name="rohith";
n1.age=20;
n1.city="hyderabad";
n1.display();
}
}