import java.util.*; 
public class Time_Addition {
  private int hr,min,sec;
	Time_Addition(int hr,int min,int sec){
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
    
	Time_Addition(){
		hr=0;
		min=0;
		sec=0;
	}
    
	public Time_Addition addition(Time_Addition time){
		Time_Addition t=new Time_Addition();
		t.sec=this.sec+time.sec;
		if(t.sec>=60)
			{
			t.min=(int)t.sec/60;
			t.sec=t.sec % 60;
		}
		t.min+=this.min+time.min;
		
		if(t.min>=60){
			t.hr=t.min/60;
			t.min=t.min % 60;
		}
		
		t.hr+=this.hr+time.hr;
		if(t.hr>24)
			t.hr = t.hr/24;
		return t;
		
	}
	void display(String str) {
		System.out.println(str+""+hr+":"+min+":"+sec);
	}
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the time");
		Time_Addition obj1=new Time_Addition(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		System.out.println("Enter the time to add");
		Time_Addition obj2=new Time_Addition(sc.nextInt(),sc.nextInt(),sc.nextInt());
		Time_Addition obj3=obj1.addition(obj2);
		
		obj1.display("Original Time - ");
		obj3.display("Final Time -  ");
		}
}
