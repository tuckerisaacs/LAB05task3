import jdk.jfr.Name;

public class Main {
    public static void main(String[] args) {
        String democrat = "D";
        String republican = "R";
        String independent = "I";
        String other = "O";
        String input = "D";


        if(input.equalsIgnoreCase("D")) {

            System.out.println("you get a democratic donkey!");
        }
        else if(input.equalsIgnoreCase("R")){
            System.out.println("you get a rebublican elephant!");
        }
        else if(input.equalsIgnoreCase("I")){
            System.out.println("you get a independent person!");
        }
        else if(input.equalsIgnoreCase("O")){
            System.out.println("you get nothing, pick a party that will win derpy!");
        }


    }
}