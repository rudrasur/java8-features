
public class LambdaExpressions {


	public static void main(String[] args) {
		Printable2 prt = (msg1, msg2) -> { 
			System.out.println(msg1);
			System.out.println(msg2);
			
		};
		prt.print("Message one", 2);
		
		Returnable2 rt = () ->  { return "Returing some value";};
		String val = rt.returnValue();
		System.out.println(val);
	}
}

interface Printable2 {
	void print(String msg, Integer msg2);
}

interface Returnable2 {
	String returnValue();
}