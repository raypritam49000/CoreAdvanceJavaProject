package com.upload.file;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

public class UploadFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor=yellow>");
		String nm = request.getParameter("txtname");
		out.println("user Id:" + nm);

		// String p = this.getServletConfig().getServletContext().getRealPath("upload");

		String p = "F:\\MyAllPorgrams\\Java Framework\\MySpringFramework\\FileUploadingDemo\\src\\main\\resources\\upload";

		MultipartRequest mpr = new MultipartRequest(request, p, 20 * 1024 * 1024);

		String st = mpr.getOriginalFileName("file");
		out.println(st);
		String id = mpr.getParameter("txtname");
		out.println("user Id=" + id);
		out.println(st + "file uloaded.....");
		out.println("</body></html>");
		out.close();

	}

}
