package week3.Day1.org.Bank;

public class Automation extends MultipleLanguage implements TestTool,Language {
	
	public void java() {
		System.out.println("class Java");

	}
	public void selinium() {
		System.out.println("class Selinium");
		
	}
	@Override
	public void ruby() {
		System.out.println("class Ruby");
	}
	
	public void CProgram() {
		System.out.println("Class c++");
	}
	
	public static void main(String[] args) {
		Automation Auto = new Automation();
		Auto.selinium();
		Auto.java();
		Auto.python();
		Auto.ruby();
		Auto.CProgram();
		

		
	}
		
	}