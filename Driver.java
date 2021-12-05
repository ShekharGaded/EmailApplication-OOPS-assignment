import java.util.Scanner;

public class Driver {

		public static void main(String[] args) {
			CredentialService cs = new CredentialService();
			Employee e1 = new Employee("Shekhar", "Gaded");
			
			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical \n2. Admin \n3. HR \n4. Legal");
			
			int choice;
			Scanner kb = new Scanner(System.in);
			choice=kb.nextInt();
			System.out.println("Dear "+ e1.getFirstName() +" your generated credentials are as follows");
			switch(choice) {
			
			case 1:
				System.out.println("Email   ---> "+e1.getFirstName().toLowerCase()+e1.getLastName().toLowerCase()+"@techincal."+cs.generateEmailAddress(e1));
				break;
			case 2:
				System.out.println("Email   ---> "+e1.getFirstName().toLowerCase()+e1.getLastName().toLowerCase()+"@admin."+cs.generateEmailAddress(e1));
				break;
			case 3:
				System.out.println("Email   ---> "+e1.getFirstName().toLowerCase()+e1.getLastName().toLowerCase()+"@hr."+cs.generateEmailAddress(e1));
				break;
			case 4:
				System.out.println("Email   ---> "+e1.getFirstName().toLowerCase()+e1.getLastName().toLowerCase()+"@legal."+cs.generateEmailAddress(e1));
				break;
					
			}
			
			cs.showCredentials(e1);
			
		}
}
