package cn.jinbo.service.impl;

import cn.jinbo.dao.IAccountDao;
import cn.jinbo.factory.BeanFactory;
import cn.jinbo.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
	
//	private IAccountDao AccountDao = new AccountDaoImpl();
	
	private IAccountDao AccountDao = (IAccountDao)BeanFactory.getBean("ACCOUNTDAO");

	@Override
	public void save() {
		AccountDao.saveAccount();

	}

}
