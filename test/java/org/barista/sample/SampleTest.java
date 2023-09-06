package org.barista.sample;

import static org.junit.Assert.assertNotNull;

import org.barista.config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class) // 현재 테스트 코드가 Spring을 실행하는 역할을 한다는 표시
@ContextConfiguration(classes = {RootConfig.class}) // 지정 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내 객체로 등록
@Log4j // lombok을 이용해서 로그를 기록하는 변수 생성 -> log.info()
public class SampleTest {

	// 해당 변수에 자동으로 주입 - reflection 기능을 이용해서 설정
	@Autowired
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("------------------------");
		log.info(restaurant.getChef());
	}
	
}
