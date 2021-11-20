public class Cat extends Felidae {

    private boolean isLivingInStreet;

    public Cat(float weight, float tailLength, boolean isLivingInStreet, FurColor furColor) {
        super(weight,tailLength, furColor);
        this.isLivingInStreet = isLivingInStreet;
    }

    public boolean isLivingInStreet() {
        return isLivingInStreet;
    }

    public void setLivingInStreet(boolean livingInStreet) {
        isLivingInStreet = livingInStreet;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "isLivingInStreet=" + isLivingInStreet +
                ", furColor=" + furColor +
                ", weight=" + weight +
                ", tailLength=" + tailLength +
                '}';
    }

    public void bite(String b) {

        System.out.println("This Cat is Biting!!!");
    }

    public void workForFood(String w) {

        System.out.println("This Cat will do anything in order to work for its food!");
    }

    public void Meow(){

        System.out.println("This Cat is Meowing!!");
    }
}