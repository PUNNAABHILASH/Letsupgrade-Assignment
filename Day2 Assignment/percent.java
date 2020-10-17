import java.util.Scanner;
class percent{
public static void main(String args[]){

float percentage;
int maths;
float social;
float english,science,hindi;
System.out.println("enter marks:");
Scanner sc=new Scanner(System.in);
maths=sc.nextInt();
social=sc.nextFloat();
english=sc.nextFloat();
science=sc.nextFloat();
hindi=sc.nextFloat();
percentage=(maths+social+english+science+hindi)/5;
System.out.println("the percentage is:"+percentage);
if(percentage>90 && percentage<=100)
 {
   System.out.print("A grade with percentage"+" "+percentage);
   System.out.print(percentage);
 }
else if(percentage>80 && percentage<=90)
 {
   System.out.println("B grade with percentage"+" "+percentage);
   
 }
else if(percentage>70 && percentage<=80)
 {
   System.out.println("C grade with percentage"+" "+percentage);

 }
else if(percentage>60 && percentage<=70)
 {
   System.out.println("D grade with percentage"+" "+percentage);
 }
else if(percentage>50 && percentage<=60)
 {
   System.out.println("E grade with percentage"+" "+percentage);
 }
else
 {
   System.out.println("F grade with percentage"+" "+percentage);
 }
}
}