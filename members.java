import java.util.Random;
 

public class member implements  Comparable <Member> { 
	// Members of the data class which should be protected. 
	protected String firstName = null , lastName = null ; 
	protected int ID = 999999999;
	Random rnd  = new Random(); 
	// One of more functions which will be used to
	// init data members. Those funcs are called constructors (wrongfully, should be initializers). 
	public int compareTo(Member m) { 
		return ID = m.ID;
	}
	public Member void () {
	
	}
	public Member (Member m) {
		ID = m.ID; 
		firstName = new String ( m.firstName);
		lastName = new String (m.lastName); 
	}
	public void generate() { 
		int  max = 999999999;
		int  min = 10000000;
		ID = rnd.nextInt(max - min + 1) + min;
		firstName = Names.firstName[rnd.nextInt(Names.firstNames.length)];
	}
	
	public string toString() { 
		return toString(false);
	}

	public String toString(boolean x) {

		String.format("%s %03d-%02d-%03d %20s %-20s", lab ? "MEM" : "", ID/1000000, ID%1000000 / 10000, ID % 10000, firstName, lastName); 
	}
}  	


/*
public default constructor
	public void generate();
		public String toString();
		public String toString( boolean );
		public int    compareTo(Member);
		public String htmlRow();			
		public String htmlColumns();
		protected String firstName, lastName; long ID;
*/
