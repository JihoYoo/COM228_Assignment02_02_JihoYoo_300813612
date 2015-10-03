/* 
 * Name : JihoYoo StudentNumber: 300813612
 */
import java.util.Scanner;

public class DiceGame { 
 
 
 	public static void main(String[] args){ 
 		Scanner scanner = new Scanner(System.in);
 		
 		Die die = new Die();
 		 
 		int number = 0; 
 		int result = 0; 
 		
 		System.out.print("Enter a number between 2 and 12: ");	
 				
 			
 			
 			number=Integer.parseInt(scanner.nextLine());
 			System.out.println();							
			 
	 		System.out.printf("Press Enter to roll dice to get your number '%d'%n", number);
	 		
 		for(int i = 1; i < 4; i++){ 
 			 

			if(scanner.hasNextLine()){ 
 				result = (new Die()).getValue() + (new Die()).getValue(); 
 				if(result == number){ 
 					System.out.printf("You win!!!you got %d%n", result); 
 					System.out.println("\nHave a good day ");	
 					System.exit(0);
 					break;
 				}else{ 
 					System.out.printf("Shit... you just got %d%n", result); 
 				} 
			}			 
 		} 
 		System.out.println("\nComputer Wins... ");
 		System.out.println("\nHave a good day ");		 
 	}	 
 } 
