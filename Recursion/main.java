//===================================================  
// Name       :  Emad Tirmizi
// SID        :  31400222
// Course     :  IT114 
// Section    :  
// Instructor :  Maura Deek
// T.A        :   
//===================================================  
//===================================================  
// Assignment # :  3
// Date         :  11/2/2018
//===================================================  
//===================================================  
// Description: This program will check to see if the
// if the starting point chosen by the user can be
// solved through the use of a recursive method. It
// informs the user whether or not it is able to be
// solved using the starting point provided by the
// user
//===================================================  


import java.util.Scanner;

class main{
	public static void main(String[] args){
		//create a scanner so that the user can select a number to choose from
      Scanner input = new Scanner(System.in);
		//print which numbers the user can choose from
      System.out.print("Enter a starting point between 0 & 9 \n");
		//set the user input to variable n
      int n = input.nextInt();
		
      //print the result
		System.out.println("The starting point of " + n + " is solvable: " + PuzzleSolver(n));
	}//end of main method
	
   //create recursive method
	public static String PuzzleSolver(int n){
		//create an array
      int[] puzzle = new int[] {3, 6, 4, 1, 3, 4, 2, 5, 3, 0};     
      //set a variable that retrieves the value of the position the user chose
      int a = puzzle[n];
      //create a variable nleft that will be used to see if the function can move left
		int nleft = n - a;
      //create a variable nright that will be used to see if the function can move right
		int nright = n + a;
      //if the value of a, as in the current position is 0 that means the problem is solved
      
      String value = "";
      
      if(n == 0){
			return value = "problem solved";
		}//end of if
      
      //if nleft is greater than negative 1, meaning the function can go left, it will 
		else if(nleft > -1){
         //if nleft doesn't equal to a, meaing its not the same value, then continue so it doesn't repeat
         if(nleft != a){
            //the variable 'a' is set to the new location
			   a = puzzle[nleft];
            //the function is recalled to see if the base case is met
			   return PuzzleSolver(a); 
         } 
		}//end of if
      
      //if nright is less than 10, meaning the function can go right, it will
		else if(nright < 10){
         //if nright doesn't equal to a, meaing its not the same value, then continue so it doesn't repeat
         if(nright != a){
            //the variable 'a' is set to the new location
			   a = puzzle[nright];
            //the function is recalled to see if the base case is met
			   return PuzzleSolver(a); 
         }
		}//end of else if
     
      //if all else fails and the function cannot be solved it will return false as the answer
		else{
			return value = "problem cant be solved";
		}//end of else
      return value;
   }//end of recursion method
}//end of class
