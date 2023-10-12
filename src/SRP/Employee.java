package SRP;

public class Employee {
    //    Класс имеет достаточную рабочую логику и отвественность, поэтому метод по
//    расчету заработной платы лучше реализовать в другом классе
    private String name;
    private String dol;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDol() {
        return dol;
    }

    public void setDol(String dol) {
        this.dol = dol;
    }

    public Employee(String name, String dol) {
        this.name = name;
        this.dol = dol;
    }
}
