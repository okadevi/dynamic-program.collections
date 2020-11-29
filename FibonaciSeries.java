package co.algs.in.dynamic.programmings;

import java.util.HashMap;
import java.util.Map;

public class FibonaciSeries {
	
	public static Long find(Long no ) {
		HashMap<Long,Long> dmp = new HashMap<>();
		return fetch(no, dmp);
	}
	
	private static Long fetch(Long no, Map<Long, Long> dmp) {
		if (no == 0) {
				dmp.put(no,0l);
				return Long.valueOf(0);
			}
		if (no == 1) {
				dmp.put(no,1l);
				return Long.valueOf(1);
			}
		
		Long no_1 = Long.valueOf(no-1);
		Long no_2 = Long.valueOf(no-2);
		Long value_no_1 = (dmp.containsKey(no_1)) ? dmp.get(no_1) :fetch(no_1, dmp) ;
		Long value_no_2 = (dmp.containsKey(no_2 )) ? dmp.get(no_2 ) : fetch(no_2, dmp);
		dmp.put(no_1, value_no_1);
		dmp.put(no_2, value_no_2);
		
		return value_no_1 + value_no_2;	
	}
	
	public static void main(String[] args) {
		System.out.println(find(100l));
	}
}
