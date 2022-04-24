package dimensions;

public class test {				//test class generating two distinct figures
	public static void main(String[] args) {
	figure F = new figure();
	System.out.println(F.getFig());
	F.rerandomise();
	System.out.println(F.getFig());
	}
}
