import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class EmailAddress {

    public static boolean isValidEmailAddress(String emailAddress)
    {

        String regex = "^[a-zA-Z0-9]+[@][a-z]+[/.][a-z]{2,3}[/.][a-z]{2,3}$";
        Pattern p = Pattern.compile(regex);
        if (emailAddress == null) {
            return false;
        }

        Matcher m = p.matcher(emailAddress);
        return m.matches();
    }

    public static void main(String args[])
    {
        String email1 = "abc.xyz@bridgelabz.com";
        System.out.println(email1 + ": "+ isValidEmailAddress(email1));

        String email2 = "abcxyj@fhjn.com";
        System.out.println(email2 + ": "+ isValidEmailAddress(email2));

        String email3 = "fghc@.com";
        System.out.println(email3 + ": "+ isValidEmailAddress(email3));

        String email4 = "400fhjj#hjfg";
        System.out.println(email4 + ": "+ isValidEmailAddress(email4));
    }
   }
