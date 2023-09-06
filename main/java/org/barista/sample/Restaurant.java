package org.barista.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {

	// Chef 객체의 레퍼런스를 Restaurant에 주입시킴
	// @Autowired만 사용해도 주입 가능
	// @AllArgsConstructor : 생성자 주입 - 인스턴스 변수로 선언 된 모든 것을 파라미터로 받음
	@Setter(onMethod_ = {@Autowired})
	private Chef chef;
}