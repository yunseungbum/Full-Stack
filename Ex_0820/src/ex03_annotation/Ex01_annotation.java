/*어노테이션
-프로그램의 소스코드 안에 다른 프로그램을 위한 정보를 미리 약속된 형식으로 포함시킨 것
-어노테이션은 주석(comment)처럼 프로그래밍 언어에 영향을 미치지 않으면서도 
 다른 프로그램에게 유용한 정보를 제공할 수 있다는 장점이 있다.
-어노테이션의 뜻은 주석,주해,메모이다.


표준 어노테이션
-자바에서 제공하는 기본어노테이션

@Override 컴파일러에게 재정의 하는 메서드라는 것을 알린다.
@Deprecated 앞으로 사용되지 않을 것을 권장하는 대상에게 붙인다.
@SuppressWarnings 경고를 무시해준다.
@SafeVarargs (매개변수에 가변 인수를 쓸 때 발생하는 예외를 억제할 때)경고를 무시해준다.
@FunctionalInterface 람다식(인터페이스 - 추상메서드가 1개만 정의된 인터페이스)


메타 어노테이션
-어노테이션을 만들기 위한 어노테이션
-스프링에서는 어노테이션으로 만이 통제를 한다.
-java.lang.annotation패키지에 정의되어 있다.

@Target
-어노테이션이 적용 가능한 대상(범위)을 지정하는데 사용된다.
-말 그대로 어노테이션을 붙일 수 있는 대상을 지정하는 것


@Target(ElementType.TYPE)				클래스의 어떤 요소에나 적용 가능, 기본값
@Target(ElementType.FIELD)				클래스의 특정 필드
@Target(ElementType.METHOD)				클래스의 메서드
@Target(ElementType.PARAMETER)			메서드의 파라미터
@Target(ElementType.CONSTRUCTOR)		생성자
@Target(ElementType.ANNOTATION_TYPE)	어노테이션 타입

@Retention
어노테이션이 유지되는 기간을 지정하는데 사용된다.

어노테이션	설명
@Retention(SOURCE)	어노테이션이 소스 코드에만 이용 가능하며 컴파일 후에는 사라짐
@Retention(CLASS)	어노테이션이 .class파일에 존재하지만 런타임에는 사라짐(실행시 사용 불가)
@Retention(RUMTIME)	어노테이션이 컴파일러와 런타임에 사용 가능(실행시에 정보 제공)
 * 
 */
package ex03_annotation;

@FunctionalInterface
interface B{
	void method();
}

@SuppressWarnings("removal")
class A{
	@Deprecated
	public void oldOne() {
		
	}
	
	
	Integer i = new Integer(10);
}

public class Ex01_annotation {
	public static void main(String[] args) {

	}

}
