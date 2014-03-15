package model;






/**
 *
 * @author Meena
 */
public final class Appointments 
{
   private String name;
   private String app_Num;
   private String reason;
   private double amount;
   
   
   private Appointments ()
   {
       
   }
       private Appointments (BuildMe build)
    {
        app_Num = build.app_Num;
        amount = build.amount;
        reason = build.reason;
        name = build.name;
    }
    public static class BuildMe
    {
        private String name;
        private String app_Num;
        private String reason;
        private double amount;
        
        //mandatory value
        public BuildMe(String app_Num)
        {
            this.app_Num = app_Num;
        }
        //"SETTERS"
        public BuildMe appNum(String app_Num)
        {
            this.app_Num = app_Num;
            return this;
        }
        public BuildMe reason(String reason)
        {
            this.reason = reason;
            return this;
        }
        public BuildMe amount(double amount)
        {
            this.amount = amount;
            return this;
        }
        public BuildMe name(String name)
        {
            this.name = name;
            return this;
        }
        //RETURN OUTERCLASS IN INNERCLASS
        public BuildMe app(Appointments app)
        {
            this.app_Num = app.getAppNum();
            return this;
        }
        
        public Appointments build()
        {
            return new Appointments(this);
        }
    }
 //GETTERS!!!!!!!!!!
   public String getAppNum()
   {
       return app_Num;
   }
   public String getReason()
   {
       return reason;
        
   }
   public String getName()
   {
       return name;
        
   }
   public double getAmount()
   {
       return amount;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Appointments ex = (Appointments) o;

        if (app_Num.equals(ex.app_Num)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return app_Num.hashCode();
    }
}


