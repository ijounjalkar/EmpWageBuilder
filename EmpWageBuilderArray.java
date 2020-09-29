package empwage;

public class EmpWageBuilderArray{
  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;
  private int numofcompany = 0;
  private CompanyEmpWage companyEmpWageArray[];
  public EmpWageBuilderArray(){
      companyEmpWageArray = new CompanyEmpWage[5];
   
   }
    private void addcompanyEmpWage(String company, int empRatePerHour, int numofWorkingdays, int maxhourpermonth){
       companyEmpWageArray[numofcompany] = new CompanyEmpWage(company, empRatePerHour, numofWorkingdays, maxhourpermonth);
       numofcompany++;
   }
   private void computeEmpWage( ) {
     for(int i = 0; i < numofcompany; i++) {
       companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
       System.out.println(companyEmpWageArray[i]);
     }
   }

  private int computeEmpWage(CompanyEmpWage companyEmpWage) {
       int emphrs =0;
       int totalEmphrs = 0;
       int totalworkingdays = 0;
       
       while ( totalEmphrs <=  companyEmpWage.maxhourpermonth && totalworkingdays < companyEmpWage.numofWorkingdays) {
         totalworkingdays++;
         int empcheck = (int) Math.floor(Math.random()  * 10) % 3;
         switch (empcheck) {
             case IS_PART_TIME:
                    emphrs = 4;
                    break;
             case IS_FULL_TIME:
                    emphrs = 8;
                    break;
             default:
                    emphrs = 0;
                    break;
           }
           totalEmphrs += emphrs;
           System.out.println("Day#: " +totalworkingdays+ "Emp Hrs: " +emphrs);
         }
         return totalEmphrs = companyEmpWage.empRatePerHour;
         }
          public static void main(String [ ] args){
        EmpWageBuilderArray EmpWageBuilder = new EmpWageBuilderArray( );
            EmpWageBuilder . addcompanyEmpWage ( "Dmart", 20, 2, 10);
            EmpWageBuilder . addcompanyEmpWage ( "Reliance", 10, 4, 20);
            EmpWageBuilder . addcompanyEmpWage ( "Bigbasket", 10, 3, 10);
            EmpWageBuilder.computeEmpWage( );

         }
}
