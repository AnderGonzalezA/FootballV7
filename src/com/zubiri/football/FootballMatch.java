package com.zubiri.football;

public class FootballMatch {

	public Team localTeam;
	public Team visitorTeam;
	public int goalsLocal;
	public int goalsVisitor;

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
		return this.visitorTeam;
	}

	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam = visitorTeam;
	}

	public int getGoalsLocal() {
		return this.goalsLocal;
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