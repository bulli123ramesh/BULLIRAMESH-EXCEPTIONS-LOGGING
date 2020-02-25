package com.epam.Logging;

public class Compound {
	double p;
	double t;
	double r;
	public Compound(double p,double t,double r) {
		this.p=p;
		this.t=t;
		this.r=r;
	}
	public double cal() {
		return Math.round(p*Math.pow(1+r/100.0,t));
	}

}