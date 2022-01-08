package Implementation.QueueStackProject;

public class Examples {
    public static void checkEqual(String str1, String str2){
        if (str1 == str2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }


    public static void main(String[] args) {
    String str1 = "297";
    String str2 = "297";
    String str3 = new Integer(297).toString();

    checkEqual(str1, str2);
    checkEqual(str1, str3);


    }
}
