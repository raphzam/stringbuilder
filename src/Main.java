public class Main {
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("hello world");

        System.out.println(sb);

        System.out.println(sb.reverse());

        sb.append(", these are great");

        System.out.println(sb);

        String s = " addition ";

        sb.insert(5, s);

        System.out.println(sb);

    }
}
