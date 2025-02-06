package repositorio3;

import java.util.*;

public class nose{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            String input = sc.nextLine();
            String[] inputCatcher = input.split(" ");
            ArrayList<String> inputProcess = new ArrayList<>();

            for (String element : inputCatcher) { 
                    inputProcess.add(element);
            }

            int lenght = inputProcess.size();
            int result = 0;

            for(int i = 0; i<lenght;i++){
                if(inputProcess.get(i).equals("+") && i > 0 && i < lenght - 1){
                    int prev = Integer.parseInt(inputProcess.get(i-1));
                    int next = Integer.parseInt(inputProcess.get(i+1));
                    result += prev + next;
                } else if(inputProcess.get(i).equals("-") && i > 0 && i < lenght - 1){
                    int prev = Integer.parseInt(inputProcess.get(i-1));
                    int next = Integer.parseInt(inputProcess.get(i+1));
                    result += prev - next;
                } else {
                    continue;
                }
            }
            System.out.println(result);
        }
        System.out.println("Guayaba");
    }
}