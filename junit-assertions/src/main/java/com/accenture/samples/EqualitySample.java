package com.accenture.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EqualitySample {

	//String equality. Assert.AreEqual() or Assert.That()
    public String GetWelcomeMessage(String yourName)
    {
        return "Welcome " + yourName;
    }

    //This function could be tested using Assert.AreNotEqual()
    public String GetTextAppendWithRandomNumber(String someText)
    {
    	Random rand = new Random();

        return someText + rand.nextInt();
    }

    //Integer equality. Assert.AreEqual()
    public int AddNumbers(int num1, int num2)
    {
        return num1 + num2;
    }

    //Double/Float equality. Assert.AreEqual(). Figure out how to add tolerance/delta in assertions
    public double GetMaturityAmount(double principal, double interest)
    {
        double amount = principal + (principal * interest / 100);
        return Math.round(amount);
    }

    //This could qualify for two tests. 1. Not Empty test and 2. List equality
    public List<String> WeekendDays()
    {
    	List<String> list = new ArrayList<String>();
        list.add("Saturday");
        list.add("Sunday");
        return list;
    }

}
