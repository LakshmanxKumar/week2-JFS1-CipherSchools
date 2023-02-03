package week2;
class App{
App() {
    System.out.println("Constructor of App");
}

App(int num) {
    System.out.println(num);
}
}
public class Code2 extends App{
	 Code2() {
	        super(20);
	        System.out.println("Constructor");
	    }
	public static void main(String []args) {
		new Code2();
		
	}

}
