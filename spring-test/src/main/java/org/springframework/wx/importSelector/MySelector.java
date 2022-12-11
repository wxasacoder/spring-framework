package org.springframework.wx.importSelector;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author wuxin
 * @date 2022/12/07 22:38:36
 */
@Import(MySelector.class)
@Configuration
public class MySelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		String[] classArray = {PersonL.class.getName()};
		return classArray;
	}
}
