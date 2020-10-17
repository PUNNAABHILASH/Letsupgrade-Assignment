import java.util.Scanner;
class employee{
public String empname;
public int birthdate,birthmonth,birthyear,age,days,month,year;
public int monthlysal,annualsal,tax;
void display(){
System.out.println("name of employee:"+empname);
System.out.println("the age is:"+year+" "+"years"+" "+month+" "+"months"+" "+days+" "+"days");
System.out.println("annual salary is:"+annualsal);
System.out.println("the tax amount is he is paying:"+tax);
}
}
class tax{
public static void main(String args[]){
int currentyear,currentmonth,currentdate;
employee e=new employee();
Scanner sc=new Scanner(System.in);
System.out.println("enter employee name:");
e.empname=sc.nextLine();
System.out.println("enter employee birthdate:"); 
e.birthdate=sc.nextInt();
System.out.println("enter employee birthmonth:");
e.birthmonth=sc.nextInt();
System.out.println("enter employee birthyear:");
e.birthyear=sc.nextInt();
System.out.println("enter employee montly salary:");
e.monthlysal=sc.nextInt();
e.annualsal=e.monthlysal*12;
System.out.println("enter current year:");
currentyear=sc.nextInt();
System.out.println("enter current month:");
currentmonth=sc.nextInt();
System.out.println("enter current date:");
currentdate=sc.nextInt();
e.year=(currentyear-e.birthyear);
e.month=(currentmonth-e.birthmonth);
e.days=(currentdate-e.birthdate);
if(e.annualsal>=500000)
{
 e.tax=(e.annualsal)*20/100;
 System.out.println("you have to pay:"+e.tax +" " +"tax");
}
if( e.annualsal>=400000   && e.annualsal<500000 )
{
 e.tax=(e.annualsal)*15/100;
 System.out.println("you have to pay:" +e.tax +" " +"tax");
}
if(e.annualsal>=300000  && e.annualsal<400000)
{
 e.tax=(e.annualsal)*10/100;
 System.out.println("you have to pay:" +e.tax +" "+"tax");
}
if(e.annualsal>=200000  && e.annualsal<300000)
{
 e.tax=(e.annualsal)*5/100;
 System.out.println("you have to pay:" +e.tax+" "+"tax");
}

e.display();

}
}