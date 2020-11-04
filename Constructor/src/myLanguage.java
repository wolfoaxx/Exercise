
public class myLanguage {
	String language;
	
	
	myLanguage(){
		this.language = " \n1.Malay (100%) \n2.English (50%)";
	}
	
	myLanguage(String l){
		this.language = l;
	}
	
	public void getLanguage() {
		System.out.println("Language : " + language);
	}
	
	public void getLanguage2() {
		myLanguage la = new myLanguage(" \n1.Malay (100%) \n2.English (50%)");
		
		System.out.println("Language: " + la.language);
	}
}
