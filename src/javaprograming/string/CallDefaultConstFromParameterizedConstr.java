package javaprograming.string;

public class CallDefaultConstFromParameterizedConstr {

	public static void main(String[] args) {
		
		CallDefaultConstFromParameterizedConstr b = new CallDefaultConstFromParameterizedConstr(1);
		
	}
	
	CallDefaultConstFromParameterizedConstr(){
		System.out.println("Default Constr");
	}
	
	CallDefaultConstFromParameterizedConstr(int a){
		this();
		System.out.println("parameterized Constr " + a);
	}
	

}
