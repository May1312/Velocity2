package com.helian;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;

public class TestRest extends VelocityViewServlet{
	private static final long serialVersionUID = 1L;

	public Template handleRequest(HttpServletRequest request, HttpServletResponse response, Context ctx) {
        Locale locale = request.getLocale();
        LocalUtil.setLocale(locale);
        Template template = getTemplate("showHello.vm");
        return template;
    }
	public String get(String key) {
        	Locale locale = LocalUtil.getLocale();
        	ResourceBundle messages =ResourceBundle.getBundle("i18n/abc", locale);
        	String message = messages.getString(key);
        	System.out.println(message);
           return message;
	}
}
