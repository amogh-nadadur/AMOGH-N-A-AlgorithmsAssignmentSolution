package Main;

public class StockIncrease {
	public void getNumberOfCompanies(int count, boolean[] flag) {
		int number = 0;
		for(int i=0; i< count;i++) {
			if(flag[i])
				number++;
		}
		System.out.println("Total no of companies whose stock price rose today : " + number);
	}
}