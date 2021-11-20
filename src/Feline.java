public class Feline extends Felidae {

    private boolean isLivingInStreet;


    public Feline(float weight, float tailLength, boolean isLivingInStreet, FurColor furColor) {
        super(weight,tailLength, furColor);
        this.isLivingInStreet = isLivingInStreet;
    }

    public boolean isLivingInStreet() {
        return isLivingInStreet;
    }

    public void setLivingInStreet(boolean livingInStreet) {
        isLivingInStreet = livingInStreet;
    }


    public void bite(String b) {

        System.out.println("This Feline is Biting!!!");
    }

    public void workForFood(String w) {

        System.out.println("This Feline's mothers is working for its food!");
    }

    public void Meow() {

        System.out.println("This Feline is Meowing!!");
    }

    @Override
    public String toString() {
        return "Feline{" +
                "furColor=" + furColor +
                ", weight=" + weight +
                ", tailLength=" + tailLength +
                ", isLivingInStreet=" + isLivingInStreet +
                '}';
    }
}
