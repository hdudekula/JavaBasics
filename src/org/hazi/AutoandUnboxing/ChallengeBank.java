package org.hazi.AutoandUnboxing;

import java.util.ArrayList;

public class ChallengeBank {
	
	private ArrayList<ChallengeBranches> branches;
	private String bankName;
	public ChallengeBank(String bankName) {
		super();
		this.bankName = bankName;
		this.branches = new ArrayList<ChallengeBranches>();
	}
	public ArrayList<ChallengeBranches> getBranches() {
		return branches;
	}
	public String getBankName() {
		return bankName;
	}
	
	public String addBranches(ChallengeBranches name){
		branches.add(name);
		return this.addBranches(name);
	
	}
	
	

}
