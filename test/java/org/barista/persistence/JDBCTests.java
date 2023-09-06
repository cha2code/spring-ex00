package org.barista.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

// mySQL JDBC 연결 테스트
@Log4j
public class JDBCTests {

	static {
		try {
			// 자동으로 객체를 생성한 후 DriverManager에 등록됨
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		
		String url = "jdbc:mysql://localhost:3306/glory_db";
		
		try(Connection con = DriverManager.getConnection(url, "glory", "1234")){
			
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage()); // 연결 실패시 에러 출력 (왜 에러가 발생했는 지만 보여줌)
		}
	}
	
}


/*
static {} : static block

- 클래스 변수를 초기화 시킬 때 사용

** 클래스 초기화 블럭
- 클래스가 처음 로딩될 때 한 번만 수행됨

** 인스턴스 초기화 블럭
- 인스턴스가 생성될 때마다 수행됨 (생성자보다 먼저 수행)
- 보통은 생성자에서 초기화를 시키기 때문에 잘 사용하지 않음
- 클래스의 모든 생성자에서 공통적으로 수행해야 하는 코드가 있을 때 사용하면 코드의 중복 사용 감소
*/


/*
DriverManager

- 데이터 원본에 JDBC 드라이버를 통해 커넥션을 만드는 역할
- Class.forName()을 통해 생성 (인터페이스 드라이버를 구현하는 작업)
*/