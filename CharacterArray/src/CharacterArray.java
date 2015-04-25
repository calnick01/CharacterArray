/**
Requirements:
	- Create a class called CharacterArray.
	- The scanner class is not required
	- Write a program which will accept an alpha numeric string at the keyboard.
	- Store the string, of any length, into a character array, for example: 
		NVCC Manassas Campus 6901 Sudley Road Manassas VA 20109
	- For each visible character:
		- Display the original character
		- Determine and display whether the character is a digit or a letter
		- If the character is a lower case letter, redisplay the character in upper case
		- If the character is a upper case letter, redisplay the character in lower case
		- If the character is a digit, display it as an * (asterisk)
	- Display your output using clear and appropriate messages.
	- Document each statement concisely.
	- Post your Java source code file and your output text file in Blackboard using the Assignment Upload link below.
 */
public class CharacterArray
{
	public static void main(String[] args) throws InterruptedException
	{		
		StringBuilder input = new StringBuilder("NVCC Manassas Campus 6901 Sudley Road Manassas VA 20109");
		String originalInput = input.toString();
		for (int i = 0; i < input.length(); i++) 
		{
			char index = input.charAt(i);
			if(Character.isDigit(input.charAt(i))) 
			{
				System.out.println(input.charAt(i)+" is a digit");
				input.replace(i, i+1,"*");
			}
			else if (Character.isLowerCase(input.charAt(i)))
			{
				System.out.println(input.charAt(i)+" is a lowercase character");
				input.setCharAt(i,Character.toUpperCase(index));
			}
			else if (Character.isUpperCase(input.charAt(i)))
			{
				System.out.println(input.charAt(i)+" is a UPPERCASE character");
				input.setCharAt(i,Character.toLowerCase(index));
			}
			Thread.sleep(200);
		}
		Thread.sleep(1000);
		System.out.println("\n\nThe original input is: \t"+originalInput);
		System.out.println("The altered input is:\t"+input);		
	}
}