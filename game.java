import java.util.Scanner;
import java.util.Random;
public class game
{
 public static void main(String[] args)
  {
   // 0 for stone
   // 1 for paper
   // 2 for scissor
 
 Scanner sc = new Scanner(System.in);
 System.out.print("enter 0 for stone, 1 for paper, 2 for scissor");
 int userInput = sc.nextInt();

 Random random = new Random();
 int computerInput = random.nextInt(3);
  
 if(userInput == computerInput)
  {
   System.out.println("draw");
  }
   else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1)
    {
      System.out.println("you win !!");
    }
      else
      {
       System.out.println("computer win");
     }

  if(computerInput==0)
  {
     System.out.println("computer choice : stone");
   }
  else if(computerInput==1)
  {
     System.out.println("computer choice : paper");
   }
 else if(computerInput==2)
  {
     System.out.print("computer choice : scissor");
   }
 }
}
  
  


