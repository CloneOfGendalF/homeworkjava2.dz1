package Java2.Lesson1;

public class ЧонАпашка extends ЧонАташка {
    private String status;
    private ЧетвертыйКласс hobby;

    public ЧонАпашка(int age, String name, ЧетвертыйКласс hobby, String status) {
        super(age, name);
        this.status = status;
        this.hobby = hobby;
    }

    public String getStatus() {
        return status;
    }

    public ЧетвертыйКласс getHobby() {
        return hobby;
    }

    public String getInfo() {
        return "Возраст: " + getAge() + " Имя: " + getName() + " Хобби: " +
                getHobby().getHobby() + " Семейное положение: " + getStatus();
    }
}
//    public void something(String name, String status){
//        System.out.println("Имя: " + name + "Статус: " + status);
//    }
//    public void something (String name,int age){
//        System.out.println("Имя: " + name + " Возраст: " + age);
//    } public void something (String name, String status,int age){
//        System.out.println("Имя: " + name + " Семейное положение: " + status + " Возраст: " + age);
//    }


