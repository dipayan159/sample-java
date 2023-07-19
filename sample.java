import java.util.Random;

class sample {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //call the method
        System.out.println(generateString(13));
    }
    //write a string generation method
    public static String generateString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0; i < length; i++)
            sb.append(str.charAt(rnd.nextInt(str.length())));
        //add a null checker
        if(sb.toString() == null) {
            return "null";
        }
        return sb.toString();
    }
}