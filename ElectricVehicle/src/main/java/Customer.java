public class Customer {
    public String name;
    public int GreenProgram;

    public Customer(String name, int budget) {
        this.name = name;
        this.GreenProgram = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGreenProgram() {
        return GreenProgram;
    }

    public void setGreenProgram(int greenProgram) {
        this.GreenProgram = greenProgram;
    }
}
