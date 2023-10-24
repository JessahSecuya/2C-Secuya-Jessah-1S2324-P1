public class NewDisplay implements Present{
    @Override
    public void show(String type, String mode, String route) {
        System.out.println();
        System.out.println("================================");
        System.out.println("\t\tTransportation" + "\n" + type + " || " + mode + " || " + route);
        System.out.println("================================");
    }
}
