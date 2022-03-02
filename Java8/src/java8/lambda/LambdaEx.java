package java8.lambda;

public class LambdaEx {

	public static void main(String[] args) {
//	 Ann obj = new Ann() {
//		 public void show() {
//			 System.out.println("HEY");
//		 }
//	 };
//	 obj.show();
		
		
		//Lambda Expression
		Ann obj = () -> System.out.println("HEY");
		obj.show();
	}

}
