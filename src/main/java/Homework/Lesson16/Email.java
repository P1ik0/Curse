package Homework.Lesson16;

public class Email {
    String email;

    Email(String email){
        this.email = email;
    }
    public static void emailgek(String em1)
    {

        String s1 = em1;
        boolean b3 = s1.endsWith(";");
        if (b3 == true)
        {
            int i1 = s1.indexOf('@');
            int i2 = s1.indexOf('.',i1);
            String c1 = s1.substring(i1+1,i2);
            System.out.println(c1);
        }
        else
        {
            System.out.println("В конце почты должно ';' ");
        }

    }
    public static void main(String[] args) {

        Email em1 = new Email("asfs@mail.ru;");
        emailgek(em1.email);

    }
}
