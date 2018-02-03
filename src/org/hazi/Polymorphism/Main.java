package org.hazi.Polymorphism;

class Movie {
	private String name;

	public Movie(String name) {
		this.name = name;
	}
	public String plot(){
		return "no plot here";
	}
	public String getName(){
		return name;
	}
}

class Bahubali extends Movie {
	public Bahubali(){
		super("bahubali");
	}
	public String plot(){
		return "fight between brothers";
	}
}

class Khaidi extends Movie {
		public Khaidi() {
		super("Khaidi");
	}
		public String plot(){
			return "Chiranjeevi 150th movie";
		}
}

class Gauthami extends Movie {

	public Gauthami() {
		super("Gauthami Putra Sathakarni");
		
	}
	
	public String plot(){
		return "fight for kingdom";
	}
	
}

class Nothing extends Movie {

	public Nothing() {
		super("nothing");
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		for (int i=1; i<10; i++){
			Movie movie = randomMovie();
			System.out.println("the randomNumber is "+i + "\n "+
									" the movie name is "+movie.getName() + "\n" +
										" the plot is "+movie.plot());
		}

	}


public static Movie randomMovie(){
	int randomNumber = (int) (Math.random() *4) + 1;
	System.out.println("the randomNumber generated was "+randomNumber);
	switch(randomNumber){
	case 1 : return new Bahubali();
	
	case 2 : return new Khaidi();
	
	case 3 : return new Gauthami();
	
	case 4 : return new Nothing();
	
	}
	return null;
	
}

}
