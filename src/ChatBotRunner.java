public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot debbie = new ChatBot("bob", 21);

        debbie.greeting("Benny Lin");
        debbie.weather();

        debbie.favoriteNumber(7);



        double feetToMetter = debbie.convertFeetToMeters(10);
        System.out.println("There are " + feetToMetter + " in 10 feet!");
        int sum = debbie.addNumbers(1,2,3);
        System.out.println("The sum is " + sum);
        String bye =    debbie.goodbye();
        System.out.println(bye);
        System.out.println("hi");
    }
}
