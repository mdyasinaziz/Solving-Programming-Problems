public class Author {
    private String name = "Abir";
    private String email = "yasin@gmail.com";
    private char gender = 'm';
    
    public Author () {
    
    }
    
    public String getName() {
    return name;
    }
    
    public String getEmail() {
    return email;
    }
    
    public void setEmail(String z) {
    email = z;
    }
    
    public char getGender() {
    return gender;
    }
    
    public String toString (){
    return name + "(" + gender + ")" + "at" + email;
    }
}
    
    
    