package com.epam.Logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args ){
    	Scanner sc=new Scanner(System.in);
        logger.info("Enter Your choice:\n1.Calculate Interest\n2.Estimate House Construction Cost");
        int choice=sc.nextInt();
        while(choice<1 || choice>2) {
        	logger.info("Enter a valid choice\n");
        	choice=sc.nextInt();
        }
        if(choice==1) {
        	logger.info("Enter Principle Amount for Interest: ");
        	double p=sc.nextDouble();
        	logger.info("Enter Rate Of Interest for Amount: ");
        	double r=sc.nextDouble();
        	logger.info("Enter Time for Rate of Interest : ");
        	double t=sc.nextDouble();
        	logger.info("Enter your type of Interest:\n1 Simple Interest\n2 Compound Interest");
        	int type=sc.nextInt();
        	switch(type) {
        		case(1):
        			Simple s=new Simple(p,t,r);
        			logger.info("Simple Interest for Amount is: "+ s.cal()+"INR");
        			break;
        		case(2):
        			Compound c=new Compound(p,t,r);
        			logger.info("Compound Interest for Amount is: "+c.cal()+"INR");
        			break;
        	}
        }
       if(choice==2){
        	logger.info("Enter Area Of The House for Construction in Squarefeet: ");
        	double area=sc.nextDouble();
        	logger.info("Enter Material Standards you need : ");
        	logger.info("1. Standard Material \n2. Above Standard Material \n3. High Standard Material \n4. High Standard Material And Fully Automated House");
        	int op=sc.nextInt();
        	House h=new House(area,op);
        	logger.info("Total Cost for Construction is: "+h.total() +"INR");
        }
        sc.close();
    }
}
