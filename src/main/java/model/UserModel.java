package model;

public class UserModel {

    private int id;
    private String username;


    private String email;

    public UserModel(){

    }

    public UserModel(String username,String email){
        this.username =username;
        this.email = email;
    }

    public String getUsername(){
        return this.username;
    }

    public void  setUsername(String username){
        this.username= username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
