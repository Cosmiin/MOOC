package week4.Exercise81;

import java.util.Random;

public class PasswordRandomizer {
    int passwordLenght;


    public PasswordRandomizer(int length) {
        this.passwordLenght=length;
    }

    public String createPassword() {
       Random random1 = new Random();
       StringBuilder password1 = new StringBuilder();
       String password="";
        for (int i = 0; i < passwordLenght; i++) {
            char alphabet ="abcdefghijklmnopqrstuvwxy".charAt(random1.nextInt(passwordLenght));
            password1.append(alphabet);
        }
        String parola =password1.toString();

return parola;

}
}


