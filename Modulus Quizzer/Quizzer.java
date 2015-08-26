import java.util.Scanner;
public class Quizzer
	{
		Scanner question = new Scanner(System.in);
		int number;
		int answer;
	
		
		public static void main(String[] args)
		{
			howMany();
			askConstantQuestion();

		}
	
			private static void howMany()
				System.out.println("How many questions would you like to answer? Minimum of 3.")
					number = question.nextInt();
		
			private static void askConstantQuestion()
	
				System.out.println("What is 8%8");
				answer = question.nextInt();
				if (answer=0)
					System.out.println("That's right! Good job!");
				else 
					System.out.println("Nice try. The correct answer is" + 8%8);
				System.out.println("What is " + Math.random());
	
	}
