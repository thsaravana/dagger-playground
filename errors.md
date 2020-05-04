Errors:

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
      
      
@Scope annotations are not allowed on @Inject constructors; annotate the class instead
    @Singleton
    ^
    
    <br>
      
      
e: /Users/sthiyagaraj/Me/Madrapps/dagger-playground/src/main/java/com/madrapps/dagger/component/singleton/SingletenComponent.java:9: error: [Dagger/IncompatiblyScopedBindings] SingletenComponent (unscoped) may not reference scoped bindings:

public interface SingletenComponent {
       ^
      @Singleton class Railways


    <br>
    
@Subcomponent.Factory types must be nested within a @Subcomponent
    interface Factory {
    ^
    
    <br>
    
@Component.Factory types must have exactly one abstract method. Already found: build(Buggy)
        EmptySubComponent carry();
                          ^
                          
      <br>
       
Members injection methods may only return the injected type or void.
    Highways inject(Street street);
             ^
             
     <br>
     
Types may only contain one @Inject constructor
    FactoryModule(Car car) {
    ^
    
    <br>
    
error: /Users/sthiyagaraj/Me/Madrapps/dagger-playground/src/main/java/com/madrapps/dagger/multibindings/intoset/provides/IntoSetProvidesModule.java:18: error: @Provides methods of non map type cannot declare a map key

    <br>
    
error: /Users/sthiyagaraj/Me/Madrapps/dagger-playground/src/main/java/com/madrapps/dagger/multibindings/intomap/boxedkeys/IntoMapBoxedKeyComponent.java:9: error: [Dagger/MapKeys] The same map key is bound more than once for java.util.Map<java.lang.Integer,com.madrapps.dagger.models.Vehicle>

    <br>

error: /Users/sthiyagaraj/Me/Madrapps/dagger-playground/src/main/java/com/madrapps/dagger/multibindings/intomap/boxedkeys/IntoMapBoxedKeyComponent.java:20: error: @Multibinds methods can only be present within a @Module or @ProducerModule

    <br>
    
error: /Users/sthiyagaraj/Me/Madrapps/dagger-playground/src/main/java/com/madrapps/dagger/multibindings/intomap/boxedkeys/IntoMapBoxedKeyModule.java:55: error: @Provides methods may not have more than one map key

    <br>
    
e: /Users/sthiyagaraj/Me/Madrapps/dagger-playground/src/main/java/com/madrapps/dagger/subcomponent/simple/SimpleRootComponent.java:10: error: [com.madrapps.dagger.subcomponent.simple.SimpleSubComponent] com.madrapps.dagger.subcomponent.simple.SimpleSubComponent has conflicting scopes:
public interface SimpleRootComponent {
       ^
    com.madrapps.dagger.subcomponent.simple.SimpleRootComponent also has @Singleton

    <br>
    
    
error: Dagger does not support injection into private constructors
error: Dagger does not support injection into private fields
error: Dagger does not support injection into private methods

error: Types may only contain one @Inject constructor

error: @Scope annotations are not allowed on @Inject constructors; annotate the class instead

error: @Qualifier annotations are not allowed on @Inject constructors

