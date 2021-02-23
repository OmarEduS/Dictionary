public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1");
        System.out.println("tgt");
        System.out.println("1D");

        String Test="tgt";
        String Code="";
        Dictionary<String, String> dictionary = new Dictionary();

        Code=dictionary.getBinval(Test);

        System.out.println(Test);
        System.out.println(Code);
    }
}