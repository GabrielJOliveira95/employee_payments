
package employeepayments;


public class OutSourceEmployee extends Employee {
    
    private Double addCharge;
    
    
    public OutSourceEmployee(){
        super();
    }
    
    public OutSourceEmployee(String name, Integer hours, Double valuePerHour, Double addCharge){
          
        super(name, hours, valuePerHour);
        this.addCharge = addCharge;
    
    }
    
    
    public Double getAddCharge(){
         
        return this.addCharge;
    
    }
    
    public void setAddCharge(Double AddCharge){
        
        this.addCharge = addCharge;
    }
    
    
    @Override
     protected Double payments(){
    
        return super.payments() + getAddCharge() * 1.1;
    }
    
    
}
