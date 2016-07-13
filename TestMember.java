public class TestMember { 
    Member ms[] = new Member [40]; 
    public static void main (String args []){
    fill();
    }

	void fill(){
	for (int i = 0; i < ms.length; i++){
			ms[i] = new Member(); 
		}
	}	
	
	void show() { 
		for (int i =0; i < ms.length; i++)
		{ 
			System.out.printf("%03d %-60s\n," i+1, i%2 == 0 ? ms[i].toString : ms[i].toString(true)); 
		}	

	}	    
