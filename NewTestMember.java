import java.util.*; 

public class NewTestMember {

    static Random rnd = new Random(); 
    static Vector<Member> mv = new Vector<Member>(); 

    public static void main(String [] args) {
	Scanner input = new Scanner(System.in); 
	char command; 
	int number;


	do { 
	    System.out.print("Enter H/h/ for help or command: ");
	    command = input.next().charAt(0); 
	    command = Character.toLowerCase(command);
	    switch (command) { 
		case 'h':
		case '?': 
		    printMenu(); 
		    break;
		case 'g': 
		    System.out.print("Enter number of objects to generate: ");
		    number = input.nextInt(); 
		    fillArray(number); 
		    break; 
		case 'v': 
		    displayMembers(); 
		    break; 
		case 's': 
		    Collections.sort(mv); 
		    break; 
		case 'o': 
		    save(); 
		    break; 
	    	case 'f': 
		    showHTML(); 
		    break; 
	    }

	} while (true);  

    } 
    public static void printMenu() {
	System.out.println("\n\n" +

		" ================ CS 394 Assignment 1 =============== \n" + 
		"G/g:  Ask for a N, and generate N members of mixed \n" +  
		"Member class's objects, and store in a Vector\n"+ 
		"and a array Objects.\n"+ 

		"S/s/: Sort the members in the vector and array in"+  
		"ascending order.\n"+  

		"V/v/: Show the members in the vector and array \n"+  

		"O/o/: Save objects inside vector into a HTML file\n"+ 
		"with objects saved in the format of HTML\n"+
		"Table.\n"+
		"F/f  : Show HTML file contents on screen.\n" +

		"L/l  : Launch the default internet browser to\n" + 
		"display the generated HTML file.\n"+
		"--------------------------------------------------"+
		"H/h/?: Display this menu.\n"+
		"E/e  : Exit\n"+
		"=================================================\n\n "); 
    }

    public static void fillArray (int n) {
	for (int i = 0; i < n; i++){
	    mv.add(getMember()); 
	}


    }

    public static Member getMember() { 
	int type = rnd.nextInt(5);
	switch (type) { 
	    case 0: return new Member();  
	    case 1: return new Student(); 
	    case 2: return new Employee(); 
	    case 3: return new Faculty(); 
	    case 4: return new Staff(); 
	} 

    }

    public static void displayMembers(){ 
	for (int i = 0; i < mv.size(); i++){
	    System.out.printf("%s\n", mv.get(i)); 

	}
    }

    public static void save(){ 
	String colors[] = {"Beige", "Azure"}; 
	try {
	    PrintWriter fOut = new PrintWriter("Member.html"); 
	    fOut = println("<html> \n <body> \n\t <table border=1>"); 
	    for (int i = 0; i < mv.size(); i++){
		Member m = mv.get(i); 
		fOutprintf("\n\n\t%s", m.toHTMLRow(toHTML[1%2]));

	    }
	} catch (Exception e){
	    e.printStackTrace();
	}

    }

	public static void showHTML(){ 
		File file = null; 
	    	try { 
		    file = new File("Member.html"); 

		    Scanner fScan = new Scanner (file); 
		    String s = null; 
		    System.out.println("=============================="); 
		    while (fScan.hasNext()){
			f = fScan.nextLine();
			System.out.println(s); 
		}
		System.out.println("==============================");
		} catch (FileNotFoundException e){ 
		    e.printStackTrace(); 
		}

	}

}


