

import java.util.List;

/**
 *
 * @author Meena
 */
public final class Dentist 
{
    
   private String name;
   private String JobType;
   private double salary;
   private int hrs_weekly;
   
   private static List<Expenses> list;
   //list thing
   private static Assistant ass;//one ass
   private static Payroll payroll;
   private static EquipmentSuppliers supE;
   private static ITSupport it;
   private static MedicalSuppliers medi;
   private static List<Orders> orders;
   private static List<Payments> pay;
   private static List<InvoicePat> invi;
   private static List<Products> prodz;
   private static secretary seci;
   private static List<TeethSuppliers> teethSup;
   private static List<ToolSuppliers> toolhSup;
   
   private Dentist()
   {
       
   }
   private Dentist(BuildMe build)
    {
        JobType = build.JobType;
        name = build.name;
        salary = build.salary;
        hrs_weekly = build.hrs_weekly;
    }
    public static class BuildMe
    {
        private String name;
        private String JobType;
        private double salary;
        private int hrs_weekly;
        
        //mandatory value
        public BuildMe(String JobType)
        {
            this.JobType = JobType;
        }
        //"SETTERS"
        public BuildMe name(String name)
        {
            this.name = name;
            return this;
        }
        public BuildMe Sal(String JopType)
        {
            this.JobType = JobType;
            return this;
        }
        public BuildMe Hours(int hrs_weekly)
        {
            this.hrs_weekly = hrs_weekly;
            return this;
        }
        public BuildMe Job(double salary)
        {
            this.salary = salary;
            return this;
        }
        //RETURN OUTERCLASS IN INNERCLASS
        public BuildMe dentist(Dentist dent)
        {
            this.JobType= dent.getJob();
            return this;
        }
        public Dentist build()
        {
            return new Dentist(this);
        }
    }
    
 //GETTERS!!!!!!!!!!
  
   public String getName()
   {
       return name;
   }
   public String getJob()
   {
       return JobType;
   }
    public double getSal()
   {
       return salary;
   }
     public int hrsWeek()
   {
       return hrs_weekly;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dentist dent = (Dentist) o;

        if(JobType.equals(dent.JobType)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return JobType.hashCode();
    }
}
