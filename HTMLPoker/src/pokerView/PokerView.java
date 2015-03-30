package pokerView;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pokerController.CardIcons;
import pokerController.InputToValues;
import pokerController.RunRound;
import pokerController.Shuffler;

@WebServlet("/PokerView")
public class PokerView extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	public static RunRound rr = new RunRound();
	
	public PokerView() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String anteText = request.getParameter("ante");
		String walletText = request.getParameter("wallet");
		String playersText = request.getParameter("players");
		
		InputToValues values = new InputToValues(playersText, anteText, walletText);
		values.setPot();
		
		Shuffler s = new Shuffler();
		s.shuffle(values.getPlayers());
		rr.round();
		CardIcons ci = new CardIcons();
		
		PrintWriter out = response.getWriter();
		String title = "Poker";
		String docType = "<!DOCTYPE html>\n";
		out.println(docType + 
				"<html>\n" +
				"<head><title>" + title + "</title><link rel=\"stylesheet\" href=\"style.css\"></head>\n" +
				"<body>\n" +
				"<p>" + title + "</p>\n" +
				"<ul>\n" +
				"	<li><a class=\"list\" href=\"index.html\">Home</a></li>\n" +
				"	<li><a class=\"list\" href=\"poker.html\">Poker</a></li>\n" +
				"	<li><a class=\"list\" href=\"blackjack.html\">Blackjack</a></li>\n" +
				"	<li><a class=\"list\" href=\"war.html\">War</a></li>\n" +
				"<br><br>" +
				"<ul>\n" +
				"<table class=\"pgame\">\n" +
				"	<tr>\n" +
				"		<td>CPU1</td>\n" +
				"		<td>----------</td>\n" +
				"		<td>CPU2</td>\n" +
				"		<td>----------</td>\n" +
				"		<td>CPU3</td>\n" +
				"		<td>----------</td>\n" +
				"		<td>CPU4</td>\n" +
				"	</tr><tr>\n" +
				"		<td>Wallet: $</td>\n" +
				"		<td></td>\n" +
				"		<td>Wallet: $</td>\n" +
				"		<td></td>\n" +
				"		<td>Wallet: $</td>\n" +
				"		<td></td>\n" +
				"		<td>Wallet: $</td>\n" +
				"	</tr><tr>\n" +
				"		<td>&#127136 &#127136 &#127136 &#127136 &#127136</td>\n" +
				"		<td></td>\n" +
				"		<td>&#127136 &#127136 &#127136 &#127136 &#127136</td>\n" +
				"		<td></td>\n" +
				"		<td>&#127136 &#127136 &#127136 &#127136 &#127136</td>\n" +
				"		<td></td>\n" +
				"		<td>&#127136 &#127136 &#127136 &#127136 &#127136</td>\n" +
				"	</tr></table><br><br>\n" +
				"<table class=\"pgame\"><tr>\n" +
				"		<td><button type=\"button\" name=\"fold\">Fold</button></td>\n" +
				"		<td><button type=\"button\" name=\"playhand\">Play Hand</button> </td>\n" +
				"		<td>...............................</td>\n" +
				"		<td>"+ name +"</td>\n" +
				"		<td>...............................</td>\n" +
				"		<td><button type=\"button\" name=\"deal\" autofocus>Deal</button> </td>\n" +
				"		<td><button type=\"button\" name=\"quit\">Quit</button> </td>\n" +
				"	</tr><tr>\n" +
				"		<td></td>\n" +
				"		<td>Ante: $"+ values.getAnte() +"</td>\n" +
				"		<td></td>\n" +
				"		<td>Wallet: $"+ values.getWallet() +"</td>\n" +
				"		<td></td>\n" +
				"		<td></td>\n" +
				"		<td></td>\n" +
				"	</tr><tr>\n" +
				"		<td></td>\n" +
				"		<td>Pot: $"+ values.getPot() +"</td>\n" +
				"		<td></td>\n" +
				"		<td>"+ ci.icons(rr.getP1Cards()) +"</td>\n" +
				"		<td></td>\n" +
				"		<td></td>\n" +
				"		<td></td>\n" +
				"	</tr></table>\n" +
				"</body></html>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		doGet(req, resp);
	}
}
