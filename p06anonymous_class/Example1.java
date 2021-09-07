package p08interface.p03lecture.p06anonymous_class;

public class Example1 {

	public static void main(String[] args) {
//		MyInterface1 i1 = new MyInterface1(); 
		MyInterface1 i2 = new MyClass1();
		
		
		//클래스와 인스턴스(객체)를 한번에 만들 수 있음
		MyInterface1 i3 = new MyInterface1() {
		//인터페이스를 구현할 때 한번에 클래스도 만들어서 클래스의 이름이 없음
			
		};//o
	}
}
