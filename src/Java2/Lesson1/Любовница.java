package Java2.Lesson1;

public  class Любовница extends ЧонАпашка {
    private String freeLance;

    public Любовница(int age, String name, ЧетвертыйКласс hobby, String status, String freeLance) {
        super(age, name, hobby, status);
        this.freeLance = freeLance;
    }

    public String getFreeLance() {
        return freeLance;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " freelance " + getFreeLance();
    }
}