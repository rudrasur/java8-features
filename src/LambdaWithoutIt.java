
public class LambdaWithoutIt {

	public static void main(String[] args) {
		
		Printer obj = new Printer();
		obj.print();
		
		Printable obj2 = new Printable() {
			@Override
			public void print() {
				System.out.println("Printer from anonymous");
			}
		};
		obj2.print();
		
		Returnable rt = new Returnable() {
			@Override
			public String returnValue() {
				return "Value from Returnable";
			}
			
		};
		String val = rt.returnValue();
		System.out.println(val);
	}
}

interface Printable {
	void print();
}

class Printer implements Printable {
	
	@Override
	public void print() {
		System.out.println("Printer");
	}
}

interface Returnable {
	String returnValue();
}