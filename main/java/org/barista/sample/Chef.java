package org.barista.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Chef {

}

/*
 @Component
 
 - bean 등록을 bean 클래스 자체에 할 수 있음
 - 타입 기반의 자동 주입 어노테이션

 */

/*
 @Data
 
 - @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode를
 	한꺼번에 설정해주는 어노테이션
 
 1. 모든 필드를 대상으로 접근자와 설정자가 자동으로 생성됨
 2. final 또는 @NonNull 필드 값을 파라미터로 받는 생성자가 만들어짐
 3. toStirng, equals, hashCode 메소드가 자동으로 만들어짐
 */

