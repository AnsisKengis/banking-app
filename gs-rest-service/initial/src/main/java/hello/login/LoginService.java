package hello.login;

import org.springframework.stereotype.Service;


@Service
public class LoginService {


    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("123") && password.equals("123");
    }
}
