package com.injection.propfile.setter;
//
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.injection.propfile.beanpool.FootballCoach;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        FootballCoach c = context.getBean("myCoach",FootballCoach.class);
        System.out.println(c.getWorkout()+"\nCoach Name: "+c.getCoachname()+"\nCoach Email: "+c.getEmail());
    }
}
