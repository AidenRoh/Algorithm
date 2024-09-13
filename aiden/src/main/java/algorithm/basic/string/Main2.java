package algorithm.basic.string;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Main2 main = new Main2();
        var scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        String result = main.solution(source);
        System.out.println(result);
    }

    public String solution(String source){
        StringBuilder convertedValue = new StringBuilder();

       /* for (char c : source.toCharArray()){
            if (Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            } else c = Character.toLowerCase(c);
            convertedValue += c;
        }*/

        for (char c : source.toCharArray()){
            if (c >= 65 && c <=95) convertedValue.append((char) (c + 32));
            else convertedValue.append((char) (c - 32));
        }

        return convertedValue.toString();
    }
}
