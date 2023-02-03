package week2;

public class code1 {
	 int arg = 5;

	    void myTest(int arg) { 
	        arg = arg;
	        }
	public static void main(String [] args) {
		int arg = 10;
        code1 obj = new code1();
        obj.myTest(arg);
        System.out.println(obj.arg);
	}

}
