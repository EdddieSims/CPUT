/**
 *
 * @author Meena
 */


import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Meena
 */
public final class PatientProcedure 
{
   private static List<Appointments> apps;
   
   private String name;
   private String MedAidNum;
   private String MedAidPolicyName;
   private double amountPayable;
   private String ProdName;
   
   private PatientProcedure  ()
   {
       
   }
   private PatientProcedure  (BuildMe build)
    {
        MedAidNum = build.MedAidNum;
        MedAidPolicyName = build.MedAidPolicyName;
        amountPayable = build.amountPayable;
        name = build.name;
        ProdName = build.ProdName;
    }
    public static class BuildMe
    {
        private String name;
        private String MedAidNum;
        private String MedAidPolicyName;
        private double amountPayable;
        private String ProdName;
        
        
        //mandatory value
        public BuildMe(String ProdName)
        {
            this.ProdName = ProdName;
        }
        //"SETTERS"
        public BuildMe ProdName(String ProdName)
        {
            this.ProdName = ProdName;
            return this;
        }
        public BuildMe MedAidNum(String MedAidNum)
        {
            this.MedAidNum = MedAidNum;
            return this;
        }
        public BuildMe MedAidPolicyName(String MedAidPolicyName)
        {
            this.MedAidPolicyName = MedAidPolicyName;
            return this;
        }
        public BuildMe amountPayable(double amountPayable)
        {
            this.amountPayable = amountPayable;
            return this;
        }
        public BuildMe name(String name)
        {
            this.name = name;
            return this;
        }
         public BuildMe appList(List<Appointments> value){
            apps=value;
            return this;
        }
        //RETURN OUTERCLASS IN INNERCLASS
         public BuildMe Pati(PatientProcedure pat)
        {
            this.ProdName = pat.getProdName();
            return this;
        }
          
        public PatientProcedure  build()
        {
            return new PatientProcedure(this);
        }
    }
 //GETTERS!!!!!!!!!!
   public String getMedAidNum()
   {
       return MedAidNum;
   }
   public List<Appointments> getApps() {
        return apps;
    }
   public String getMedAidPolicyName()
   {
       return MedAidPolicyName;
        
   }
   public String getName()
   {
       return name;
        
   }
   public String getProdName()
   {
       return ProdName;
   }
   public double getAmountPayable()
   {
       return amountPayable;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientProcedure  patProc = (PatientProcedure ) o;

        if (ProdName.equals(patProc.ProdName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return ProdName.hashCode();
    }
}



