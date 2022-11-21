package org.springframework.wx.tx;

import org.springframework.transaction.support.TransactionSynchronization;

/**
 * @author wuxin
 * @date 2022/11/21 22:30:42
 */
public class AfterTransactionSynchronizer implements TransactionSynchronization {

	public static AfterTransactionSynchronizer getInstance(){
		return new AfterTransactionSynchronizer();
	}


	@Override
	public void afterCommit() {
		System.out.println("transacation after commit execute");
	}
}
