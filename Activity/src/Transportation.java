public class Transportation {
    //private fields
    private int choice;
    private String typeOfTransportation;
    private String modeOfTransportation;
    private String route;

    //Constructors
    public Transportation(){
    }

    public Transportation(String type, String mode, String route){
        this.typeOfTransportation = type;
        this.modeOfTransportation = mode;
        this.route = route;
    }

    //setters
    public void setChoice(int choice) {
        this.choice = choice;
    }
    public void setTypeOfTransportation(String type){
        this.typeOfTransportation = type;
    }
    public void setModeOfTransportation(String modeOfTransportation) {
        this.modeOfTransportation = modeOfTransportation;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    //Getters
    public int getChoice() {
        return this.choice;
    }
    public String getTypeOfTransportation(){
        return this.typeOfTransportation;
    }
    public String getModeOfTransportation() {
        return this.modeOfTransportation;
    }

    public String getRoute() {
        return this.route;
    }

    //Display Method
    public void display(int number){
        System.out.println("================================");
        System.out.println("\t\tTransportation" + " " + number + "\n" + typeOfTransportation + " || " + modeOfTransportation + " || " + route);
        System.out.println("================================");
    }
}
