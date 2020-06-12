class User{
    String firstName
    String lastName
    
    public  String UserName(){
        return getUserName(this.firstName, this.lastName)
    }

    private String getUserName(String firstName, String lastName){
    return firstName.substring(0,1).toLowerCase() + lastName.toLowerCase();
    }
}

String[] firstNames = ["Babak", "Fariz", "Aydin", "Aliaga"]
String[] lastNames = ["Mammadov", "Muradov", "Aliyev", "Ferziyev"]

for(int i=0; i<firstNames.size(); i++){
    User u = new User(firstName: firstNames[i], lastName:lastNames[i])
    println("Username is ${u.UserName()}")
}
