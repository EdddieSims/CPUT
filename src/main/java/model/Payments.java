package model;




/**
 *
 * @author Meena
 */
public final class Payments 
{
   private String itemPayable;
   private double amount;
   private double expectdToPay;
   
   private Payments()
   {
       
   }
       private Payments(BuildMe build)
    {
        itemPayable = build.itemPayable;
        amount = build.amount;
        expectdToPay = build.expectdToPay;
    }
    public static class BuildMe
    {
        private String itemPayable;
        private double amount;
        private double expectdToPay;
        
        //mandatory value
        public BuildMe(double amount)
        {
            this.amount = amount;
        }
        //"SETTERS"
        public BuildMe itemPay(String itemPayable)
        {
            this.itemPayable = itemPayable;
            return this;
        }
        public BuildMe expToPay(double expectdToPay)
        {
            this.expectdToPay = expectdToPay;
            return this;
        }
        public BuildMe amount(double amount)
        {
            this.amount = amount;
            return this;
        }
        public BuildMe pay(Payments pat)
        {
            this.amount= pat.getAmount();
            return this;
        }
        //RETURN OUTERCLASS IN INNERCLASS
        public Payments build()
        {
            return new Payments(this);
        }
    }
 //GETTERS!!!!!!!!!!
   public String getItemPayable()
   {
       return itemPayable;
   }
   public double getExpenses()
   {
       return expectdToPay;
        
    }
   public double getAmount()
   {
       return amount;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payments ex = (Payments) o;

        if (itemPayable.equals(ex.itemPayable)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return itemPayable.hashCode();
    }
}


