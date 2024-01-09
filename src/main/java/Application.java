import animals.*;

public class Application {
    public static void main(String[] args) {

        Kotik bigKotik = new Kotik("Барс","Мяу",5,20);

        Kotik smallKotik = new Kotik();
        smallKotik.setName("Соня");
        smallKotik.setVoice("Миу");
        smallKotik.setSatiety(2);
        smallKotik.setWeight(5);

        for (String deal: bigKotik.liveAnotherDay())
        {System.out.println(deal);
        }

        System.out.println(smallKotik.getName());
        System.out.println(smallKotik.getWeight());

        System.out.println("Количество котиков - " + Kotik.getCount());

        System.out.println(compareVoice(smallKotik, bigKotik));
    }
    public static boolean compareVoice(Kotik k1, Kotik k2){
        if (k1.getName() == k2.getName()) return true; else return false;
    }
}
