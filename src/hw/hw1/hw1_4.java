package hw.hw1;

class Dog {
    private String name;
    private String breed;
    private String color;
    private int phone_number;
    private int age;

    public Dog(String name, int age, int phone_number, String color, String breed) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.color = color;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", phone_number=" + phone_number +
                ", age=" + age +
                '}';
    }
}
class Main2 {
        public static void main(String[] args) {
         Dog dog = new Dog("Buddy", 3, 123456789, "Brown", "Labrador");
         System.out.println(dog);
        }
}

