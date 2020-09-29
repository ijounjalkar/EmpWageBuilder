public class EmpWageBuilder {
  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;

  private final String company;
  private final int empRatePerHour;
  private final int numofWorkingdays;
  private final int maxhourpermonth;
  private int totalEmpWage;

  public EmpWageBuilder(String company, int empRatePerHour, int numofWorkingdays, int maxhourpermonth) {
   this.company = company;
   this.empRatePerHour = empRatePerHour;
   this.numofWorkingdays = numofWorkingdays;
   this.maxhourpermonth = maxhourpermonth;
   }

  public void computeEmpWage() {
       int emphrs =0;
       int totalEmphrs = 0;
       int totalworkingdays = 0;
       
       while ( totalEmphrs <=  maxhourpermonth && totalworkingdays < numofWorkingdays) {
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
         totalEmpWage = totalEmphrs * empRatePerHour;
         
      }
      public String toString(){
         return "Total Emp Wage for company: " +company+"  is: " +totalEmpWage;
        } 
      public static void main(String [ ] args){
            EmpWageBuilder dmart = new EmpWageBuilder ( "Dmart", 20, 2, 10);
            EmpWageBuilder reliance = new EmpWageBuilder ( "Reliance", 10, 4, 20);
            EmpWageBuilder bigbasket = new EmpWageBuilder ( "Bigbasket", 10, 3, 10);
            dmart.computeEmpWage( );
            System.out.println(dmart);
            reliance.computeEmpWage( );
            System.out.println(reliance);
            bigbasket.computeEmpWage( );
            System.out.println(bigbasket);

            }
     
} 