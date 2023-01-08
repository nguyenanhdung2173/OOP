package javabase.lab1;

public class CheckPassFail {

   public static boolean checkPassFail(int mark) {
       if (mark >= 50) return true;

       return false;
   }

    public static void main(String[] args) {
        int mark = 49;
        System.out.println("The mark is: " + mark);

        if (checkPassFail(mark)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

}
