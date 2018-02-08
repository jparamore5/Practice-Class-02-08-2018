import java.util.Scanner;

public class Cardtest {
	
	public static void main(String[]args) {
	
	Cards Card1 = new Cards(5,"spade");
	Cards Card2 = new Cards(6,"diamond");
	Cards Card3 = new Cards(9,"spade");
	Cards Card4 = new Cards(5,"spade");
	Cards Card5 = new Cards(1,"diamond");
	Cards Card6 = new Cards(2,"spade");
	Cards Card7 = new Cards(3,"club");
	Cards Card8 = new Cards(9,"spade");
	Cards lucky = new Cards(7,"spades");
	
	System.out.println(Card1.number+Card1.suit);
	System.out.println(Card2.number+Card2.suit);
	System.out.println(Card3.number+Card3.suit);
	System.out.println(Card4.number+Card4.suit);
	System.out.println(Card5.number+Card5.suit);
	System.out.println(Card6.number+Card6.suit);
	System.out.println(Card7.number+Card7.suit);
	System.out.println(Card8.number+Card8.suit);
	System.out.println(lucky.number+lucky.suit);
	
	System.out.println("what suit do you want?");
	Scanner sc= new Scanner(System.in);
	
	 String suit =sc.nextLine();
	 
	 
	 System.out.println("what number do you want ?");
	 
	 int ptwo = sc.nextInt();
	if (ptwo == lucky.number && suit.equals(lucky.suit)) {
		System.out.print(" you are one lucky duck you win!!");
		 
			
	} else {
		System.out.print("you loose you bum");
	
	
	
	}
	}
}
