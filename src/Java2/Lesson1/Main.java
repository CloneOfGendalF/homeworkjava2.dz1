package Java2.Lesson1;

public class Main {

    public static void main(String[] args) {
        ЧетвертыйКласс classFour = new ЧетвертыйКласс("Готовка");
        ЧонАпашка отец = new ЧонАпашка(70, "Гулала; ", classFour ,"Pensioner");
        System.out.println(отец.getInfo());
        Любовница внук = new Любовница(25, "У-ля-ля", new ЧетвертыйКласс("Готовка; "),"Гуляет; ", "wed dev");
        Любовница внук2 = new Любовница(31, "Селена Гомез", new ЧетвертыйКласс("smoke"),"student","game dev");
        System.out.println(внук.getInfo());
        System.out.println(внук2.getInfo());

    }
}


