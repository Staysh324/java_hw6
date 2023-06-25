package works;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Computers pc1 = new Computers(15, "HP", "intel", 16, "silver");
        Computers pc2 = new Computers(17, "ASUS", "intel", 16, "black");
        Computers pc3 = new Computers(15, "MSI", "intel", 32, "white");
        Computers pc4 = new Computers(16, "HONOR", "ryzen", 8, "silver");
        Computers pc5 = new Computers(17, "MSI", "ryzen", 32, "black");
        Computers pc6 = new Computers(16, "ASUS", "intel", 8, "white");
        Computers pc7 = new Computers(13, "FARGUS", "helio", 16, "white");

        ArrayList<Computers> pcList = new ArrayList<>();
        pcList.add(pc1);
        pcList.add(pc2);
        pcList.add(pc3);
        pcList.add(pc4);
        pcList.add(pc5);
        pcList.add(pc6);
        pcList.add(pc7);

        Scanner scanner = new Scanner(System.in);
        System.out.println("спислк паоаметров для поиска: диагональ, марка, процессор, память, цвет");
        System.out.println("введите категорию и параметр через пробел (прим. 'память 16'): ");
        String input = scanner.nextLine();
        String[] spltstr = input.split(" ");

        if ("процессор".equals(spltstr[0].toLowerCase())) {
            for (Computers pc : pcList) {
                if (pc.getCPU().equals(spltstr[1].toLowerCase())) {
                    System.out.println(pc);
                }
            }
        }else if ("марка".equals(spltstr[0].toLowerCase())) {
            for (Computers pc : pcList) {
                if (pc.getMark().equals(spltstr[1].toUpperCase())) {
                    System.out.println(pc);
                }
            }
        }else if ("цвет".equals(spltstr[0].toLowerCase())) {
            for (Computers pc : pcList) {
                if (pc.getColor().equals(spltstr[1].toLowerCase())) {
                    System.out.println(pc);
                }
            }
        }else if ("память".equals(spltstr[0].toLowerCase())) {
            for (Computers pc : pcList) {
                if (pc.getRAM() == Integer.parseInt(spltstr[1].toLowerCase())) {
                    System.out.println(pc);
                }
            }
        }else if ("диагональ".equals(spltstr[0].toLowerCase())) {
            for (Computers pc : pcList) {
                if (pc.getDiagonal() == Integer.parseInt(spltstr[1].toLowerCase())) {
                    System.out.println(pc);
                }
            }
        }
    }
}

