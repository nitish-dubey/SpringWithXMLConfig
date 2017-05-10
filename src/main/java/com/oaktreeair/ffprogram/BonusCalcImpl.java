package com.oaktreeair.ffprogram;

import java.util.Collection;


public class BonusCalcImpl implements BonusCalc {

	@Override
	public int calcBonus(Flier flier, Segment seg) {
		double bonus = 0;
		double miles = seg.getMiles();
		switch(flier.getLevel())
		{
		case Member:
			bonus = miles * 0.10;
			break;
		case Gold:
			bonus = miles * 0.25;
			break;
		case Platinum:
			bonus = miles * 0.50;
			break;
		}
		return (int)bonus;
	}

	@Override
	public int calcBonus(Flier flier, Collection<Segment> segments) {
		double bonus = 0;
		for(Segment seg:segments){
		double miles = seg.getMiles();
		switch(flier.getLevel())
		{
		case Member:
			bonus = miles * 0.10;
			break;
		case Gold:
			bonus = miles * 0.25;
			break;
		case Platinum:
			bonus = miles * 0.50;
			break;
		}
	}
		return (int)bonus;
	}

}
