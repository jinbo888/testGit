package cn.jinbo.factory;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;


public class BeanFactory {
	
	private static ResourceBundle bundle = ResourceBundle.getBundle("config.bean");
	private static Map<String, Object> beans = new HashMap<String,Object>();
	static {
		try {
			Enumeration<String> keys = bundle.getKeys();
			while(keys.hasMoreElements()) {
				String key = keys.nextElement();
				String path = bundle.getString(key);
				Object obj = Class.forName(path).newInstance();
				beans.put(key, obj);
			}
		} catch (Exception e){
			throw new ExceptionInInitializerError("ÈÝÆ÷³õÊ¼»¯Ê§°Ü£¡");
		}
	}
	public static Object getBean(String beanName) {
		return beans.get(beanName);
	}
	
	
/*	public static Object getBean(String beanName) {
		Object value = null;
		String beanPath = bundle.getString(beanName);
		try {
			value = Class.forName(beanPath).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return value;
	}*/
	
/*	public static void main(String[] args) {
		String path = bundle.getString("ACCOUNTSERVICE");
		System.out.println(path);
	}*/
}
