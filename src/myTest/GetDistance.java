package myTest;
/**
 * 根据两点的经纬度 计算出两点的距离
 * 单位为m
 * **/

public class GetDistance {
	public static void main(String[] args) {
		System.out.println(getdistance(65.9668, -18.2333, 65.9667, -18.2333));
	}
	
	private static int getdistance(
			double latitude1, double longitude1,
			double latitude2, double longitude2) {
		// TODO Auto-generated method stub
		double la1 = latitude1 * Math.PI/180.0;
		double la2 = latitude2 * Math.PI/180.0;
		double ln1 = longitude1 * Math.PI/180.0;
		double ln2 = longitude2 * Math.PI/180.0;
		
		double a = la1-la2;
		double b = ln1-ln2;
		double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2) +
				    Math.cos(la1)*Math.cos(la2)*Math.pow(Math.sin(b/2),2)));

		s = s * 6378.137;//地球半径
		
//		s = Math.round( s * 10000)/10000;
		int res = (int) Math.round(s * 1000);
		return res;
	}

}
