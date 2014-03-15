package model;



/**
 *
 * @author Meena
 */

public final class InvoicePat 
{
   private String InvoiceNum;
   private double amount;
   private String name;
    
    private InvoicePat ()
    {
        
    }
    private InvoicePat (BuildMe build)
    {
        InvoiceNum = build.InvoiceNum;
        amount = build.amount;
        name = build.name;
    }
    public static class BuildMe
    {
        private String InvoiceNum;
        private double amount;
        private String name;
        
        //mandatory value
        public BuildMe(String InvoiceNum)
        {
            this.InvoiceNum = InvoiceNum;
        }
        //"SETTERS"
        public BuildMe name(String name)
        {
            this.name = name;
            return this;
        }
        public BuildMe Inv(String InvoiceNum)
        {
            this.InvoiceNum = InvoiceNum;
            return this;
        }
        public BuildMe amount(double amount)
        {
            this.amount = amount;
            return this;
        }
        //RETURN OUTERCLASS IN INNERCLASS
        
        public BuildMe invP(InvoicePat pat)
        {
            this.InvoiceNum= pat.getInv();
            return this;
        }
        public InvoicePat build()
        {
            return new InvoicePat(this);
        }
    }
 //GETTERS!!!!!!!!!!
   public String getInv()
   {
       return InvoiceNum;
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

        InvoicePat ex = (InvoicePat) o;

        if (InvoiceNum.equals(ex.InvoiceNum)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return InvoiceNum.hashCode();
    }
}
