import java.lang.* 
import java.util.* 
import java.io.* 
import java.net.* 

import groovy.lang.* 
import groovy.util.* 

import java.math.BigInteger 
import java.math.BigDecimal
// groovyy defaul import above libraries

//Do not use any type (that will create a global variable):
a = 2  // you change of this type every time
//Use keyword def (that will create a local variable):
def b = 3   // you change of this type every time
//Use the actual type (that will create a local variable of strict type Integer):
int c = 4    // you change of this type every time - So they cannot be reassigned to different types


// String, int, Boolean, float
def age = 25
String name = "Babak Mammadov"
int  courseCount = 5
float salary = 99999999999999999.99
Boolean isDevOps = true

println name + " is " + age + "  years old"
println name + " has created " + courseCount + " courses."
println name + " is a devops? " + isDevOps
println name + " is a devops? " + isDevOps.toString().capitalize()
println name + " wished his salary was " + salary
println name + " wished his salary was \$" + String.format("%.2f", salary)






// Using no types for variables
a = 2
printf "%s - %s%n", a.getClass().getName(), a
a = "apple"
printf "%s - %s%n", a.getClass().getName(), a



//Variables with no type are global so they can be accessed across methods.
a = 2
void printVars() {
    println a;
    b = 3;
}
printVars();
print b;

// new line
printf "%n"

// initialize default values
def a //initialized with null
println a

String s //initialized with null
println s

int x //initialized with null
println x
println x + 3

boolean bool//initialized with false
println bool