public Dice Main {
    //attributes
    private int sides;

    //atributes
    public Dice Main(int sides) {
        this.sides = sides;
    }
    //atributes
    public int roll() {
        return (int) (Math.random() * sides) + 1;
    }
    //methods
    public int getSides() {
        return sides;
    }
    //methods
    public void setSides(int sides) {
        this.sides = sides;
    }
    //methods
    public String toString() {
        return "Dice Main [sides=" + sides + "]";
    }
    //methods
    public static void main(String[] args) {
        Dice Main d = new Dice Main(6);
        System.out.println(d);
        System.out.println(d.roll());
    }
    //roll 
    public int roll() {
        return (int) (Math.random() * sides) + 1;
    }
    //roll the dice
    public int roll() {
        return (int) (Math.random() * sides) + 1;
    }
    
}
