package BitlabAcademy.OOP.AbstractClasses.Task2;

public abstract class Food {
    String name;
    public Food(String name) {
        this.name = name;
    }
    public double getCalories;
    public void GetCalories(){
        System.out.println("food calories: " + getName() + " " + getCalories);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
