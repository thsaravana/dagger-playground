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
    
com.madrapps.dagger.component.module.binds.BindModule is listed as a module, but is not annotated with @Module
@Component(modules = BindModule.class)
^
@Binds methods can only be present within a @Module or @ProducerModule
    abstract Vehicle bindCarToVehicle(Car car);
                     ^

        <br>

@Binds methods of type map must declare a map key
    abstract Vehicle getCar(Car car);
                     ^
@Binds methods of type map must declare a map key
    abstract Vehicle getTruck(Truck truck);
                     ^
                     
     <br>



    @Module
    public abstract class IntoMapModule {

        @Binds
        @IntoMap
        @StringKey("car")
        abstract Vehicle getCar(Car car);
        
        @Provides
        @IntoMap
        @StringKey("truck")
        Vehicle getTruck() {
            return new Truck();
        }
    }

A @Module may not contain both non-static and abstract binding methods
public abstract class IntoMapModule {
                ^                
                
      <br>
      