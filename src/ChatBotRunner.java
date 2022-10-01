public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot deb = new ChatBot("Debbie", 13);
        deb.greeting("Jialiang");
        int age = deb.old(10);
        System.out.println("I am "+age+" in robot years!");
        deb.weather();
        System.out.println("Did you know that 10 feet is " + deb.convertFeetToMeters(10) + " meters.");
        deb.favoriteNumber(20);
        System.out.println("My second favorite number is " + deb.addNumbers(13,20,11));
        deb.aboutme();
        String bye = deb.goodbye();
        System.out.println(bye);


    }
}
