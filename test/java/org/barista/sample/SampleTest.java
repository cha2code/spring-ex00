package org.barista.sample;

import static org.junit.Assert.assertNotNull;

import org.barista.config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

//현재 테스트 코드가 Spring을 실행하는 역할을 한다는 표시
@RunWith(SpringJUnit4ClassRunner.class) 
//지정 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내 객체로 등록
@ContextConfiguration(classes = {RootConfig.class}) 
@Log4j // lombok을 이용해서 로그를 기록하는 static 멤버 생성 -> log.info()
public class SampleTest {

	// 해당 변수에 자동으로 주입 - reflection 기능을 이용해서 설정
	@Autowired
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		
		// 객체가 Null인지 확인 (assertNull) - 기본 타입, 배열, 컬렉션, 참조 타입 모두 테스트 가능
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("------------------------");
		log.info(restaurant.getChef());
	}
	
}
