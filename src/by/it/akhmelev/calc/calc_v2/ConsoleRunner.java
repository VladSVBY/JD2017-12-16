package by.it.akhmelev.calc.calc_v2;

import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line;

        Parser parser=new Parser();
        Printer printer=new Printer();
        while (!(line=sc.nextLine()).equals("end")){
            if (line.toLowerCase().contains("printvar"))
            {
                System.out.println(VarsMap.printvar());
                continue;
            }

            Var result;
            try {
                result = parser.calc(line.trim());
                printer.print(result);
            } catch (CalcException e) {
                System.out.println("ERROR: "+e.getMessage());
            }
        }
    }
}
