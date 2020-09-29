package empwage;

public class EmpWageBuilderArray implements IComputeEmpWage {
	 public static final int IS_PART_TIME =1;
     public static final int IS_FULL_TIME = 2;
     private int numOfCompany = 0;
     private CompanyEmpWage[] companyEmpWageArray;

     public EmpWageBuilderArray(){
        companyEmpWageArray = new CompanyEmpWage[5];
     }
     public void addCompanyEmpWage(String company, int empRatePerHour,
                           int numofWorkingdays, int maxHoursPerMonth){
         companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour,
                                                                numofWorkingdays,maxHoursPerMonth);
         numOfCompany++;
     }

     public void computeEmpWage() {
         for (int i = 0; i < numOfCompany; i++){
              companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
              System.out.println(companyEmpWageArray[i]);
         }
     }
     private int computeEmpWage(CompanyEmpWage companyEmpWage){

     // Variables
     int empHrs = 0;
     int totalEmpHrs = 0;
     int totalWorkingDays = 0;
     // Computation
     while (totalEmpHrs <= companyEmpWage.maxhourpermonth && totalWorkingDays <companyEmpWage.numofWorkingdays) {
     totalWorkingDays++;
     int empCheck = (int) Math.floor (Math.random() * 10) % 3;
     switch (empCheck) {
     case IS_PART_TIME:
	    empHrs = 4;
	    break;
     case IS_FULL_TIME:
	    empHrs = 8;
	    break;
     default:
     empHrs = 0;
     }
    totalEmpHrs += empHrs;
    System.out.println("Day#:"+ totalWorkingDays + " Emp Hr:"+ empHrs);
   }
    return totalEmpHrs * companyEmpWage.empRatePerHour;
 }
    public static void main (String[] args) {
      EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
      empWageBuilder.addCompanyEmpWage("BigBazar", 30, 4, 15);
      empWageBuilder.addCompanyEmpWage("StarBazar", 20, 2, 10);
      empWageBuilder.computeEmpWage();
 }
	@Override
	public void addcompanyEmpWage(String company, int empRatePerHour, int numofWorkingdays, int maxhourpermonth) {
		// TODO Auto-generated method stub
		
	}
}
