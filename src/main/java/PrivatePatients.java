/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.List;

/**
 *
 * @author Meena
 */
public final class PrivatePatients 
{
    
    private static List<PatientProcedure> pat; 
    private static ClinicalDocuments docie;
   private static List<Appointments> apps;
   //private static PatientProcedure patProc;
   private String name;
   private double amountCovered;
   
   
   private PrivatePatients()
   {
       
   }
   private PrivatePatients (BuildMe build)
    {
        amountCovered = build.amountCovered;
        name = build.name;
    }
    public static class BuildMe
    {
        private String name;
        private double amountCovered;
        
        //mandatory value
        public BuildMe(String name)
        {
            this.name = name;
        }
        
        //"SETTERS"
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
        //LISTS
        public BuildMe appList(List<Appointments> value)
        {
            apps=value;
            return this;
        }
        public BuildMe ProdLis(List<PatientProcedure> value)
        {
            pat=value;
            return this;
        }
        //RETURN OUTERCLASS IN INNERCLASS
        
         public BuildMe privi(PrivatePatients pat)
        {
            this.name= pat.getName();
            return this;
        }
        public PrivatePatients build()
        {
            return new PrivatePatients(this);
        }
    }
    
 //GETTERS!!!!!!!!!!
  
   public String getName()
   {
       return name;
        
   }
    public List<Appointments> getApps() {
        return apps;
    }
     public List<PatientProcedure> getProce() {
        return pat;
    }
   public double getAmountCovered()
   {
       return amountCovered;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrivatePatients priv = (PrivatePatients) o;

        if(name.equals(priv.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}


