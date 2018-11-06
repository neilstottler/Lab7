import java.util.Scanner;

public class PA7aV4 {
	
	static Month january;
	static Month february;
	static Month march;
	static Month april;
	static Month may;
	static Month june;
	static Month july;
	static Month august;
	static Month september;
	static Month october;
	static Month november;
	static Month december;
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int startDay = reader.nextInt();
		
		int year = reader.nextInt();
		
		january = new Month("January", 31);
		if(isLeapYear(year)) {
			february = new Month("Feburay", 29);
		}else {
			february = new Month("Febuary", 28);
		}
		
		march = new Month("March", 31);
		april = new Month("April", 30);
		may = new Month("May", 31);
		june = new Month("June", 30);
		july = new Month("July", 31);
		august = new Month("August", 31);
		september = new Month("September", 30);
		october = new Month("October", 31);
		november = new Month("November", 30);
		december = new Month("December", 31);
		
		january.editArray(startDay);
		february.editArray(january.nextStartDay());
		march.editArray(february.nextStartDay());
		april.editArray(march.nextStartDay());
		may.editArray(april.nextStartDay());
		june.editArray(may.nextStartDay());
		july.editArray(june.nextStartDay());
		august.editArray(july.nextStartDay());
		september.editArray(august.nextStartDay());
		
		System.out.println(september.toString());
		
		october.editArray(september.nextStartDay());
		november.editArray(october.nextStartDay());
		december.editArray(november.nextStartDay());
		
		System.out.println(january.toString());
		System.out.println(february.toString());
		System.out.println(march.toString());
		System.out.println(april.toString());
		System.out.println(may.toString());
		System.out.println(june.toString());
		System.out.println(july.toString());
		System.out.println(august.toString());
		System.out.println(september.toString());
		System.out.println(october.toString());
		System.out.println(november.toString());
		System.out.println(december.toString());
	}	
	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

}

class Month{
	
	String month;
	int days;
	
	int[][] monthArray;
	
	public Month(String m, int d) {
		month = m;
		days = d;
		monthArray = new int[6][7];
	}
	
	public void editArray(int a) {
		int tempDay = 1;
		System.out.println(month);
		for(int i = 0; i < monthArray.length; i++){
			if(i == 0){
				for(int j = a-1; j < monthArray[i].length; j++) {
					if(tempDay <= days) {
						monthArray[i][j] = tempDay;
						tempDay++;
					}
				}
			}else {
				for(int j = 0; j < monthArray[i].length; j++) {
					if(tempDay <= days) {
						monthArray[i][j] = tempDay;
						tempDay++;
					}
				}
			}
		}
	}
	
	public int nextStartDay() {
		for(int i = 0; i < monthArray.length; i++){
			for(int j = 0; j < monthArray[i].length; j++) {
				if(monthArray[i][j] == days) {
					if(j == 6) {
						return 1;
					}else {
						return j + 2;
					}
				}
			}
		}
		
		return -1;
	}
	
	public String toString() {
		String str = "";
		str = str + month;
		str = str + "\n";
		
		for(int i = 0; i < monthArray.length; i++){
			for(int j = 0; j < monthArray[i].length; j++) {
				str = str + "[" + monthArray[i][j] + "]";
			}
			str = str +"\n";
		}
		
		return str;
	}
	
	
}