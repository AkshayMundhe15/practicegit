/* Q1.Create a class in java MyCalculator with two data members int num1,num2 .Write Parameter less and Parameterized Constructor to initialize your data members. */


public class Main {

	public static void main(String[] args) {
		
		MyCalculator m1=new MyCalculator();
		MyCalculator m2=new MyCalculator(4,5);
		
		m1.print();
	    int sum=m1.sum(4,5);
	    System.out.println("Addition = "+sum);
	    
	    int sub=m1.Substraction(4,5);
	    System.out.println("Substraction = "+sub);
	    
	    int mul=m1.Multiply(4,5);
	    System.out.println("Mupltiplication = "+mul);
        
	    int div = m1.Division(4,5);
	    System.out.println("Division = "+div);
	}

}
