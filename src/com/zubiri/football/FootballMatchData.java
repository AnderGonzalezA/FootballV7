package com.zubiri.football;

public class FootballMatchData {
	public Team localTeam;
	public Team visitorTeam;
	public int goalsLocal;
	public int goalsVisitor;

	public FootballMatchData(int goalsLocal, int goalsVisitor) {
		this.goalsLocal = goalsLocal;
		this.goalsVisitor = goalsVisitor;
	}
}