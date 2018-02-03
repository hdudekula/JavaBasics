package org.hazi.scope;

public class ScopeDemo {
	public int publicVar = 0;
	private int privateVar = 1;
	
	public ScopeDemo() {
		System.out.println("ScopeDemo is created");
	}

	public int getPrivateVar() {
		return privateVar;
	}
	
	public void twoTimes(){
		 int privateVar = 2;
		for(int i=0; i<10; i++){
			//below line prints the value of local variable i.e.2
			System.out.println(i + "times " +i*privateVar);
			//below line prints the value set at class level i.e. 1 as we have used this keyword. 
			System.out.println(i + " times " +i*this.privateVar);
		}
	}
	
	//below is example of InnerClass
	
	public  class InnerScope {
		private int privateVar = 4;

		public InnerScope() {
			super();
		}

		public int getPrivateVar() {
			return privateVar;
		}
		
		public void twoTimes(){
			 int privateVar = 5;
			 
			 for(int i=0; i<=10; i++){
				 
				 //below line prints the local variable of privateVar i.e. 5
				System.out.println(i + " times "+i*privateVar);
				 //below line prints the local variable of InnerClass as we are using this keyword
				 System.out.println(i + " times " +i*this.privateVar);
				 //below line prints the local variable of parent class as we are using parent class along with this keyword
				 System.out.println(i + " times "+i*ScopeDemo.this.privateVar);
			 }
		}
	}

}
