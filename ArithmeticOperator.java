/**
* 演示算数运算符的使用
*/

public class ArithmeticOperator{
	public static void main(String[] args) { 
		// /使用
		System.out.println(10.0 / 4);
		double d = 10 / 4;
		System.out.println(d);
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % -3);
		
//		++的使用
//
		int  i = 10;
		i++;
		System.out.println("i=" + i);
/*
 * 作为表达式使用
 */
		int j = 8;
//		int k = ++j;
		int k = j++;
		System.out.println("k=" + k + "j=" + j);
		
	}
}
	