package empwage;
public class CompanyEmpWage {
	 public final String company;
     public final int empRatePerHour;
     public final int numofWorkingdays;
     public final int maxhourpermonth;
     public int totalEmpWage;
    
     public CompanyEmpWage(String company, int empRatePerHour, int numofWorkingdays, int maxhourspermonth) {
       this.company = company;
       this.empRatePerHour =empRatePerHour;
       this.numofWorkingdays = numofWorkingdays;
       this.maxhourpermonth = maxhourspermonth;
   }
   public void setTotalEmpWage(int totalEmpWage){
      this.totalEmpWage = totalEmpWage;
   }
   public String toString(){
      return "Total Emp Wage for company: " +company+"  is: " +totalEmpWage;
     }
  
}
