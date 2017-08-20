
public class Priority {
	public static int setSkills(int skills){
		if (skills == 1){
			return 18;
		}
		else if (skills == 2){
			return 22;
		}
		else if (skills == 3){
			return 28;
		}
		else if (skills == 4){
			return 36;
		}else{
			return 46;
		}
	}
	
	public static int setSkillGroups(int skills){
		if (skills == 1){
			return 0;
		}
		else if (skills == 2){
			return 0;
		}
		else if (skills == 3){
			return 2;
		}
		else if (skills == 4){
			return 5;
		}else{
			return 10;
		}
	}
	
	public static int attributePoints(int attributes){
		if (attributes == 1){
			return 12;
		}
		else if (attributes == 2){
			return 14;
		}
		else if (attributes == 3){
			return 16;
		}
		else if (attributes == 4){
			return 20;
		}else{
			return 24;
		}
	}
	
	public static int priorityResources(int resources){
		if (resources == 1){
			return 6000;
		}
		else if (resources == 2){
			return 50000;
		}
		else if (resources == 3){
			return 140000;
		}
		else if (resources == 4){
			return 275000;
		}else{
			return 450000;
		}
	}
}
