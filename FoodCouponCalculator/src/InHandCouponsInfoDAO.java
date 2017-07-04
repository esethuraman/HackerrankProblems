import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InHandCouponsInfoDAO {
	
	List<Integer> couponVarieties = new ArrayList<>();
	Map<Integer, Integer> inHandCouponsInfo = new HashMap<>();
	
	public List<Integer> getCouponVarieties() {
		return couponVarieties;
	}
	public void setCouponVarieties(List<Integer> couponVarieties) {
		this.couponVarieties = couponVarieties;
	}
	public Map<Integer, Integer> getInHandCouponsInfo() {
		return inHandCouponsInfo;
	}
	public void setInHandCouponsInfo(Map<Integer, Integer> inHandCouponsInfo) {
		this.inHandCouponsInfo = inHandCouponsInfo;
	}
}
