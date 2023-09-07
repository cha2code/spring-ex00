package org.barista.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT SYSDATE() FROM DUAL")
	public String getTime();
	
	// xml mapper 사용
	public String getTime2();

}

/*
Mapper
- SQL과 그에 대한 처리를 지정하는 역할
- Mybatis-spring을 이용할 때 Mapper를 "XML+interface+어노테이션" 형태로 사용 가능
*/