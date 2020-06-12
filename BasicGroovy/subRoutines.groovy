/*
Subroutines
functions(return value)  and methods(don't return value)
*/

String getUserName(String firstName, String lastName){
    return firstName.substring(0,1).toLowerCase() + lastName.toLowerCase();
}

//println(getUserName("Babak", "Mammadov")

// check firtname and lastname generated
assert getUserName("Babak","Mammadov") == "bmammadov" : "getUserName isn't working"


void printCredentials(cred){
    println("Username is ${cred}")
}

String[] firstNames = ["Babak", "Fariz", "Aydin", "Aliaga"]
String[] lastNames = ["Mammadov", "Muradov", "Aliyev", "Ferziyev"]

for(int i=0; i<firstNames.size(); i++){
    // send usename and generate credentials based on this
    printCredentials(getUserName(firstNames[i], lastNames[i]))
}
