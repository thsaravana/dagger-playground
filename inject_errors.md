-[x] Dagger does not support injection into private constructors
-[x] Dagger does not support injection into private fields
-[x] Dagger does not support injection into private methods

-[x] @Qualifier annotations are not allowed on @Inject constructors
-[x] @Scope annotations are not allowed on @Inject constructors; annotate the class instead

Dagger does not support checked exceptions on @Inject constructors

@Inject is nonsense on the constructor of an abstract class

@Inject constructors are invalid on inner classes. Did you mean to make the class static?

Types may only contain one @Inject constructor

A single binding may not declare more than one @Scope

@Inject fields may not be final

Dagger does not support injection into static fields
Dagger does not support injection into static methods

Methods with @Inject may not declare type parameters

Methods with @Inject may not be abstract

Methods with @Inject may not throw checked exceptions. Please wrap your exceptions in a RuntimeException instead.

Dagger does not support injection into private classes

Dagger does not support injection into Kotlin objects