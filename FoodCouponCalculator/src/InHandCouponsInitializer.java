import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InHandCouponsInitializer {
	
	List<Integer> varietyOfCoupons;
	
	
	public InHandCouponsInitializer(List<Integer> varietyOfCoupons2) {
		this.varietyOfCoupons = varietyOfCoupons2;
	}
	
	Map<Integer, Integer> initializeCouponsInHand() {
		
		System.out.println("Enter the details for coupons in hand ... ");
		Scanner in = new Scanner(System.in);
		Map<String, Integer> couponsInHand = new HashMap<>();
		int numberOfCoupons;
		
		for(Integer couponVariety : varietyOfCoupons){
			System.out.println("Enter the number of " + couponVariety + " coupons in hand" );
			numberOfCoupons = in.nextInt();
			
			couponsInHand.put(couponVariety, numberOfCoupons);
		}
		return couponsInHand;
	}
}
