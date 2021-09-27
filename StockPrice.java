package Main;
import java.util.Scanner;
public class StockPrice {
	public void Search(int count, float[] num, float value) {
		Scanner sc = new Scanner(System.in);	
		boolean isPresent = false;
		for(int i =0 ;i < count ; i++) {
			if(num[i]==value)
				isPresent = true;
		}
		if(isPresent)
			System.out.println("Stock of value "+value+" is present ");
		else
			System.out.println("Stock of value "+value+" is not present ");
	}


}