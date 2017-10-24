
/**
 *
 * @author Mitch
 */
public class Temp {
    
    private double temp;
    private String tempMsg;
    
    public Temp() {
        setTemp(temp);
    } 
    
    public final double getTemp() {
        return temp;
    }

    public final void setTemp(double temp) {
        if (temp <= -50 || temp >= 150){
            throw new IllegalArgumentException("No way bud thats not valid try again");
            }
        this.temp = temp;
    } 
    
    //Standard if statement mess
    
    public final String getTempMsg() {
        return tempMsg;
    }
    
    public final void determineTempMsg(){
        
        if(temp <= 150 && temp > 80){
            this.tempMsg = "Hot";
        }else if(temp <= 80 && temp > 40){
            this.tempMsg = "Mild5";
        }else if(temp <= 40 && temp > -50){
            this.tempMsg = "Cold";
        }
        this.tempMsg = tempMsg;
    }

   
}
