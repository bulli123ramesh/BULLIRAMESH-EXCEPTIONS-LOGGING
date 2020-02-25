package com.epam.Logging;

public class Simple {
	double p;
	double t;
	double r;
	public Simple(double p,double t,double r) {
		this.p=p;
		this.t=t;
		this.r=r;
	}
	public double cal() {
		return Math.round((p*t*r)/100.0);
	}

}

