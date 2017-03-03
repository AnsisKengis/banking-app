package hello.validation;


import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

    @Email
    @NotNull
    @Size(min=2, max=30)
    private String email;

    @NotNull
    @Size(min = 5, max = 18)
    private String password;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Person(Email: " + this.email + ", password: " + this.password + ")";
    }
}
