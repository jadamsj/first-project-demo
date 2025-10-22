public class Main 
{
    

    public static void main(String[] args) {
        
        System.out.println("\n\n\n\n - Alex's Group below:");
        System.out.println("------------------------------------------------");
        AlexWestGroup();
        System.out.println("\n\n\n\n - Dominic's Group below:");
        System.out.println("------------------------------------------------");
        DominicCappuccilliGroup();
        System.out.println("\n\n\n\n - Mark's Group below:");
        System.out.println("------------------------------------------------");
        MarkBonhamGroup();
    }
    public static void AlexWestGroup(){
        
            int m = 1;
            int d;
            int mD = 30;


            while(m < 13){
                if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
                    mD = 31;
                    System.out.println();
                    System.out.println(m + ": " + mD +" days");
                }else if (m == 2){
                    mD = 28;
                    System.out.println();
                    System.out.println(m + ": " + mD +" days");
                }else{
                    mD = 30;
                    System.out.println();
                    System.out.println(m + ": " + mD +" days");
               }
                for (d = 1; d <= mD; d++){
                    System.out.print(d + " ");
                }
                m++;  
            }
    }
    
    public static void DominicCappuccilliGroup(){
        
        //declare variables
        int numDays = 31;
        int monthNum = 1;

        //Loop and output
        while (monthNum < 13) {
           System.out.print(monthNum + " ");
           numDays = 31;
           System.out.println(" ");
           if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11) {
                numDays = 30;
           } else if (monthNum == 2) {
                numDays = 28;
           }
           // System.out.print(" ");    
           for(int x = 1; x <= numDays; x++) {
              System.out.print(x + " ");
           }
           System.out.println(" ");
           monthNum++;
        }

    }
    
    public static void MarkBonhamGroup(){
        		int maxDays = 0;
		int dayOfWeek = 0;
		
		final String [] dayOfTheWeek = {"S", "M", "T", "W", "T", "F", "S"};
	    int firstDayOfMonth = 3;
		
		// Start the day of week index 
		dayOfWeek += firstDayOfMonth;
		    
		// Loop the months
		for (int month = 1; month<=12; month++){
		
		    // Write months to the console
		    switch(month) {
		        case 1:
		            System.out.println("Jan");
		            maxDays = 31;
		            break;
		        case 2:
		            System.out.println("Feb");
		            maxDays = 28;
		            break;
		        case 3:
		            System.out.println("Mar");
		            maxDays=31;
		            break;
		        case 4:
		            System.out.println("Apr");
		            maxDays=30;
		            break;
		        case 5:
		            System.out.println("May");
		            maxDays=31;
		            break;
		        case 6:
		            System.out.println("Jun");
		            maxDays=30;
		            break;
		        case 7:
		            System.out.println("Jul");
		            maxDays=31;
		            break;
		        case 8:
		            System.out.println("Aug");
		            maxDays=31;
		            break;
		        case 9:
		            System.out.println("Sep");
		            maxDays=30;
		            break;
		        case 10:
		            System.out.println("Oct");
		            maxDays=31;
		            break;
		        case 11:
		            System.out.println("Nov");
		            maxDays=30;
		            break;
		        case 12:
		            System.out.println("Dec");
		            maxDays=31;
		            break;
		        
		    }
		    
		    // Put the days of the days of week
		    for (int day = 0; day <7; day++) {
		     
		        System.out.print("  " + dayOfTheWeek[day]);
		        
		    }
		    
		    System.out.println(" ");
		    
		    // Move the day number under the week day
		    for (int spaceMe = 0; spaceMe < dayOfWeek; spaceMe++){
		                
		        System.out.print("   ");
		                
		    }
		    
            // Loop the days
		    for (int day = 1; day <= maxDays; day++) {
		        
		        // Need space between numbers - 2 space for one digit, 1 space for 2 digits
		        if (String.valueOf(day).length() == 1) {
		            
		            System.out.print("  ");
		            
		        } else {
		            
		            System.out.print(" ");
		            
		        }
		        
		        // Write days to the console
		        System.out.print(day);
		        
		        // Increment the day of the week
		        dayOfWeek++;
                
                // If at the end of the week, break the line
                if (dayOfWeek == 7) {
                    
                    // Line break
                    System.out.println(" ");
                    
                    // Reset the day of week index
                    dayOfWeek = 0;
                    
                }
                
		    }
		    
		    // Return two lines between months
		    System.out.println(" ");
		    System.out.println(" ");
		    