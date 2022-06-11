
public class MyCalculator {
    int num1;
    int num2;
    
    MyCalculator(){
    	num1=1;
    	num2=1; 
    }
	public MyCalculator(int a, int b){
    	num1=a;
    	num2=b;
    }
    public int sum(int s,int d ) {
    	num1=s;
    	num2=d;
    	return (num1+num2);
    }
    public int Substraction(int s,int d ) {
    	num1=s;
    	num2=d;
    	return (num1-num2);
    }
    public int Multiply( int s,int d ) {
    	num1=s;
    	num2=d;
    	return (num1*num2);
    }
    public int Division(int s,int d ) {
    	num1=s;
    	num2=d;
    	return (num1/num2);
    }
    public void print() {
    	System.out.println("Number 1 = "+num1+"and Number 2= "+num2);
    }
    
}
