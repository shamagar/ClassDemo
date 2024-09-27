//How to create an array of Object
package com.LunchClassDemo;

class Subject1
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;
    
    //Creating Constructors
    public Subject1(String subID, String name) 
    {
		super();
		this.subID = subID;
		this.name = name;
	}

	public Subject1(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
	
    //Property methods OR Getter and setter Methods
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}
    
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    
    public void setMarksObtain(int m)
    {
        marksObtains=m;
    }
    
    boolean isQualified()
    {
        return marksObtains >= maxMarks/10*4;
    }
    
    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }
    
}

//Creating a clss of Student
class StudentA
{
	private String rollNo;
	private String name;
	private String dept;
	private String subjects;
	
	//Constructors
	public StudentA(String rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}

	public StudentA(String rollNo, String name, String dept, String subjects) 
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.subjects = subjects;
	}

	//Property methods 
	public String getRollNo() 
	{
		return rollNo;
	}

	public String getName() 
	{
		return name;
	}

	public String getDept() 
	{
		return dept;
	}
	
	public String getSubjects() 
	{
		return subjects;
	}
	
	public void setDept(String dept) 
	{
		this.dept = dept;
	}

	public void setSubjects(String subjects) 
	{
		this.subjects = subjects;
	}

	@Override
	public String toString() 
	{
		return "\nStudentA [rollNo=" + rollNo + ", name=" + name + ", dept=" + dept + ", subjects=" + subjects + "]";
	}
		
}

public class LunchClassDemo6 
{

	public static void main(String[] args) 
	{
		Subject1 subs[]=new Subject1[3];
        subs[0]=new Subject1("s101","DS",100);
        subs[1]=new Subject1("s102","Algorithms",100);
        subs[2]=new Subject1("s103","Operating Systems",100);
        
        for(Subject1 s:subs)
            System.out.println(s);
        
        System.out.println( );
        
        StudentA stda[] = new StudentA[5];
        stda[0] = new StudentA("aer456-78","Robin"," Maths","Algebra");
        stda[1] = new StudentA("aer456-45","Sing"," Science","Bio");
        stda[2] = new StudentA("aer456-63","Sha"," Geography","Tro");
        stda[3] = new StudentA("aer456-708","Robert"," Engineer","CS");
        stda[4] = new StudentA("aer456-856","Ravile"," Chemistry","OrganicChemstry");
        
         for(StudentA a : stda)
        	 System.out.println(a);
        
    }

	

}
