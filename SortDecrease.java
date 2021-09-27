package Main;

public class SortDecrease {
	public void getNumberOfCompanies(int count, boolean[] flag) {
		int number = 0;
		for(int i=0; i< count;i++) {
			if(!flag[i])
				number++;
		}
		System.out.println("Total no of companies whose stock price declined today : " + number);
	}
}