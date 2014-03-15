package model;




/**
 *
 * @author Meena
 */
public final class ClinicalDocuments
{
   private String name;
   private String patient_Num;
   private String patHistory;
   private double HistAmountOwing;
   
   
   private ClinicalDocuments()
   {
       
   }
    private ClinicalDocuments(BuildMe build)
    {
        patHistory = build.patHistory;
        patient_Num = build.patient_Num;
        HistAmountOwing = build.HistAmountOwing;
        name = build.name;
    }
    public static class BuildMe
    {
        private String name;
        private String patient_Num;
        private String patHistory;
        private double HistAmountOwing;
        
        //mandatory value
        public BuildMe(String patient_Num)
        {
            this.patient_Num = patient_Num;
        }
        //"SETTERS"
        public BuildMe patient_Num(String patient_Num)
        {
            this.patient_Num = patient_Num;
            return this;
        }
        public BuildMe patHistory(String patHistory)
        {
            this.patHistory = patHistory;
            return this;
        }
        public BuildMe HistAmountOwing(double HistAmountOwing)
        {
            this.HistAmountOwing = HistAmountOwing;
            return this;
        }
        public BuildMe name(String name)
        {
            this.name = name;
            return this;
        }
        //RETURN OUTERCLASS IN INNERCLASS
        public BuildMe clini(ClinicalDocuments clin)
        {
            this.patient_Num= clin.getPatNum();
            return this;
        }
        public ClinicalDocuments build()
        {
            return new ClinicalDocuments(this);
        }
        
    }
 //GETTERS!!!!!!!!!!
   public String getPatNum()
   {
       return patient_Num;
   }
   public String getHistory()
   {
       return patHistory;
        
   }
   public String getName()
   {
       return name;
        
   }
   public double getHistAmountOwing()
   {
       return HistAmountOwing;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClinicalDocuments ex = (ClinicalDocuments) o;

        if (patient_Num.equals(ex.patient_Num)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return patient_Num.hashCode();
    }
}


