package it.polito.tdp.PremierLeague.db;

public class TestDao {

	public static void main(String[] args) {
		TestDao testDao = new TestDao();
		testDao.run();
	}
	
	public void run() {
		
		// prove dao 
		
		PremierLeagueDAO dao = new PremierLeagueDAO();
		System.out.println("Players:");
//		System.out.println(dao.listAllPlayers());
		System.out.println("Teams:");
		System.out.println();
		System.out.println(dao.listAllTeams());
		System.out.println("Actions:");
		System.out.println(dao.listAllActions());
		System.out.println("Matches:");
		System.out.println(dao.listAllMatches());
		
	}

}
