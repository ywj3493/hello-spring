# hello-spring

프로젝트 start : https://start.spring.io/

gradle 빌드 && 티베로 연동 : build.gradle, src/main/resources/application.properties 두개 파일 참조



# 스프링 정리

0. 유용 링크 정리

스프링 어노테이션 정리 : https://velog.io/@gillog/Spring-Annotation-%EC%A0%95%EB%A6%AC

CORS 정책 위반 해결 정리 : https://evan-moon.github.io/2020/05/21/about-cors/

1. 용어 정리

빈, POJO 인스턴스 : 자바 클래스로 생성한 객체 인스턴스

컴포넌트, POJO 클래스 : 인스턴스를 생성하는데 필요한 실제 자바 클래스

템플릿 메소드 패턴 : 디자인 패턴 중 하나로, 상속을 통해 슈퍼클래스 기능을 확장할 때 사용하는 대표적인 패턴이다. 변하지 않는 기능은 슈퍼클래스에 만들어두고, 자주 변경되며 확장할 기능은 서브클래스에서 만들도록 하고 있다. 추상 메소드 또는 오버라이드 가능한 메소드를 정의해두는 방식이라서 템플릿 메소드 패턴이라고 한다.

팩토리 메소드 패턴 : 상속을 통해 기능을 확장할때 하는 패턴, 슈퍼클래스 코드에는 서브클래스에서 구현할 메소드를 호출해서 필요한 타입의 오브젝트를 가져와 사용한다. 이 메소드는 주로 인터페이스 타입이로 오브젝트를 리턴한다.
