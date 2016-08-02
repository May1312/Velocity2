package com.helian;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;    
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
}