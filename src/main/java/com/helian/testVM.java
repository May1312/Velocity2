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
	 * 
	 */
	private static final long serialVersionUID = 1L;

    protected Template handleRequest(HttpServletRequest request, HttpServletResponse response, Context ctx) {
        ctx.put("name", "道森.杰克");
        ctx.put("message","my heart");
       // List<Object> list = new ArrayList<Object>();
        //list.add("yesterday");
       // ctx.put("list", list);
        System.out.println("道森。杰克");
        
        Template template = getTemplate("show.vm");
        return template;
    }
    
    public String getName(String name){      
    	return "hang";
    }
    
    @Test
    public void test(){
    	String string = get("hello.world");
    	System.out.println(string);
    }
    public String get(String key) {
        try {
        	//ApplicationContext  context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
           // MessageSource messageSource = (MessageSource) context.getBean("messageSource");
           // if (messageSource != null) {
            	//获取所在地区语言
            	Locale locale2 = Locale.getDefault();  

            	Locale locale3 = new Locale("zh", "CN"); 
            	ResourceBundle messages =ResourceBundle.getBundle("i18n/abc", locale3);
            	String message = messages.getString(key);
            	System.out.println(message);
             //  String message = messageSource.getMessage(key, args, key, locale2);
               
               return message;
          //  }
          //  return key;
        } catch (NoSuchMessageException e) {
            return key;
        }
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
