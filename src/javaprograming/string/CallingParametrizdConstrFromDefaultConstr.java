package javaprograming.string;

public class CallingParametrizdConstrFromDefaultConstr {

	public static void main(String[] args) {
		
		CallingParametrizdConstrFromDefaultConstr a = new CallingParametrizdConstrFromDefaultConstr();

	}
	
	CallingParametrizdConstrFromDefaultConstr(){
		this("Calling Parametrzied constructor from Default");
		System.out.println("Default constructor ");
	}
	
	CallingParametrizdConstrFromDefaultConstr(String str){
		System.out.println("Parameterzied constructor :" + str);
	}
	

}
