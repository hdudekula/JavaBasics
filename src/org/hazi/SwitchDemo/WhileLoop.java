package org.hazi.SwitchDemo;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		while(i <= 20){
			if(!isEvenNumber(i)){
				i++;
				continue;
			}
			System.out.println("the even number "+i);
			i ++;
			count ++;
			if(count >= 5){
				
				break;
			}
			
		}
		System.out.println(count);
		

	}
	public static boolean isEvenNumber(int i)
	{
		i = i % 2;
		if (i == 0){
			
			return true;
		}else {
			return false;
		}
	
		
	}

}
