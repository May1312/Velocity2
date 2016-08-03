package com.helian;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;    

import org.junit.Test;
public class helloWorld extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hi!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello Dawson.Jack!!!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
    @Test
    public void run(){
    	String url = "http://www.baidu.com?name=zhang&age=18";
    	int indexOf = url.indexOf("?");
    	String substring = url.substring(indexOf+1,url.length());
    	String substring2 = url.substring(indexOf);
    	System.out.println(substring);
    	System.out.println(substring2);
    	//trim用法
    	String trim1="aa";
    	String trim2="a a";
    	String trim3="  ";
    	System.out.println("trim1:"+trim1.trim().length());
    	System.out.println("trim2:"+trim2.trim().length());
    	System.out.println("trim3:"+trim3.trim().length());
    }
}