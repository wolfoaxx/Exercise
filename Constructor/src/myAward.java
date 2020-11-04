
public class myAward {
	String award;
	
	
	myAward(){
		this.award = "none";
				
	}
	
	myAward(String m){
		this.award = m;
	}
	
	public void getAward() {
		System.out.println("Awards & Certificate: " + award);
	}
	
	public void getAward2() {
		myAward aw = new myAward("none");
		System.out.println("Award & Certificate: " + aw.award);
	}
}
