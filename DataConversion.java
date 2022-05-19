package com.vstl.javatraining;

public class DataConversion {
	

	//integer to string
	
public void EmplyoeeWorkingTime(int intTime) {
		
		String strTime="9";
	    String strConversionTime=String.valueOf(intTime);
		
	    if(strConversionTime.equals(strTime)) {
	    	System.out.println(" Working hours start");
	    }else {
	    	System.out.println(" working hours not started ");
	    }
		
	}
	
	//double to string
	
public void ArmyBoyscandidateWeight(double doubleWeight) {
		
		double doubleWeight1=50;
		double doubleconvertedWeight =Double.valueOf(doubleWeight1);
		
		
	    if(doubleconvertedWeight>doubleWeight1) {
	    	System.out.println("weight of candidate is sutable");
	    }else {
	    	System.out.println(" weight of candidate is not sutable ");
	    }
		
	}


	//String to integer


public void StudentAdmission (String strAge) {
      int intAge =7;
      int intConversionAge=Integer.parseInt(strAge);

     if( intConversionAge>intAge) {
	     System.out.println("Student is eligible for Admission ");
        }else {
	      System.out.println("Student is  not eligible for Admission");
        }
  }
 
   // String to double

public void LoanAmount(String strAmount) {
    double doubleamount =4567.90;
    double doubleConversionAge=Double.parseDouble(strAmount);

   if( doubleConversionAge>=doubleamount) {
	     System.out.println("loan Approved ");
      }else {
	      System.out.println("loan not Approved");
      }
}

   //String to boolean
public void PrimeMinister(String strPrimeMinister) {
	String booleanPrimeMinister="true";
    boolean strPrimeMinister1 =Boolean.parseBoolean(booleanPrimeMinister);
    
     System.out.println(strPrimeMinister1);
 
}

//char to integer
public void percentageGrade(char charGrade) {

	char chargrade='A';
	int  intGrade= chargrade;
	System.out.println(intGrade);
	int  intGradeB= Character.getNumericValue(chargrade);
	System.out.println(intGradeB);

}
//integer to character
public void gradepercentage(int intpercentage) {

	int intpercentagevalue=78;
	char chargrade=(char)(intpercentagevalue);
	System.out.println(chargrade);

}
}
