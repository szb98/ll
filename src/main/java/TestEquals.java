public class TestEquals {
    public static void main(String[] args) {
        String s = "aaa";
        String s1 = "aaa";
        String s2 = new String("aaa");
        String s3 = new String("aaa");
       //true true false true
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
    }
}
