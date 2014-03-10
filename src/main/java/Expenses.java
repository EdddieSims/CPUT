

/**
 *
 * @author Meena
 */
public final class Expenses 
{
   private String itemPurch;
   private double amount;
   private double expectdExp;
    
    private Expenses()
    {
        
    }
    private Expenses(BuildMe build)
    {
        itemPurch = build.itemPurch;
        amount = build.amount;
        expectdExp = build.expectdExp;
    }
    public static class BuildMe
    {
        private String itemPurch;
        private double amount;
        private double expectdExp;
        
        //mandatory value
        public BuildMe(double amount)
        {
            this.amount = amount;
        }
        //"SETTERS"
        public BuildMe itemP(String itemPurch)
        {
            this.itemPurch = itemPurch;
            return this;
        }
        public BuildMe exp(double expectdExp)
        {
            this.expectdExp = expectdExp;
            return this;
        }
        public BuildMe amount(double amount)
        {
            this.amount = amount;
            return this;
        }
        //RETURN OUTERCLASS IN INNERCLASS
        public BuildMe expenses(Expenses ex)
        {
            this.amount= ex.getAmount();
            return this;
        }
        
        public Expenses build()
        {
            return new Expenses(this);
        }
        
    }
 //GETTERS!!!!!!!!!!
   public String getItemPurch()
   {
       return itemPurch;
   }
   public double getExpenses()
   {
       return expectdExp;
        
    }
   public double getAmount()
   {
       return amount;
   }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Expenses ex = (Expenses) o;

        if (itemPurch.equals(ex.itemPurch)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return itemPurch.hashCode();
    }
}
