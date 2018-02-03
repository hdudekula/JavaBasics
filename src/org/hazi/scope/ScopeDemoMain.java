package org.hazi.scope;

public class ScopeDemoMain {

	public static void main(String[] args) {
		ScopeDemo scopeInstance = new ScopeDemo();
		scopeInstance.getPrivateVar();
		scopeInstance.twoTimes();
		
		System.out.println("*****************");
		
		ScopeDemo.InnerScope scopeInstance1 = scopeInstance.new InnerScope(); 
		scopeInstance1.twoTimes();

	}

}
