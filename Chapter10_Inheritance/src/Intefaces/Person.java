package Intefaces;

public class Person implements Displayable
{
    private String name;
    
    public Person(String n)
    {
    		name = n;
    }
    
    
    // The implemented class must override the methods that are specified by the Interface
    @Override
    public void diplay()
    {
    		System.out.println("My name is " + name);		
    }
}
