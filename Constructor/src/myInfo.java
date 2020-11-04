
public class myInfo {
String name;
char gender;
String birthday;
String age;
String status;
String citizenship;
String address;
String phonenumber;
char examresult;

	myInfo(){
	this.name= "Amirul Husni Bin Adnan";
	this.gender ='M';
	this.birthday = "3 October 1998";
	this.age = "22 years old";
	this.status = "Single";
	this.citizenship = "Malaysia";
	this.address = "197,Taman Mahsuri,06000,Jitra,Kedah";
	this.phonenumber = "017-5223818";
	this.examresult = 'A';
	
}
	myInfo(String n,char g,String b,String a, String s, String c, String ad,String pn,char er){
		this.name= n;
		this.gender =g;
		this.birthday = b;
		this.age = a;
		this.status = s;
		this.citizenship = c;
		this.address = ad;
		this.phonenumber = pn;
		this.examresult = er;
	}
	
	public void getInfo() {
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Birthday: " + birthday);
		System.out.println("Age: " + age);
		System.out.println("Marital status: " +status );
		System.out.println("Citizenship: " + citizenship);
		System.out.println("Home Address: " + address);
		System.out.println("HP: " + phonenumber);
		System.out.println("Exam Result(STIA1113): " + examresult);
	}
	
	public void getinfo2() {
		myInfo ai = new myInfo("Amirul Husni Bin Adnan",'M',"3 October 1998","22 years old", "Single", "Malaysia", "197,Taman Mahsuri,06000,Jitra,Kedah", "017-5223818",'A' );
		System.out.println("Name: " + ai.name);
		System.out.println("Gender: " + ai.gender);
		System.out.println("Birthday: " + ai.birthday);
		System.out.println("Age: " + ai.age);
		System.out.println("Marital status: " + ai.status );
		System.out.println("Citizenship: " + ai.citizenship);
		System.out.println("Home Address: " + ai.address);
		System.out.println("HP: " + ai.phonenumber);
		System.out.println("Exam Result(STIA1113): " + ai.examresult);
	}
}
