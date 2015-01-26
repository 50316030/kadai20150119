package lib;

public class Calculation_lib {
	
	//フィールドの定義：クラスの直下に定義した変数
	private int m,n;

	public Calculation_lib(int m, int n) {
		//int m, int nはローカル変数
		this.m = m;//this.mはフィールド
		this.n = n;//this.nはフィールド
					//ローカル変数のがフィールドより優先される
					//なので区別するためにthis.をつける
	}
	
	public int getPlus(){
		return m+n;
	}
	
	public int getMinus(){
		return m-n;
	}
	
	public int getMultiple(){
		return m*n;
	}
	
	public int getDivide(){
		return m/n;
	}
	
}
