double score; 
	 Scanner myObj = new Scanner(System.in); 
	 System.out.println("Enter Score");
	 double sc = myObj.nextDouble() ;
	 if(sc>=80 && sc<=90)
	 {
		 sc = sc+5 ; 
	 }
	 System.out.println((double)sc);

	}