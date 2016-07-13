public class TestStudent { 
    public static void main(String args []){
	Student s1 = new Student(); 
	System.out.printf("s1 = %20s\n", s1); 
	// testing the copy constructor 
	Student s2 = new Student (s1);

	System.out.printf("s1(s2) = %20s\n", s2); 
    }	
}	
