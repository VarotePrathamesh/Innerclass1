
public class OuterClass {

	//By Member method
	class inner {
		int x=30;
		
		void m1() {
			System.out.println("In Member Inner Class");
		}
	}

	
	//By Anonymous inner class
    interface I{
	void m2();
}
   // By Local inner class
    public void method() {
    	class local {
    		
    		void m3() {
    			int z=10;
			}
    		
    	}
    }


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass obj=new OuterClass();
		OuterClass.inner in=obj.new inner();
		System.out.println(in.x);
		in.m1();
		
		I i=new I() {
			public void m2() {
				System.out.println("Inside interface");
			
			}
		};

		obj.method();
		
		
		
		

	}


}
