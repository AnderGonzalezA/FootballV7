package com.zubiri.football;

public class FootballMatch {

	private Team localTeam;
	private Team visitorTeam;
	private int goalsLocal = 0;
	private int goalsVisitor = 0;

	public FootballMatch(Team local_team, int local_goals, Team visitor_team, int visitor_goals) {
		this.setLocalTeam(local_team);
		this.setGoalsLocal(local_goals);
		this.setVisitorTeam(visitor_team);
		this.setGoalsVisitor(visitor_goals);
	}

	public Team getLocalTeam() {
		return this.localTeam;
	}

	public void setLocalTeam(Team LocalTeam) {
		this.localTeam = LocalTeam;
	}

	public Team getVisitorTeam() {
		return visitorTeam;
	}

	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam = visitorTeam;
	}

	public int getGoalsLocal() {
		return goalsLocal;
	}

	public void setGoalsLocal(int goalsLocal) {
		this.goalsLocal = goalsLocal;
	}

	public int getGoalsVisitor() {
		return goalsVisitor;
	}

	public void setGoalsVisitor(int goalsVisitor) {
		this.goalsVisitor = goalsVisitor;
	}

	public String printFormatted() {
		String localTeamInformation = this.getLocalTeam().printFormatted();
		int localTeamGoals = this.getGoalsLocal();
		String visitorTeamInformation = this.getVisitorTeam().printFormatted();
		int visitorTeamGoals = this.getGoalsVisitor();
		return localTeamInformation + "  " + localTeamGoals + "  " + visitorTeamInformation + "  " + visitorTeamGoals;
	}
}