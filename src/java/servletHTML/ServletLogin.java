package servletHTML;

/**
 *
 * @author EMMANUEL
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int user = Integer.parseInt(req.getParameter("user"));
		int pass = Integer.parseInt(req.getParameter("password"));
		String op= req.getParameter("op");
			response(resp, user, pass, op);
		
	}

	private void response(HttpServletResponse resp, int num1, int num2, String ope)
			throws IOException {
		PrintWriter out = resp.getWriter();
                if(ope.equalsIgnoreCase("suma")){
		out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + (num1+num2) + "</t1>");
		out.println("</body>");
		out.println("</html>");}
                else
                    if(ope.equalsIgnoreCase("resta")){
                        out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + (num1-num2) + "</t1>");
		out.println("</body>");
		out.println("</html>");}
                    
                else
                    if(ope.equalsIgnoreCase("multiplicacion")){
                        out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + (num1*num2) + "</t1>");
		out.println("</body>");
		out.println("</html>");}
                    
                else
                    if(ope.equalsIgnoreCase("division")){
                        out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + (num1/num2) + "</t1>");
		out.println("</body>");
		out.println("</html>");
                    }
                        
	}
        
        private void response(HttpServletResponse resp)
			throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + "No pusiste na" + "</t1>");
		out.println("</body>");
		out.println("</html>");
	}
}