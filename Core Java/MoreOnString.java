public class MoreOnString {
    public static void main(String[] args) {
        // reference in heap as well as in string pool
        String str=new String("michael");
        // reference in string const pool
        String s1="michael";
        String s2="jackson";
        String s3=s1+s2;
        System.out.println(s3);
        System.out.println(str==s1);
        System.out.println(s1.length());
        

        String s4="Kshitij Dwivedi";
        System.out.println(s4);
        System.out.println(s4.toLowerCase());
        System.out.println(s4.toUpperCase());
        System.out.println(s4.length());
        System.out.println(s4.charAt(12));
        System.out.println(s4.indexOf("i"));

        // mutable Strings
        StringBuffer sb =new StringBuffer("Rampage");
        sb.append(" Mania");
        System.out.println(sb);

        StringBuilder sb2=new StringBuilder("haree");
        sb2.append(" Ram");
        System.out.println(sb2);
        System.out.println("capacity of string Buffer is : "+sb.capacity());
        System.out.println("capacity of string Buuilder is : "+sb2.capacity());
    }
}
