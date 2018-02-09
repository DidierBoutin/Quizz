import java.util.Scanner;

public class Quizz {
  private static Scanner input =  new Scanner(System.in);

  public static void main(String[] args){


    System.out.println("Hello !");
    
    
    int score = 0;
    for (int i=0;i<3;i++ ) {
      score = quesAnsw(tabQuesAnsw[i] [0],tabQuesAnsw[i] [1],score);
    }
     System.out.println("Votre score est de " + score + " points !");
    }
  
  
  private static String [][] initQuesAnsw(){
      System.out.println("How many questions do you want play ?");
        int nbQues = input.nextInt();
        String [][] tab = new String [nbQues][2]
        for (int i = 0; i < tab.length; i++) {
        	System.out.println("Get your question n° " + (i+1) + " : ");
        	tab(i,0) = 	input.nexLine();
        	System.out.println("Get its answer n° " + (i+1) + " : ");
        	tab(i,1) = 	input.nexLine();
		}      
  }
    private static int quesAnsw(String q, String a, int score){
      System.out.println(q); 
        if (input.nextLine().equalsIgnoreCase(a))
          {score++;
          System.out.println("Good answer, congratulations !");
        } else{
          System.out.println("Sorry, the answer is " + a );}
        return score;
}
}
