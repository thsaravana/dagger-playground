Errors:



@Component may only be applied to an interface or abstract class
public class DiComponent {
       ^

    <br>
       
Types may only contain one @Inject constructor
    Car(){}
    ^
Types may only contain one @Inject constructor
    Car(String one) {}
    ^
    
       <br>

@Provides methods cannot be abstract
    abstract Vehicle bindCarToVehicle(Car car);
                     ^
         
         <br>
                     
Dagger does not support injection into private constructors
    private Car() {
            ^
        
        <br>    

@Binds methods must be abstract
    Vehicle bindCarToVehicle(Car car){
            ^

    <br>
    
