package ex03_annotation;

import java.lang.annotation.Annotation;

@TestInfo(value="테스트 정보")
//value를 통해 TestInfo의 value()메서드에 정보가 저장된다.
public class Ex02_annotation {
	public static void main(String[] args) {
	Annotation []  annos = Ex02_annotation.class.getAnnotations();
	for(Annotation anno : annos) {
		System.out.println(anno);
	}
	TestInfo testInfo = (TestInfo)Ex02_annotation.class.getAnnotation(TestInfo.class);
	System.out.println(testInfo.value()); //테스트 정보 출력
		
	}

}
