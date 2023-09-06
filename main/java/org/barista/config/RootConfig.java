package org.barista.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// root-context.xml에 해당하는 클래스

@Configuration
@ComponentScan(basePackages = {"org.barista.sample"})
public class RootConfig {

}

/*
@Configuration

- 설정 파일을 만들거나 bean을 등록하기 위한 어노테이션

- spring에서 CGLIB라는 바이트 조작 라이브러리를 사용, AppConfig를 상속 받은
	임의의 클래스를 생성 후, 그것을 spring bean으로 등록함

- 생성 된 임의의 클래스를 통해 싱글톤 유지
	(실제로 싱글톤을 사용하진 않으나 위의 이유로 싱글톤이 되게 함)
	
- 의존성 주입 설정 (생성자 주입, setter 주입)

 - @Configuration 어노테이션 아래에 @ComponentScan(basePackages="패키지 경로")를 사용하면
 	해당 패키지안에 있는 bean클래스의 어노테이션을 분석할 수 있도록 설정해줄 수 있다.
*/

/*
 @ComponentScan(basePackages = {""})
 
 - @Configuration이 붙은 bean 설정 클래스에 붙여서
 	스테레오 타입 어노테이션이 붙은 bean들을 자동으로 스캔해서 등록함
 	(여기서는 bean에 등록할 패키지 지정)
 	
 - 스테레오 타입 어노테이션 : bean으로 등록하기 위한 어노테이션
 	(이것을 이용해서 어떤 계층의 bean인지 지정 가능)
 
 -  해당 패키지와 하위 패키지에 대해서 @Component같은 스테레오 타입 어노테이션이 붙은 클래스를
 	모두 찾아서 bean으로 등록한다
*/