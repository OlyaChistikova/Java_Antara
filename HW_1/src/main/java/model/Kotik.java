package model;

public class Kotik {
    private static int countKotiks;
    private int satietyDegree;
    private String name;
    private int prettiness;
    private int weight;
    private String meow;

    static {
        countKotiks = 0;
    }

    public Kotik() {
        countKotiks++;
    }

    public Kotik(int satietyDegree, String name, int prettiness, int weight, String meow) {
        countKotiks++;
        this.satietyDegree = satietyDegree;
        this.name = name;
        this.prettiness = prettiness;
        this.weight = weight;
        this.meow = meow;
    }

    public static int getCountKotiks() {
        return countKotiks;
    }

    public boolean play(){
        if (this.satietyDegree > 0){
            System.out.printf("Котик %s поиграл \n", this.name);
            this.satietyDegree--;
            return true;
        } else {
            System.out.printf("Котик %s хочет есть \n", this.name);
            return false;
        }
    }

    public boolean sleep(){
        if (this.satietyDegree > 0){
            System.out.printf("Котик %s поспал \n", this.name);
            this.satietyDegree--;
            return true;
        } else {
            System.out.printf("Котик %s хочет есть \n", this.name);
            return false;
        }
    }

    public boolean chaseMouse(){
        if (this.satietyDegree > 0){
            System.out.printf("Котик %s поймал мышь \n", this.name);
            this.satietyDegree--;
            return true;
        } else {
            System.out.printf("Котик %s хочет есть \n", this.name);
            return false;
        }
    }

    public boolean voice(){
        if (this.satietyDegree > 0){
            System.out.printf("Котик %s подал голос: %s \n", this.name, this.meow);
            this.satietyDegree--;
            return true;
        } else {
            System.out.printf("Котик %s хочет есть \n", this.name);
            return false;
        }
    }

    public boolean drink(){
        if (this.satietyDegree > 0){
            System.out.printf("Котик %s попил \n", this.name);
            this.satietyDegree--;
            return true;
        } else {
            System.out.printf("Котик %s хочет есть \n", this.name);
            return false;
        }
    }

    public void eat(int countFood){
        System.out.printf("Котик %s поел на %d единиц сытости\n", this.name, countFood);
        this.satietyDegree += countFood;
    }

    public void eat(int countFood, String nameFood){
        System.out.printf("Котик %s поел %s на %d единиц(у/ы) сытости\n", this.name, nameFood, countFood);
        this.satietyDegree += countFood;
    }

    public void eat(){
        eat(1, "что-то");
    }

    public void liveAnotherDay(){
        for (int i = 0; i < 24; i++){
            int random = (int)(Math.random() * 5 + 1);

            switch (random){
                case 1:
                    if (!this.play()) {
                        this.eat(10);
                    }
                    break;
                case 2:
                    if (!this.sleep()){
                        this.eat(10);
                    }
                    break;
                case 3:
                    if (!this.chaseMouse()){
                        this.eat(10);
                    }
                    break;
                case 4:
                    if (!this.voice()){
                        this.eat(10);
                    }
                    break;
                case 5:
                    if (!this.drink()){
                        this.eat(10);
                    }
                    break;
            }
        }
    }

    public int getSatietyDegree() {
        return satietyDegree;
    }

    public String getName() {
        return name;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public void setKotik(int prettiness, String name, int weight, String meow){
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }
}
