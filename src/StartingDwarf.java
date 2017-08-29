
public class StartingDwarf extends baseAttributes{
	
	public static int[] createBase(){
		startingAttributes[0] = 3;
		startingAttributes[1] = 1;
		startingAttributes[2] = 1;
		startingAttributes[3] = 3;
		startingAttributes[4] = 2;
		startingAttributes[5] = 1;
		startingAttributes[6] = 1;
		startingAttributes[7] = 1;
		startingAttributes[8] = 1;
		startingAttributes[9] = 6;
	
		return startingAttributes;
	}
	
	public static int[] createMax(){
		maxAttributes[0] = 8;
		maxAttributes[1] = 6;
		maxAttributes[2] = 5;
		maxAttributes[3] = 8;
		maxAttributes[4] = 7;
		maxAttributes[5] = 6;
		maxAttributes[6] = 6;
		maxAttributes[7] = 6;
		maxAttributes[8] = 6;
		maxAttributes[9] = 6;
		
		return maxAttributes;
	}
	
	public static String specialAttribute(){
		return "Thermographic Vision/n+2 dice for pathogen and toxin resistance"
				+ "/n+20% increased Lifestyle cost";
	}
	

}
