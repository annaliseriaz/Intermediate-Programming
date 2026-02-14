package class_object_pck;

public class CocoMelon {

	public static void main(String[] args) {
		System.out.print("COCO");
		method1( );
		System.out.print(" MELON ");
		method2( );

	}
	
	static private void method1( ) {
	System.out.print( " IS ");
	}
	
	static private void method2 ( ) {
	System.out.print(" HEAD ");
	}
	
	static private void method3 ( ) {
	method1();
	System.out.print(" A ");
	}
}
