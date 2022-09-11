package org.springframework.wx.beans4test.populateBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author wuxin
 * @date 2022/09/05 15:22:28
 */
@Configuration
public class ConfigAMap {


	@Bean
	public Map<AInterImpl,AInterImpl> customeMap(){
		HashMap<AInterImpl, AInterImpl> integerIntegerHashMap = new HashMap<>();
		AInterImpl aInter = new AInterImpl();
		integerIntegerHashMap.put(aInter,aInter);
		return integerIntegerHashMap;
	}


}
