
public class StartingOrc extends baseAttributes{

	public static int[] createBase(){
		startingAttributes[0] = 4;
		startingAttributes[1] = 1;
		startingAttributes[2] = 1;
		startingAttributes[3] = 3;
		startingAttributes[4] = 1;
		startingAttributes[5] = 1;
		startingAttributes[6] = 1;
		startingAttributes[7] = 1;
		startingAttributes[8] = 1;
		startingAttributes[9] = 6;
	
		return startingAttributes;
	}
	
	public static int[] createMax(){
		maxAttributes[0] = 9;
		maxAttributes[1] = 6;
		maxAttributes[2] = 6;
		maxAttributes[3] = 8;
		maxAttributes[4] = 6;
		maxAttributes[5] = 5;
		maxAttributes[6] = 6;
		maxAttributes[7] = 5;
		maxAttributes[8] = 6;
		maxAttributes[9] = 6;
		
		return maxAttributes;
	}
	
	public static String specialAttribute(){
		return "Low Light Vision";
	}
	
}
