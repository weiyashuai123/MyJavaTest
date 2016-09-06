package myTest;
/**
 * 将连续数组转为连续字符串
 * 如数组 中有 1，2，3，4，5，8，9，10，12
 * 则输出1-5,8-10,12
 * **/
public class ChangeToContinue {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,9,10,11,15,17,19,20};
		String res = cTC(a);
		System.out.println(res);
	}
	
	public static String cTC(int num[]){
		String result = "";
		result = "";
		int startf = 0;
		int endf =0;
		for (int i = 1; i < num.length; i++) {
			if (num[i]-num[i-1]==1) {
				endf++;
			}
			else{
				if(startf==endf){
					if(startf!=0){result=result+",";}
					result=result+""+num[endf];
				}
				else{
					if(startf!=0){result=result+",";}
					result=result+""+num[startf]+"-"+num[endf];
				}
				startf=i;
				endf=startf;
			}
		}
		if(startf==endf){
			if(startf!=0){result=result+",";}
			result=result+""+num[endf];
		}
		else{
			if(startf!=0){result=result+",";}
			result=result+""+num[startf]+"-"+num[endf];
		}
		return result;
	}

}
