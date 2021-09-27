package Main;
public class sortDescending {
	public void sort (int count, float[] num) {
		float temp;
		for (int i = 0; i < count; i++) 
		{
			for (int j = i + 1; j < count; j++) { 
				if (num[i] < num[j]) 
				{
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("Stock prices in Descending order are :\n ");
		for (int i = 0; i < count - 1; i++) 
		{
			System.out.print(num[i] + ",");
		}
		System.out.print(num[count - 1]);
	}
}