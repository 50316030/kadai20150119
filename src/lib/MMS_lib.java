package lib;

public class MMS_lib {
	private double lamdba, mu, rho, alpha;
	private int s;
	
	public MMS_lib(double lamdba, double mu, int s) {
		this.lamdba = lamdba;
		this.mu = mu;
		this.alpha = lamdba / mu;
		this.s = s;
		this.rho = this.alpha / s;
	}
	
	public int getFactorial(int s){
		
		int f = 1;
		
		for(int i = s; i >= 0; i--){
			if(i == 0){
				f *= 1;
			}else{
				f *= i;
			}
		}
		return f;
	}
	
	public double getConbination(int s, int r){
		return getFactorial(s) / (getFactorial(r) * getFactorial(s-r));
	}
	
	public double getP0(){
		
		double p0 = 0, p01 = 0, p02 = 0;
		
		for(int k = 0; k < this.s ; k++){// k <= this.s-1
			p01 += Math.pow(this.alpha, k) / getFactorial(k);
		}
		p02 = Math.pow(this.alpha, this.s) / getFactorial(this.s) / (1 - this.rho);
		p0 = 1 / (p01 + p02);
		return p0;
	}
	
	public double getLq(){
		
		double lq;
		lq = Math.pow(this.s, this.s) * Math.pow(this.rho, this.s + 1) * getP0() / getFactorial(this.s) / Math.pow(1 - this.rho, 2);
		return lq;
	}
	
	public double getTl(){
		return getLq() + this.alpha;
	}
	
	public double getWq(){
		return getLq() / this.lamdba;
	}
	
	public double getW(){
		return getWq() + 1 / this.mu;
	}
	
	public double getRho(){
		return this.rho;
	}
}

