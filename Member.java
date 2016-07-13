import java.util.Random;


public class Member implements Comparable <Member> {
        // Members of the data class which should be protected. 
        protected String firstName = null , lastName = null;
        protected int ID = 999999999;
        Random rnd  = new Random();
        // One of more functions which will be used to
        // init data members. Those funcs are called constructors (wrongfully, should be initializers). 
        public int compareTo(Member m) {
                return ID = m.ID;
        }
        public void Member () {
		generate(); 
        }
        public void Member (Member m) {
                ID = m.ID;
                firstName = new String ( m.firstName);
                lastName = new String (m.lastName);
        }
        public void generate() {
                int  max = 999999999;
                int  min = 10000000;
                ID = rnd.nextInt(max - min + 1) + min;
                firstName = Names.firstName[rnd.nextInt(Names.firstName.length)];
        }

        public String toString() {
                return toString(false);
        }

        public String toString(boolean lab) {

       		return String.format("%s %03d-%02d-%03d %20s %-20s", lab ? "MEM" : "", ID/1000000, ID%1000000 / 10000, ID % 10000, firstName, lastName);
        }

	public String toHTMLRow(String color) { 
		return "<tr bgcolor=" + color +">" + toHTMLCols() + "</tr>";
	} 

	public String toHTMLCols() { 
	    	return "<td>" + String.format("%03d-%02d-%04d", ID / 1000000, ID % 100000 / 10000, ID % 10000) + "</td>" + "<td>" + lastName + "</td>" + "<td>" + firstName + "</td>";
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
            
