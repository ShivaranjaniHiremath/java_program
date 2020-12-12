public class BranchSubject {

		@SuppressWarnings("null")
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				String branch = null;
				String subject = null;
				
				switch(branch) {
				
				case "ECE"	: System.out.println("enter the subject");
								
								
								switch(subject) {
								
								case "DE"	: System.out.println("Syllabus is boolean algebra");
												break;
								case "SS"	: System.out.println("Syllabus is discrete system");
												break;
								case "DSP"	: System.out.println("syllabus is fourier trasformation");
												break;
								default		: System.out.println("enter the correct subject");
												break;
								}	
							  break;
				
				
				case "CSE"	: System.out.println("enter the subject");
				
				
								switch(subject) {
				
								case "ME"	: System.out.println("Syllabus is buisiness environment");
												break;
								case "OS"	: System.out.println("Syllabus is threads");
												break;
								case "DBMS"	: System.out.println("syllabus is database");
												break;
								default		: System.out.println("enter the correct subject");
												break;
								}	
							  break;
							  
							  
				case "Mech" : System.out.println("enter the subject");
				
				
								switch(subject) {
				
								case "DOM"	: System.out.println("Syllabus is haha1 ");
												break;
								case "TOM"	: System.out.println("Syllabus is haha2");
												break;
								case "CAD"	: System.out.println("syllabus is haha3");
												break;
								default		: System.out.println("enter the correct subject");
												break;
								}	
							  break;
							  
							  
				case "Civil": System.out.println("enter the subject");
				
								switch(subject) {
				
								case "survey"	: System.out.println("Syllabus is survey of play ground");
												break;
								case "CAD"	: System.out.println("Syllabus is solids");
												break;
								case "beams"	: System.out.println("syllabus is beams");
												break;
								default		: System.out.println("enter the correct subject");
												break;
								}	
								break;
				default 	: System.out.println("you have not entered the correct branch");	
								break;
				}
		}

	}

}
