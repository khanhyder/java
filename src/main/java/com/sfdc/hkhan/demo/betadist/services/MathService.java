package com.sfdc.hkhan.demo.betadist.services;

import org.apache.commons.math3.distribution.*;
import org.springframework.stereotype.Service;

@Service
public class MathService {
  
	public double getBetaDistribution(double a, double b, double x){
		BetaDistribution bd = new BetaDistribution(a,b);
		return bd.cumulativeProbability(x);
		
	}
	
	
}
