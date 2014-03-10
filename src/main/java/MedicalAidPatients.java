


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Meena
 */
public final class MedicalAidPatients
{
   private static List<Appointments> apps;
   //private static PatientProcedure patProc;
   private String name;
   private String MedAidNum;
   private String MedAidPolicyName;
   private double amountCovered;
   
   
   private MedicalAidPatients ()
   {
       
   }
   private MedicalAidPatients (BuildMe build)
    {
        MedAidNum = build.MedAidNum;
        MedAidPolicyName = build.MedAidPolicyName;
        amountCovered = build.amountCovered;
        name = build.name;
    }
    public static class BuildMe
    {
        private String name;
        private String MedAidNum;
        private String MedAidPolicyName;
        private double amountCovered;
        
        //mandatory value
        public BuildMe(String MedAidNum)
        {
            this.MedAidNum = MedAidNum;
        }
        //"SETTERS"
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
        public BuildMe amountCovered(double amountCovered)
        {
            this.amountCovered = amountCovered;
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
          public BuildMe MedP(MedicalAidPatients pat)
        {
            this.MedAidNum= pat.getMedAidNum();
            return this;
        }
                 
        public MedicalAidPatients build()
        {
            return new MedicalAidPatients(this);
        }
    }
 //GETTERS!!!!!!!!!!
   public String getMedAidNum()
   {
       return MedAidNum;
   }
   public List<Appointments> getAnswers() {
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
   public double getAmountCovered()
   {
       return amountCovered;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MedicalAidPatients MedAid = (MedicalAidPatients) o;

        if(MedAidNum.equals(MedAid.MedAidNum)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return MedAidNum.hashCode();
    }
}


