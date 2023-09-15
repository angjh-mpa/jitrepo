package gov.mpa.backend;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class MPAServlet
 */

public class MPAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String HTML_START = "<html><body>";
	public static final String HTML_END = "</body></html>";
	public static List<String> givenList = new ArrayList();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MPAServlet() {
		super();
		// TODO Auto-generated constructor stub

		givenList.add("Logic will get you from A to B. Imagination will take you everywhere.");
		givenList.add("There are 10 kinds of people. Those who know binary and those who don't.");
		givenList.add("There are two ways of constructing a software design. One way is to make it\r\n"
				+ "so simple that there are obviously no deficiencies and the other is to make\r\n"
				+ "it so complicated that there are no obvious deficiencies.");
		givenList.add("It's not that I'm so smart, it's just that I stay with problems longer.");
		givenList.add("It is pitch dark. You are likely to be eaten by a grue.");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int tmpR = rand.nextInt(givenList.size());
		System.out.println("doGET --> " + tmpR);
		String randomElement = givenList.get(tmpR);

		String destination = "/start.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);

		request.setAttribute("quote", randomElement);

		requestDispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter out = response.getWriter();
//		Date date = new Date();
//		out.println(HTML_START + "<h2>Hi There!</h2><br/><h3>Date=" + date + "</h3>" + HTML_END);

		doGet(request, response);
	}

}
