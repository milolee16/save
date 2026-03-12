package com.mz.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Reg")
public class Reg extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		// 1. 값 받기
		String n = request.getParameter("name");
		String i = request.getParameter("id");
		String p = request.getParameter("pw");
		String g = request.getParameter("gender");
		String a = request.getParameter("addr");
		String[] inter = request.getParameterValues("interest");
		String intro = request.getParameter("introduce");

		// 콘솔에 다 출력
		System.out.println(n);
		System.out.println(i);
		System.out.println(p);
		System.out.println(g);
		System.out.println(a);
		String inter2 = "";
		if (inter != null) {

			for (String ss : inter) {
				inter2 += ss + " "; // food excer
			}
		}else {
			inter2 = "관심사 없음";
		}
		System.out.println(intro);

		// 브라우저에 뭘 쓰고 싶음 (html)
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");

		out.print("<head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<link rel=\"stylesheet\" href=\"reg.css\" />");
		out.print("</head>");

		out.print("<body>");

		out.print("<div class=\"container\">\r\n" + "        <div class=\"items\">\r\n"
				+ "          <div class=\"item1\">Name</div>\r\n" + "          <div class=\"item2\">\r\n" + n
				+ "          </div>\r\n" + "        </div>\r\n" + "        <div class=\"items\">\r\n"
				+ "          <div class=\"item1\">ID</div>\r\n" + "          <div class=\"item2\">\r\n" + i
				+ "          </div>\r\n" + "        </div>\r\n" + "        <div class=\"items\">\r\n"
				+ "          <div class=\"item1\">PW</div>\r\n" + "          <div class=\"item2\">\r\n" + p
				+ "          </div>\r\n" + "        </div>\r\n" + "        <div class=\"items\">\r\n"
				+ "          <div class=\"item1\">Gender</div>\r\n" + "          <div class=\"item2\">\r\n" + g
				+ "          </div>\r\n" + "        </div>\r\n" + "        <div class=\"items\">\r\n"
				+ "          <div class=\"item1\">Addr</div>\r\n" + "          <div class=\"item2\">\r\n" + a
				+ "          </div>\r\n" + "        </div>\r\n" + "        <div class=\"items inter\">\r\n"
				+ "          <div class=\"item1\">Interest</div>\r\n" + "          <div class=\"item2 interest\">\r\n"
				+ "            <div>\r\n" + inter2 + "            </div>\r\n" + "          </div>\r\n"
				+ "        </div>\r\n" + "        <div class=\"items text\">\r\n"
				+ "          <div class=\"item1\">Introduce</div>\r\n" + "          <div class=\"item2\">\r\n" + intro
				+ "          </div>\r\n" + "        </div>\r\n" + "      </div>");

		out.print("</body>");
		out.print("</html>");

	}

}
