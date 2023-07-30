//Write a program in Java in which a subclass constructor invokes the constructor of the super class and instantiate the values.

//Superclass is the existing class from which the new classes are derived while Subclass is the new class that inherits the properties and methods of the Superclass.
//anything public is accessible to anywhere , anything private is only accessible in the class they are declared , anything protected is accessible outside the package but only to child classes and default is accessible only inside the package.

import java.util.*;

class Softwaredeveloper
{
      protected int salary;
      protected String name;
      protected static int count =0;


      public Softwaredeveloper() {
      	this.salary=0;
      	this.name="Not assigned";
      	Softwaredeveloper.count++;
      }

      public Softwaredeveloper(int salary,String name){
      	this.salary=salary;
      	this.name=name;
      	Softwaredeveloper.count++;
      }

      public Softwaredeveloper(Softwaredeveloper sof){
      	this.salary=sof.salary;
      	this.name=sof.name;
      	Softwaredeveloper.count++;
      }


      public void setsalary(int salary){
      	this.salary=salary;
      }

      public void setName(String name){
      	this.name=name;
      }

      public int getsalary(){
      	return this.salary;
      }

      public String getName(){
      	return this.name;
      }

      public static int getCount(){
      	return Softwaredeveloper.count;
      }


      public String toString(){
      	return"salary:"+this.salary+"\tName:"+this.name;
      }

}


class Manager extends Softwaredeveloper{
	protected String qualification;


	public Manager(){
		this.qualification="not assigned";
	}

	public Manager(int salary,String name,String qualification){
		super(salary,name);
		this.qualification=qualification;
	}


	public String getQualification(){
		return this.qualification;
	}

	public void setQualification(String qualification){
		this.qualification=qualification;
	}

	public String toString(){
		return super.toString()+"\tQualification:"+this.qualification;
	}
}

public class Main{
	public static void main(String[] args){
		Softwaredeveloper sof1=new Softwaredeveloper(90000,"Daniel");
		Softwaredeveloper sof2=new  Manager(150000,"Rushik","MBA");



		System.out.println("Softwaredeveloper 1:"+ sof1.toString());
		System.out.println("Softwaredeveloper 2:"+ sof2.toString());
	}
}

