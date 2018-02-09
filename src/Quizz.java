import java.util.Scanner;

public class Quizz {
  private static Scanner input =  new Scanner(System.in);

  public static void main(String[] args){


    System.out.println("Hello !");
    
    String tabQuesAnsw[][] = initQuesAnsw();
    
    int score = 0;
    for (int i=0;i<tabQuesAnsw.length;i++ ) {
      score = quesAnsw(tabQuesAnsw[i] [0],tabQuesAnsw[i] [1],score);
    }
     System.out.println("Votre score est de " + score + " points !");
    }
  
  
  private static String [][] initQuesAnsw(){
      System.out.println("How many questions do you want play ?");
        int nbQues = input.nextInt();
        input.nextLine();
        String [][] tab = new String [nbQues][2];
        for (int i = 0; i < tab.length; i++) {
        	System.out.println("Get your question n° " + (i+1) + " : ");
        	tab[i][0] = 	input.nextLine();
        	System.out.println("Get its answer n° " + (i+1) + " : ");
        	tab[i][1] = 	input.nextLine();
		}    
        return tab ;
  }
    private static int quesAnsw(String q, String a, int score){
    	//input.nextLine();
    	System.out.println(q); 
        if (input.nextLine().equalsIgnoreCase(a))
          {score++;
          System.out.println("Good answer, congratulations !");
        } else{
          System.out.println("Sorry, the answer is " + a );}
        return score;
}
}
