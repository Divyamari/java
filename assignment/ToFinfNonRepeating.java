package adv;

public class ToFinfNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "gibblegabbler";
		System.out.println("The given String is : " + str);
		
		for(char i:str.toCharArray()) {
			if(str.indexOf(i) == str.lastIndexOf(i)) {
			System.out.println("The First non repeated character in String is :" +i);
			break;
			}
		}
	}

}
