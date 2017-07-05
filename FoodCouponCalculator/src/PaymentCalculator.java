import java.util.Map;
import java.util.TreeMap;

public class PaymentCalculator {
	
	public Map<Integer, Integer> findTheCouponsToBePaid(int billAmount, int totalAmount, InHandCouponsInfoDAO inHandCouponsInfo){
		
		if(billAmount > totalAmount){
			System.out.println("Insufficient coupon amount. ");
			System.out.println("Coupons available only for " + totalAmount + " rupees");
			System.out.println("You are in short of " + (totalAmount - billAmount) + " rupees");
			
			return null;
		}
		
		else{
			int couponsNeeded, couponsAvailable, couponsUsed;
			Map<Integer, Integer> affectedCouponVarietiesMap = new TreeMap<Integer, Integer>();
			Map<Integer, Integer> inHandCouponsMap = inHandCouponsInfo.getInHandCouponsInfo();  
			
			for(Integer couponVariety : inHandCouponsMap.keySet()){
				couponsNeeded = billAmount/couponVariety;
				couponsAvailable = inHandCouponsMap.get(couponVariety);
				
				couponsUsed = (couponsNeeded <= couponsAvailable) ? couponsNeeded : couponsAvailable;
				
				couponsUsed = couponsNeeded;
				if(couponsUsed >= 1){
					billAmount = billAmount % (couponsUsed * couponVariety);
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
