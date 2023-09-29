public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot debbie = new ChatBot("bob", 21);

        debbie.greeting("Benny Lin");
        debbie.weather();
        debbie.favoriteNumber(7);
        debbie.funfact("Benny Lin");



        double feetToMetter = debbie.convertFeetToMeters(10);
        System.out.println("There are " + feetToMetter + " in 10 feet!");
        int sum = debbie.addNumbers(1,2,3);
        int times = debbie.timeNumbers(1,2,3);
        System.out.println("The sum is " + sum);
        System.out.println("The is product is " + times);
        String bye = debbie.goodbye();
        System.out.println(bye);

    }
}
