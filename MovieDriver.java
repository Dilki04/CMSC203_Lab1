/*
	Class: CMSC203 
	Instructor: Prof. Tsai
	Description: 
	Due: 09/12/2021
	Platform/compiler: Eclipse
  	I pledge that I have completed the programming assignment independently.
   	I have not copied the code from a student or any source.
   	I have not given my code to any student.
   	Print your Name here: Dinelka Jagoda 
*/

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		Movie movie = new Movie();
		
		String repeat;
		
		do
		{
			
		System.out.println();
		System.out.println("Enter the title of the movie: ");
		String movie_name = input.nextLine();
		movie.setTitle(movie_name);
		
		System.out.println("Enter the rating of the movie: ");
		String rating = input.nextLine();
		movie.setRating(rating);
		
		System.out.println("Enter the number of tickets sold at theatre: ");
		int tickets = input.nextInt();
		movie.setSoldTickets(tickets);
		input.nextLine();
		
		System.out.println(movie.toString());
		System.out.println();
		
		System.out.println("Do you want to enter another? (y or n)");
		repeat = input.nextLine();
		
		
		} while(repeat.equals("y") || repeat.equals("yes"));
		
		input.close();
		
	}

}
