import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentCalculator {
	
	Map<Integer, Integer> findTheCouponsToBePaid(int billAmount, int totalAmount){
		
		if(billAmount > totalAmount){
			System.out.println("Insufficient coupon amount. ");
			System.out.println("Coupons available only for " + totalAmount + " rupees");
			System.out.println("You are in short of " + (totalAmount - billAmount) + " rupees");
			
			return null;
		}
		
		else{
			List<Integer> list = new ArrayList<>();
			int couponsUsed;
			Map<Integer, Integer> affectedCouponVarietiesMap = new HashMap<>();
			for(Integer couponVariety : list){
				couponsUsed = billAmount/couponVariety;
				if(couponsUsed >= 1){
					billAmount = billAmount % couponVariety;
					affectedCouponVarietiesMap.put(couponVariety, couponsUsed);
				}
				if(billAmount == 0){
					break;
				}
			}
			
			System.out.println("Coupons to be paid for the sum of " + totalAmount + " rupees : ");
			new Utils().printTheMap(affectedCouponVarietiesMap);
			
			return affectedCouponVarietiesMap;
		}
	}
}
