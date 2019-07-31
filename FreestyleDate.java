package date1;

import java.util.Scanner;

public class FreestyleDate {

	public static void main(String[] args) {
		
		Scanner apple = new Scanner(System.in);
		int budget = 25;
		String answer = ""; 
	String man = "";
	String bowling = "to go bowling is $40 or less";
	String  movies= "to go see a movie is $40 or more";
	String camping = "to go camping over is $50 or more";
	String concert = "go to a concert is $50 or less";
	String dinner = "to go out to eat is $20 or more";
	String carnival = "to go to a carnival is $10 or more";
	String skating = "to go skating is $10 or more";
	String games = "to play board games at home is FREE ";
	String park = "to go to the park is FREE";
		System.out.println("enter your name");
				man = apple.next();
				
		  System.out.println("Do you like dates indoors or outdoors " + answer);
			  answer=   apple.next();
          
         System.out.println("What is your budget pick a number " );
         budget =apple.nextInt();
         
          
         if(answer.equalsIgnoreCase("indoors") && budget<= 100) {
        	 System.out.println(movies);
        	 System.out.println(bowling);
        	 System.out.println(dinner);
        	 System.out.println(skating);
        	 System.out.println(games);
         }
         
         if(answer.equalsIgnoreCase("indoors") && budget>= 100) {
        	 System.out.println(movies);
        	 System.out.println(bowling);
        	 System.out.println(dinner);
        	 System.out.println(skating);
        	 System.out.println(games);
         }
        	 
          if(answer.equalsIgnoreCase("outdoors") && budget >=100 ) { 
        		 System.out.println(camping);
        		 System.out.println(concert);
        		 System.out.println(carnival);
        		 System.out.println(park);
        	 }
          if(answer.equalsIgnoreCase("outdoors") && budget<= 100) {
        	  System.out.println(camping);
        	  System.out.println(concert);
        	  System.out.println(carnival);
        	  System.out.println(park);
          }
          System.out.println("Thank you for your time " + man);
         
           
	}
        
        

}
		




