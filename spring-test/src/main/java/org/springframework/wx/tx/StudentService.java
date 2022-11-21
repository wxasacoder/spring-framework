package org.springframework.wx.tx;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Nested;
import org.springframework.aop.framework.AopContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @author wuxin
 * @date 2022/10/24 15:47:36
 */
@Component
public class StudentService {

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Transactional(rollbackFor = Exception.class)
	public void insertStudentBatch(){
		StudentService studentService = (StudentService) AopContext.currentProxy();
		String sql = "INSERT INTO student(name,age,gender) values ('1同学',12,1)";
		jdbcTemplate.update(sql);
		TransactionSynchronizationManager.registerSynchronization(AfterTransactionSynchronizer.getInstance());

//		studentService.insertStudentOne();
//		studentService.insertStudentTWO();
	}

	@Transactional(rollbackFor = Exception.class,propagation = Propagation.NESTED )
	public void insertStudentOne(){
		String sql = "INSERT INTO student(name,age,gender) values ('1同学',12,1)";
		jdbcTemplate.update(sql);
		throw new RuntimeException("");

	}
//
//	@Transactional(rollbackFor = Exception.class)
//	public void insertStudentTWO(){
//		String sql = "INSERT INTO student(name,age,gender) values ('2同学',12,1)";
//		jdbcTemplate.update(sql);
//		throw new RuntimeException("");
//	}


}
