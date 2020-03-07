import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Choose the exercise:\n" +
                    "1. Exercise 1\n" +
                    "2. Exercise 2\n" +
                    "3. Exercise 3\n" +
                    "4. Exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                DataSet dataSet = new DataSet(6);
                dataSet.add(3.5);
                double sum = dataSet.sum();
                System.out.println("The sum is: " + sum + "\n");
                dataSet.add(6.5);
                sum = dataSet.sum();
                System.out.println("The sum is: " + sum + "\n");
                double average = dataSet.average();
                System.out.println("The average is: " + average + "\n");
                dataSet.add(3);
                dataSet.add(12.1);
                double max = dataSet.maximum();
                System.out.println("The maximum number is: " + max + "\n");
                double min = dataSet.minimum();
                System.out.println("The minimum number is: " + min + "\n");
                dataSet.add(7.5);
                dataSet.add(8);
                dataSet.add(2.6);
            } else if (choice == 2) {
                Matrix matrix = new Matrix(4);
                System.out.println("The sum of diagonal is: " + matrix.sumMajorDiagonal());
                System.out.println("The transpose matrix is: ");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(matrix.transposeMatrix()[i][j]);
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }
            } else if (choice == 3) {
                MyStack stack = new MyStack();
                if(stack.isEmpty()) {
                    System.out.println("The stack is empty.");
                }
                stack.push(3);
                int index = stack.peek();
                System.out.println("The value on the top is: " + index);
                System.out.println("The size is: " + stack.getSize() + "\n");
                stack.push(18);
                index = stack.peek();
                System.out.println("The value on the top is: " + index);
                System.out.println("The size is: " + stack.getSize() + "\n");
                stack.push(77);
                index = stack.peek();
                System.out.println("The value on the top is: " + index);
                System.out.println("The size is: " + stack.getSize() + "\n");
                stack.pop();
                index = stack.peek();
                System.out.println("The value on the top is: " + index);
                System.out.println("The size is: " + stack.getSize() + "\n");
            } else if (choice == 4) {
                flag = false;
            } else {
                System.out.println("Your selection is invalid!");
            }
        } while(flag);
    }
}
