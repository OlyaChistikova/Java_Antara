import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik vaska = new Kotik(2, "Васька", 3, 5, "МЯЯЯУ");
        vaska.liveAnotherDay();
        System.out.println("Котик " + vaska.getName() + " весит " + vaska.getWeight() + " кг.");

        Kotik ludka = new Kotik();
        ludka.setKotik(10, "Людка", 3, "Мур");

        System.out.println("Коты Васька и Людка говорят одинаково = " + vaska.getMeow().equals(ludka.getMeow()));

        System.out.println("Создано котиков: " + Kotik.getCountKotiks());
    }
}