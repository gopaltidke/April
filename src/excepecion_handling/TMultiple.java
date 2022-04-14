package excepecion_handling;

public class TMultiple {

	public static void main(String[] args) throws ArithmeticException {
		int a= 10;
		int b=0;
		try {
			int div =a/b;
			System.out.println(div);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("generic exception caugh");
		}

//		catch (NullPointerException e) {
//			System.out.println("cant perform null exception");
//		}
//		catch (ArithmeticException e) {
//			System.out.println("divide by zero not possible");
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println("check string index");
//		}
		finally {
			System.out.println("Hi finally are executed");

		}
			}
}
