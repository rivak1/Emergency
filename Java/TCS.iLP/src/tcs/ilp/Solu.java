package tcs.ilp;

public class Solu {
	
  public static boolean checkEmails(Cut c1 ,Cut c2, String Domain)
	{
	  	System.out.println(c1.email);

	  	System.out.println(c2.email);
	  	int c1index2 = c1.email.indexOf('.') ;
	  	
	  	int c1index1 = c1.email.indexOf('@');
	  	
	  	String C1domain = c1.email.substring(c1index1+1,c1index2);
	  	
	  	int c2index2 = c2.email.indexOf('.') ;
	  	
	  	int c2index1 = c2.email.indexOf('@');
	  	
	  	String C2domain = c2.email.substring(c2index1+1,c2index2);
	  	
	  	if(Domain.compareTo(C1domain) == 0 && Domain.compareTo(C2domain)==0)
	  	{
	  		return true;
	  	}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cut c1 = new Cut(1, "xyz", "xyz@yahoo.com");
		Cut c2 =new Cut(2, "abc", "abc@yahoo.com");
		System.out.println(checkEmails(c1,c2,"yahoo"));

	}

}
