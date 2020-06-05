package tree;

import java.util.Random;
import java.util.Scanner;

public class Main {

    BinaryTree bt;

    public static void main(String[] args) {
        Main app = new Main();
        app.run();
    }

    private void run() {
        bt = new BinaryTree();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Что делать с бинарным деревом?\n'd' - добавить элемент;\n's' - вывести дерево как строку\n'n' - добавить n-ное кол-во элементов;");
            char in = input.nextLine().charAt(0);
            if (in == 'd') {
                System.out.println("Число, кторое вы хотите добавить в бинарное дерево ");
                String str = input.nextLine();
                int in_ = Integer.parseInt(str);
                bt.add(in_);
            } else if (in == 's') {
                System.out.println(bt.toString());
            } else if (in == 'n') {
                System.out.println("Кол-во элементов для добавляения ");
                String str = input.nextLine();
                int in_ = Integer.parseInt(str);
                addToTree(in_);
            } else if (in == 'e') {
                break;
            }
        }
    }

    private void addToTree(int amount) {
        long from = System.currentTimeMillis();
        Random rnd = new Random();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            int value = rnd.nextInt(amount);
            bt.add(value);
            str.append(value).append(" ");
        }
        long to = System.currentTimeMillis();
        System.out.println("В бинарное дерево добавили "+amount+" чисел за "+(to-from)+" миллисекунд\n"+str);
    }
}