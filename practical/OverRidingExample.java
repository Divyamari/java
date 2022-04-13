class Bank{
int GetRateOfInterest(){
return 0;
}
}

class SBI extends Bank{
int GetRateOfInterest(){
return 8;
}
}

class ICICI extends Bank{
int GetRateOfInterest(){
return 7;
}
}

class Axis extends Bank{
int GetRateOfInterest(){
return 6;
}
}

class OverRidingExample{
public static void main(String args[]){
	SBI s = new SBI();
	ICICI i = new ICICI();
	Axis a = new Axis();
	
	System.out.println("SBI Rate of interest:" +s.GetRateOfInterest());
	System.out.println("ICICI Rate of interest:" +i.GetRateOfInterest());
	System.out.println("Axis Rate of interest:" +a.GetRateOfInterest());
	}
}