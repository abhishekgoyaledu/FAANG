package array_and_string_manipulations;


public class CakeShop {
	public static void main(String... args) {
		int []takeOutOrders = new int[]{1, 5};
		int []dineInOrders = new int[]{2, 4, 6};
		int []servedOrders = new int[]{1, 2, 3, 5, 6};
		System.out.println(isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders));
	}
	
	public static boolean isFirstComeFirstServed(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {        
		int i = 0, j = 0, k = 0;
	
		while(k < servedOrders.length) {
			if (i < takeOutOrders.length && servedOrders[k] == takeOutOrders[i]) {
				++i;
			} else if (j < dineInOrders.length && servedOrders[k] == dineInOrders[j]) {
				j++;
			} else {
				return false;
			}
			++k;
		}
		if (i != takeOutOrders.length || j != dineInOrders.length) {
			return false;
		}
        return true;
    }
}
