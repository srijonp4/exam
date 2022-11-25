
class InnerStaticClass{
	static class InnerClass{
		static String a ;
		InnerClass(){
		System.out.println("Inner class constructor called");
		}
		static{ a = "hello";}
	static String getA(){
		return a ;
		}
	}
	public static void main(String[] args){
	
	InnerClass obj = new InnerClass();
	System.out.println(InnerClass.getA());
	}

}



