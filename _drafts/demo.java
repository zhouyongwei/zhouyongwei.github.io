package _drafts;

public class demo {
    public static void main(String[] args) {
        String str = "5";
        String regex = "^[\\d]{1,}$";
        if (str.matches(regex)) {
            Integer.parseInt(str);
        } else {
            System.out.println("error["+str+"]");
            return;
        }
        Integer x = Integer.valueOf(str);
        System.out.println(x);
        /*
        try {
            new SimpleDateFormat().parse("source");
        } catch (ParseException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        NumberFormatException e = new NumberFormatException();
        if (e instanceof RuntimeException) {
            System.out.println("yes");
        }
        */
    }
}