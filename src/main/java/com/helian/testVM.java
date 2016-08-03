package com.helian;


import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;
import org.apache.velocity.Template;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


public class testVM extends VelocityViewServlet {

    /**
	 * Velocity实现simple的i18n
	 */
	private static final long serialVersionUID = 1L;

    protected Template handleRequest(HttpServletRequest request, HttpServletResponse response, Context context) {
    	//设置的值可以在页面取出
    	context.put("name", "杰森.伯恩");
    	context.put("message","my heart");
        System.out.println("杰森.伯恩");
        //从请求的Request中获取用户的语言   ？？？经过代理会失效么    并存放起来
         Locale locale = request.getLocale();
         LocaleUtil.setLocale(locale);
        Template template = getTemplate("show.vm");
        return template;
    }
    
    public String getName(String name){      
    	return "hang";
    }
    
    public String get(String key) {
        	//ApplicationContext  context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
           // MessageSource messageSource = (MessageSource) context.getBean("messageSource");
            	//获取所在地区语言
            	Locale locale = LocaleUtil.getLocale();
            	//加载src目录下的资源文件
            	ResourceBundle messages =ResourceBundle.getBundle("i18n/abc", locale);
            	String message = messages.getString(key);
            	System.out.println(message);
             //  String message = messageSource.getMessage(key, args, key, locale2);
               
               return message;
    }

}
    
//加载spring
    
    
    /*public String get(String key) {
        try {
        	ApplicationContext  context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
            MessageSource messageSource = (MessageSource) context.getBean("messageSource");
            if (messageSource != null) {
            	Locale locale = null;
                return key;
            }
            return key;
        } catch (NoSuchMessageException e) {
            return key;
        }
    }*/
