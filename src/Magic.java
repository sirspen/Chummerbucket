import java.util.*;
public class Magic {

	static int spellsKnown;
	static int attributeLevel;
	static int compFormsKnown;
	
	public static int setMagicMagician(int magic){
		if (magic == 1){
			attributeLevel = 0;
			return 0;
		}
		else if (magic == 2){
			attributeLevel = 2;
			return 2;
		}
		else if (magic == 3){
			attributeLevel = 3;
			return 3;
		}
		else if (magic == 4){
			attributeLevel = 4;
			return 4;
		}else{
			attributeLevel = 6;
			return 6;
		}
	}
	
	public static int setSpellsKnownMagician(int magic){
		if (magic == 1){
			spellsKnown = 0;
			return 0;
		}
		else if (magic == 2){
			spellsKnown = 0;
			return 0;
		}
		else if (magic == 3){
			spellsKnown = 5;
			return 5;
		}
		else if (magic == 4){
			spellsKnown = 7;
			return 7;
		}else{
			spellsKnown = 10;
			return 10;
		}
	}
	
	public static int setComplexForms(int res){
		if (res == 1){
			compFormsKnown = 0;
			return 0;
		}
		else if (res == 2){
			compFormsKnown = 0;
			return 0;
		}
		else if (res == 3){
			compFormsKnown = 1;
			return 1;
		}
		else if (res == 4){
			compFormsKnown = 2;
			return 2;
		}else{
			compFormsKnown = 6;
			return 5;
		}
		
	}
	
	public static int setMagicAdept(int res){
		if (res == 1){
			attributeLevel = 0;
			return 0;
		}
		else if (res == 2){
			attributeLevel = 2;
			return 2;
		}
		else if (res == 3){
			attributeLevel = 4;
			return 4;
		}
		else if (res == 4){
			attributeLevel = 6;
			return 6;
		}else{
			attributeLevel = 6;
			return 6;
		}
		
	}
	
	public static int setMagicAspect(int res){
		if (res == 1){
			attributeLevel = 0;
			return 0;
		}
		else if (res == 2){
			attributeLevel = 2;
			return 2;
		}
		else if (res == 3){
			attributeLevel = 3;
			return 5;
		}
		else if (res == 4){
			attributeLevel = 5;
			return 5;
		}else{
			attributeLevel = 6;
			return 6;
		}
		
	}
	
	public static void Spells(){
		HashMap<String, String> spells = new HashMap<String, String>();
		spells.put("Spell 1", new String("this is the description"));
		spells.put("Spell 2", new String("this is another description"));
		
		for (String key: spells.keySet()){
 
            System.out.println(key + " " + spells.get(key));  


		} 
		System.out.println(spells.get("Spell 1"));
	}
}
