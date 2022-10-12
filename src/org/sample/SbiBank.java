package org.sample;


public class SbiBank extends RbiBank {
	
	
	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("savings intrest is 3%");
		super.savings();
	}
		
	

	public static void main(String[] args) {
		SbiBank s = new SbiBank();
		
		s.savings();
		s.deposit();
		s.fixed();
		
		
	}
}
