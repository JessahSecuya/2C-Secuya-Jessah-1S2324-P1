public class Print extends Transportation{
    private String type;
    public void choiceDisplay(){
        System.out.println("\t\tCHOOSE TYPE OF TRANSPORTATION");
        System.out.println("==============================================");
        System.out.println("|| \t\t(1) Air\t\t(2)Sea\t\t(3)Land     ||");
        System.out.println("==============================================");
    }

    @Override
    public void setChoice(int choice) {
        if(choice == 1)
            type = "Air";
        else if(choice == 2)
            type = "Sea";
        else if(choice == 3)
            type = "Land";
        else {
            System.out.println("Enter valid choice");
            System.exit(0);
        }
    }
    public String getType(){
        return this.type;
    }
}
