import animals.*;

public class Application {
    public static void main(String[] args) {

        Kotik bigKotik = new Kotik("Барс","Мяу",5,20);

        Kotik smallKotik = new Kotik();
        smallKotik.setName("Соня");
        smallKotik.setVoice("Мяу");
        smallKotik.setSatiety(2);
        smallKotik.setWeight(5);

        for (String deal: bigKotik.liveAnotherDay())
        {System.out.println(deal);
        }

        System.out.println(smallKotik.getName());
        System.out.println(smallKotik.getWeight());

        System.out.println("Количество котиков - " + Kotik.getCount());

        compareVoice(smallKotik.getVoice(), bigKotik.getVoice());

        System.out.println(compareVoice(smallKotik.getVoice(), bigKotik.getVoice()));
    }
    public static boolean compareVoice(String k1, String k2){
        if (k1 == k2) return true; else return false;
    }
}
