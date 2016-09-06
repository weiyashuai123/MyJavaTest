package myTest;
/**
 * 用于分数求和
 * 先输入分数的个数n
 * 再输入n个分数 
 * 格式如  2/3 4/5
 * 会输出分数的和
 * **/
import java.util.Scanner;
import java.util.StringTokenizer;
public class AddFractions {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String []data=new String[n];
    data[0] = input.next();
    String result = data[0];
    for (int i = 1; i < n; i++) {
		data[i]=input.next();
	}
    for (int i =1 ; i < n; i++) {
		result=addResult(result, data[i]);
	}	
    output(result);
	}
static long maxy(long a, long b){//求最大公约数
	if(b==0)
		return a;
	else
		return maxy(b,a%b);
}
static String addResult(String fs_1,String fs_2){//分数求和
	StringTokenizer fenshu1=new StringTokenizer(fs_1, "/");
	long fs11 = Integer.parseInt(fenshu1.nextToken());
	long fs12 = Integer.parseInt(fenshu1.nextToken());
	StringTokenizer fenshu2=new StringTokenizer(fs_2, "/");
	long fs21 = Integer.parseInt(fenshu2.nextToken());
	long fs22 = Integer.parseInt(fenshu2.nextToken());
	
	long fm=fs12*fs22;
	long fz1=fs11*(fs22);
	long fz2 =fs21*(fs12);
	long fz = fz1+fz2;
	
	long m = maxy(Math.abs(fz),Math.abs(fm));
	fz=fz/m;
	fm=fm/m;

	return fz+"/"+fm;
}
  static void output(String res){
	  StringTokenizer fs=new StringTokenizer(res, "/");
		int fs1 = Integer.parseInt(fs.nextToken());
		int fs2 = Integer.parseInt(fs.nextToken());
		int inter =0;
		 while(Math.abs(fs1)>=Math.abs(fs2)){
	    	  if(fs1>=0){
	    	  fs1=fs1-fs2;
	    	  inter++;}
	    	  else{
	    		  fs1=fs1+fs2;
	    		  inter--;
	    	  }
	      }
	      if(fs1==0) System.out.println(inter);
	      else if(inter>0) System.out.println(inter+" "+fs1+"/"+fs2);
	      else if(inter<0) System.out.println(inter+" "+-fs1+"/"+fs2);
	      else System.out.println(res);}
}
