package com.helian;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.context.Context;
import org.apache.velocity.tools.ToolContext;
import org.apache.velocity.tools.struts.MessageTool;
import org.apache.velocity.tools.struts.StrutsUtils;
import org.apache.velocity.tools.view.VelocityViewServlet;
import org.apache.velocity.Template;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
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
        List<Object> list = new ArrayList<Object>();
        list.add("yesterday");
        ctx.put("list", list);
        System.out.println("道森。杰克");
        
        //加载spring
       // ApplicationContext  context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        
       // MessageSource messageSource = (MessageSource) context.getBean("messageSource");
    //    MessageTool messageTool = new MessageTool(new MessageSourceAccessor(messageSource), locale);
     /*   ctx.put("messageTool", messageTool);
         
                        System.out.println("-------begin---------");
                        System.out.println(messageTool.get("hello。world"));// hello
                        System.out.println("-------end-----------");*/
        Template template = getTemplate("show.vm");
        return template;
    }
    @Test
    public void run(){      
    	String line =" ";
    	String string = line.split("=")[0];
    	System.out.println(string);
    }
}