package main.java.solid.singleresponsibility.suitable;

public class LoginService {

    public void login(String username) {
        System.out.println(username + "login");
    }

    public void logout(String username) {
        System.out.println(username + "logout");
    }
}
