import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author elavazhagan sethuraman
 * this class contains all the utility methods needed for the project
 */

class Utils {
	
	public int printTheMap(Map<Integer, Integer> couponsInHand){
		int totalAmount = 0;
		
		System.out.println("Current InHand Coupon Details : \n");
		System.out.println("===================================");
		System.out.println("Variety        Nos            Total");
		
		for(Entry<Integer, Integer> entry : couponsInHand.entrySet()){
			int amount = entry.getKey() * entry.getValue();
			System.out.println(entry.getKey() + "            x              " + entry.getValue()
			          + "     =       " + amount);
			totalAmount += amount;
		}
		
		System.out.println("===================================");
		System.out.println("TOTAL    " + totalAmount + " Rupees");
		
		return totalAmount;
	}

	/**
	 * @param couponsInHand
	 * @param affectedCouponsMap
	 * @return
	 * 
	 * for each key(variety of coupon) in the affectedCoupons map, 
	 * change the InHandCoupon info by subtracting the usedCoupons count from availableCoupons count 
	 */
	public Map<Integer, Integer> updateInHandCouponsInfo(Map<Integer, Integer> couponsInHand,
			Map<Integer, Integer> affectedCouponsMap) {
		
		int affectedCouponVariety, affectedCouponNos, availableCouponNos;
		
		for(Entry<Integer, Integer> entry : affectedCouponsMap.entrySet()){
			affectedCouponVariety = entry.getValue(); 
			affectedCouponNos = entry.getValue();
			availableCouponNos = couponsInHand.get(affectedCouponVariety);
			couponsInHand.put(affectedCouponVariety, (availableCouponNos - affectedCouponNos));
		}
		
		return couponsInHand;
	}
}
