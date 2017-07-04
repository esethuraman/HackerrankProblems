/**
 * @author elavazhagan sethuraman
 * 
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static List<Integer> varietyOfCoupons = new ArrayList<>();
	static Map<Integer, Integer> couponsInHand = new HashMap<>();
	
	public static void main(String[] args) {
		
		InHandCouponsInfoDAO inHandCouponsInfo = new InHandCouponsInfoDAO();
		
		varietyOfCoupons = new CouponVarietyInitializer().initializeCouponVarieties();
		inHandCouponsInfo.setCouponVarieties(varietyOfCoupons);
		
		couponsInHand = new InHandCouponsInitializer(varietyOfCoupons).initializeCouponsInHand();;
		inHandCouponsInfo.setInHandCouponsInfo(couponsInHand);
		
		Utils utils = new Utils();
		int totalAmount = utils.printTheMap(couponsInHand);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the bill amount : ");
		int billAmount = in.nextInt();
		Map<Integer, Integer> affectedCouponsMap = new PaymentCalculator().findTheCouponsToBePaid(billAmount, totalAmount);
		couponsInHand = utils.updateInHandCouponsInfo(couponsInHand, affectedCouponsMap);
		inHandCouponsInfo.setInHandCouponsInfo(couponsInHand);
		
		System.out.println();
		System.out.println(utils.printTheMap(couponsInHand));
	}

}
