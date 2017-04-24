/**
 * Created by louie on 4/22/2017.
 */
public class Main {
    public static StringBuffer editor = new StringBuffer();

    public static void main(String[] args) {
        Company Turner = new Company("Turner Broadcasting");
        Channel Adult_Swim = new Channel("Adult Swim");
        TV_Show show1 = new TV_Show("Rick and Morty");
        TV_Show show6 = new TV_Show("Samurai Jack");
        Turner.add(Adult_Swim);
        Adult_Swim.add(show1);
        Adult_Swim.add(show6);
        Turner.entertainment();

        Company CFox = new Company("21st Century Fox");
        Channel Fox = new Channel("Fox");
        Channel FXX = new Channel("FXX");
        TV_Show show2 = new TV_Show("The Simpsons");
        TV_Show show3 = new TV_Show("Archer");
        TV_Show show4 = new TV_Show("It's Always Sunny in Philadelphia");
        TV_Show show5 = new TV_Show("Bob's Burgers");
        CFox.add(Fox);
        CFox.add(FXX);
        Fox.add(show2);
        Fox.add(show5);
        FXX.add(show3);
        FXX.add(show4);
        CFox.entertainment();
    }
}
