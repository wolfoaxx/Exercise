
public class cgpa {
	double[] gpa = new double[5];
	   double total =0;
	
	cgpa() {
		gpa[0] = 3.2;
		gpa[1] = 3.4;
		gpa[2] = 3.6;
		gpa[3] = 3.6;
		gpa[4] = 3.4;
	}
	
	cgpa(double c[]){
		this.gpa = c;
	}
	
	public void getGPA() {
		System.out.println("Sem 1: " + gpa[0]);
		System.out.println("Sem 2: " + gpa[1]);
		System.out.println("Sem 3: " + gpa[2]);
		System.out.println("Sem 4: " + gpa[3]);
		System.out.println("Sem 5: " + gpa[4]);
		for(int i =0; i<gpa.length; i++) {
		total = total + gpa[i];}
		double cgpa = total / gpa.length;
		System.out.println("CGPA: " +cgpa);
		
		

		}
		public void getGPA2() {
			cgpa cc = new cgpa(new double[] {3.2,3.4,3.6,3.6,3.4});
			
			for(int i=0; i<gpa.length; i++) {
				System.out.println("Sem " + (i+1 ) +" "+  cc.gpa[i]);}
			for(int i =0; i<gpa.length; i++) {
				double total =+ gpa[i];}
				double cgpa2 = total / gpa.length  ;
				System.out.println("CGPA: " +cgpa2);
				
				
				
			
		}
		
	}

