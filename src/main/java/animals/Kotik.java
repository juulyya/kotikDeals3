package animals;

public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    static private int count = 0;

    static final private int METHODS =5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public int getMethods() {
        return methods;
    }

    public void setMethods(int methods) {
        this.methods = methods;
    }

    private int methods = 5;

    public Kotik() {
        newKotik();
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        newKotik();
    }

    public void newKotik() {
        count += 1;
    }

    public boolean play() {
        if (satiety > 0) {
            satiety -= 1;
            //System.out.println("Котик поиграл");
            return true;
        } else {
            //System.out.println("Котик голоден");
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            satiety -= 1;
            //System.out.println("Котик поспал");
            return true;
        } else {
            //System.out.println("Котик голоден");
            return false;
        }
    }

    public boolean wash() {
        if (satiety > 0) {
            satiety -= 1;
            //System.out.println("Котик умылся");
            return true;
        } else {
            //System.out.println("Котик голоден");
            return false;
        }
    }

    public boolean walk() {
        if (satiety > 0) {
            satiety -= 1;
            // System.out.println("Котик погулял");
            return true;
        } else {
            //System.out.println("Котик голоден");
            return false;
        }
    }

    public boolean hunt() {
        if (satiety > 0) {
            satiety -= 1;
            //System.out.println("Котик поохотился");
            return true;
        } else {
            //System.out.println("Котик голоден");
            return false;
        }
    }

    public void eat(int increaseSatiety) {
        satiety += increaseSatiety;
    }

    public void eat(int increaseSatiety, String foodName) {
        eat(2);
    }

    public void eat(){
        eat(2,"Китикет");
    }


    public String[] liveAnotherDay() {
        String[] kotikDayDeals = new String[24];

        for (int i = 0; i < 24; i++) {
            double random = Math.random() * 5;
            switch ((int) random) {
                case 0:
                    if (play() == true) {
                        kotikDayDeals[i] = i + " - Котик поиграл";
                    } else {
                        eat(3);
                        kotikDayDeals[i] = i + " - Котик кушал";
                    }
                    break;
                case 1:
                    if (sleep() == true){
                        kotikDayDeals[i] = i + " - Котик поспал";
                    }
                    else {
                        eat(3);
                        kotikDayDeals[i] = i + " - Котик кушал";
                    }
                    break;
                case 2:
                    if (hunt() == true) {
                        kotikDayDeals[i] = i + " - Котик поохотился";
                    }
                    else {
                        eat(3);
                        kotikDayDeals[i] = i + " - Котик кушал";
                    }
                    break;
                case 3:
                    if (walk() == true) {
                        kotikDayDeals[i] = i + " - Котик погулял";
                    }
                    else {
                        eat(3);
                        kotikDayDeals[i] = i + " - Котик кушал";
                    }
                    break;
                case 4:
                    if (wash() == true) {
                        kotikDayDeals[i] = i + " - Котик умылся";
                    }else {
                        eat(3);
                        kotikDayDeals[i] = i + " - Котик кушал";
                    }
                    break;

            }

        }
        return kotikDayDeals;
    }
}
