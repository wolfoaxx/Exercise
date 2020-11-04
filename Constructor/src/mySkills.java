
public class mySkills {
String skills;

	mySkills(){
		this.skills = "\n1.MS Package(80%) \n2.Video editing(50%) \n3.Java Programming(40%) \n4.Gaming(50%)";
	}
	
	mySkills(String m){
		this.skills = m;
	}
	
	public void getSkills() {
		System.out.println("Skills: " + skills);
	}
	
	public void getSkills2() {
		mySkills ss = new mySkills("\n1.MS Package(80%) \n2.Video editing(50%) \n3.Java Programming(40%) \n4.Gaming(50%)");
		System.out.println("Skills: " + ss.skills);
	}
}
