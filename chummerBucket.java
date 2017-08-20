
public class chummerBucket {

public static void main (String[] args){
		
		int[] attributes = new int[10];
		
		StartingOrc human = new StartingOrc();
		Priority resources = new Priority();
		Magic spells = new Magic();
		
		attributes = human.createBase();
		
		for(int i = 0; i<9; i++){
			System.out.println(attributes[i]);
		}
		
		System.out.println(human.specialAttribute());
		System.out.println(resources.priorityResources(5));
		
		spells.Spells();
	}
	
}
