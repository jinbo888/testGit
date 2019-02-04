package cn.jinbo.ui;

import cn.jinbo.factory.BeanFactory;
import cn.jinbo.service.IAccountService;

public class Client {

	public static void main(String[] args) {
//		IAccountService accountService = new AccountServiceImpl();
		
		IAccountService accountService = (IAccountService) BeanFactory.getBean("ACCOUNTSERVICE");
//		IAccountService accountService2 = (IAccountService) BeanFactory.getBean("ACCOUNTSERVICE");
//		System.out.println(accountService);
//		System.out.println(accountService2);
		
		for(int i = 0;i<5;i++) {
			IAccountService aa = (IAccountService) BeanFactory.getBean("ACCOUNTSERVICE");
			System.out.println(aa);
		}
		accountService.save();
	}

}
