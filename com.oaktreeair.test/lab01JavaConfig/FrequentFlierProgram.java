package lab01JavaConfig;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oaktreeair.ffprogram.BonusCalc;
import com.oaktreeair.ffprogram.ContactInfo;
import com.oaktreeair.ffprogram.Flier;
import com.oaktreeair.ffprogram.Flier.Level;
import com.oaktreeair.ffprogram.Segment;

public class FrequentFlierProgram {
	
	public static void main(String args[]){
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Flier flier = (Flier)ctx.getBean("flier01");
		
		System.out.println(flier.getFlierName());
		System.out.println(flier.getFlierID());
		ContactInfo contactInfo = flier.getContactInformation();
		System.out.println(contactInfo.getEmailAddressee());
	    flier.setLevel(Level.Gold);
	    Segment seg = (Segment)ctx.getBean(Segment.class);
	    //seg.setMiles(2000);
	    flier.addSegment(seg);
	    BonusCalc bonusCalc = (BonusCalc)ctx.getBean(BonusCalc.class);
	    int bonus = bonusCalc.calcBonus(flier, seg);
	    System.out.println(bonus);
	    ctx.close();
	}

}
