package features.impl;

public class Anonymous {
	public static void main(String[] args) {
		
	
Demo d=()-> {
	System.out.println("name");

};
		
		Demo d=new Demo() {
 			@Override
			public void name() {
				System.out.println("hello");
				
				System.out.println(x);
				
			}
			
		};
d.name();

}
}
