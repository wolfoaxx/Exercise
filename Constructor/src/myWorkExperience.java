
public class myWorkExperience {
	
	String workexperience;
	
	myWorkExperience() {
	this.workexperience = "\n1 Food restaurant crew";
	}
	
	myWorkExperience(String w){
		this.workexperience = w;
	}
	
	public void getWorkExperience() {
		System.out.println("Work Experience: " + workexperience);
	}
	
	public void getWorkExperience2() {
		myWorkExperience we = new myWorkExperience("1.Food restaurant crew");
		System.out.println("Work Experience: " + we.workexperience);
	}

}
