import java.util.Scanner;
//import java.lang.*;
public class OddIntegers{
public static void main(String args[]){
int[] num=new int[5];
//num[0]=22;
//num[1]=21;
//num[2]=5;
//num[3]=7;
//num[4]=11;

Scanner sc=new Scanner(System.in);
int[] array=new int[5];
System.out.println("enter  5 integer numbers are:");
//System.out.println("the odd numbers are:");
for(int i=0;i<5;i++){
array[i]=sc.nextInt();
num[i]=array[i];
}
System.out.println("the odd numbers are:");
for(int i=0;i<5;i++){
if(num[i]%2==1)
{
System.out.println(+num[i]);
}
//System.out.println("the odd numbers are:"+num[i]);
}

}
}
