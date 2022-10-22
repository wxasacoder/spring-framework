package org.springframework.wx.beans4test.populateBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author wuxin
 * @date 2022/09/04 23:40:07
 */
@Component
public class AutowriedAMap {

	/***
	 * ????????????????????????????????????????
	 * map的注入只支持key为String value为对象的map
	 *
	 *
	 *
	 *
	 */

	/**
	 * 注入一个map的时候，spring 会按照类型找到一堆的的满足value类型的属性值，并将其bean作为key bean对象作为value放入其中
	 */
	@Autowired
	private Map<String, StandardEnvironment> standardEnvironmentMap;

	@Autowired
	private Map<String, Properties> propertiesMap;

	@Autowired
	private Map<String,MyCusBean4TestAutowirdType> myCusBean4TestAutowirdTypeMap;

	@Autowired
	private Map<String,AInter> aInterMap;


	private List<AInter> autowiredByConstuctor = new ArrayList<>();

	public AutowriedAMap(List<AInter> autowiredByConstuctor) {
		this.autowiredByConstuctor = autowiredByConstuctor;
	}

	@Autowired
	private Map<AInterImpl,AInterImpl> customeMap;

	public List<AInter> getAutowiredByConstuctor() {
		return autowiredByConstuctor;
	}

	public void setAutowiredByConstuctor(List<AInter> autowiredByConstuctor) {
		this.autowiredByConstuctor = autowiredByConstuctor;
	}

	public Map<String, StandardEnvironment> getStandardEnvironmentMap() {
		return standardEnvironmentMap;
	}

	public Map<AInterImpl, AInterImpl> getCustomeMap() {
		return customeMap;
	}

	public void setCustomeMap(Map<AInterImpl, AInterImpl> customeMap) {
		this.customeMap = customeMap;
	}

	public void setStandardEnvironmentMap(Map<String, StandardEnvironment> standardEnvironmentMap) {
		this.standardEnvironmentMap = standardEnvironmentMap;
	}

	public Map<String, MyCusBean4TestAutowirdType> getMyCusBean4TestAutowirdTypeMap() {
		return myCusBean4TestAutowirdTypeMap;
	}

	public void setMyCusBean4TestAutowirdTypeMap(Map<String, MyCusBean4TestAutowirdType> myCusBean4TestAutowirdTypeMap) {
		this.myCusBean4TestAutowirdTypeMap = myCusBean4TestAutowirdTypeMap;
	}

	public Map<String, AInter> getaInterMap() {
		return aInterMap;
	}

	public void setaInterMap(Map<String, AInter> aInterMap) {
		this.aInterMap = aInterMap;
	}

	public Map<String, Properties> getPropertiesMap() {
		return propertiesMap;
	}

	public void setPropertiesMap(Map<String, Properties> propertiesMap) {
		this.propertiesMap = propertiesMap;
	}
}
