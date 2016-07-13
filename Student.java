import java.util.Random;


public class Student extends Member {
        // Members of 1the data class which should be protected. 
        protected String major = null; 
        protected double GPA = 0; 
        Random rnd  = new Random();
        // One of more functions which will be used to
        // init data members. Those funcs are called constructors (wrongfully, should be initializers). 
        public int compareTo(Member m) {
                return ID - m.ID;
        }
        public Student () {
		generate(); 
        }
        public Student (Member m) { 
               	super();  
        	generate();
	}

        public void generate() {
	    	super.generate(); 
                int  max = 400;
                int  min = 200;
                GPA = (rnd.nextInt(max - min + 1) + min)/100;;
                major = Names.department[rnd.nextInt(Names.department.length)];
        }

        public String toString() {
                return toString(false);
        }

        public String toString(boolean lab) {
		return String.format("%s %s %1.2f %20s", lab ? "STU": "", super.toString(false), GPA, major == null ? "null": major); 
		
	}
	public String toHTMLRow(String color) { 
	   	return String.format("<TR BGCOLOR=%s> %s</TR>", color, toHTMLCols()); 
	} 

	public String toHTMLCols() { 
	   	return String.format("%s <TD>%1.2f </TD><TD>%s </TD>", super.toHTMLCols(), GPA, major); 
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
            
