import java.util.Scanner;

public class QuizApp{
public static void main(String args[]){
Game g=new Game();
g.initGame();
g.play();

}
}
 class Question{
String question,option1,option2,option3,option4;
int userAnswer,correctans;
Scanner sc=new Scanner(System.in);
public boolean askQuestion(){
System.out.println(question);
System.out.println("1. " +option1);
System.out.println("2. "+option2);
System.out.println("3. "+option3);
System.out.println("4. "+option4);
System.out.println("enter user answer:");
userAnswer=sc.nextInt();
if(userAnswer==correctans){
  return true;
}
  return false;
}
}
class Player{
String name;
int score=0;
Scanner sc=new Scanner(System.in);
public void getDetails(){
System.out.println("Enter player name:");
  name=sc.next();  
}
}
 class Game{

 String[] questiondata={"who is strongest avenger?","what is capital of india?","what is closest planet to sun?","who is father of our nation?","where is charminar Loacted?"};
 String[] option1={"Thor","Hyderabad","earth","Mahathma Gandi","Jaipur"};
String[] option2={"Hulk","Delhi","venus","Subash chandrabose","gujarath"};
String[] option3={"Dr.Strange","Jaipur","mercury","jawahralal nehru","Hyderabad"};
String[] option4={"Iron man","manipur","jupiter","none","manipur"};
int[] ans={1,2,3,1,3};
Question[] questions=new Question[5];
public void initGame()
{
for(int i=0;i<5;i++)
{
questions[i]=new Question();
questions[i].question=questiondata[i];
questions[i].option1=option1[i];
questions[i].option2=option2[i];
questions[i].option3=option3[i];
questions[i].option4=option4[i];
questions[i].correctans=ans[i];

} 



//questions[0].question="who is strongest avenger?";
//questions[0].option1="Thor";
//questions[0].option2="Hulk";
//questions[0].option3="Dr.Strange";
//questions[0].option4="Iron man";
//questions[0].correctans=1;

//questions[1].question="what is capital of india?";
//questions[1].option1="Hyderbad";
//questions[1].option2="Delhi";
//questions[1].option3="Jaipur";
//questions[1].option4="manipur";
//questions[1].correctans=2;


//questions[2].question="what is closest planet to sun?";
//questions[2].option1="earth";
//questions[2].option2="venus";
//questions[2].option3="mercury";
//questions[2].option4="jupiter";
//questions[2].correctans=3;


//questions[3].question="who is father of our nation?";
//questions[3].option1="Mahathma Gandi";
//questions[3].option2="Subash chandrabose";
//questions[3].option3="jawahralal nehru";
//questions[3].option4="none";
//questions[3].correctans=1;


//questions[4].question="where is charminar Loacted?";
//questions[4].option1="Jaipur";
//questions[4].option2="gujarath";
//questions[4].option3="Hyderabad";
//questions[4].option4="manipur";
//questions[4].correctans=3;
}
Player player1=new Player();
public void play()
{
 player1.getDetails();
  for(int i=0;i<5;i++){
  boolean status=questions[i].askQuestion();
   if(status==true){
     System.out.println("amazing you are correct");
     player1.score=player1.score + 4;
     }
  else{
System.out.println("Sorry,you are wrong");
 player1.score=player1.score - 1;
}  
}
System.out.println(player1.name+"your score is:"+player1.score);
}
}
