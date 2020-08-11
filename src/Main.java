import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How much different values this technique has? ");
        int numberValues = sc.nextInt();
        double[] valuesTechnique = new double[numberValues];
        System.out.println("Insert the values of the technique: ");
        for (int i = 0; i < numberValues; i ++) {
            valuesTechnique[i] = sc.nextInt();
        }
        System.out.println("Insert the value's attributes of the character, in sequence: ");
        double[] valuesCharacter = new double[numberValues];
        for (int i = 0; i < numberValues; i ++) {
            valuesCharacter[i] = sc.nextInt();
        }

        System.out.println("Insert the value of the Wisdom of your character: ");
        double wisdom = sc.nextInt();

        double hours = 0;
        double accumulatedPoints = 0;

        for (int i = 0; i < numberValues; i ++) {
            hours = hours + valuesTechnique[i] / valuesCharacter[i] * valuesTechnique[i] / 50;
            accumulatedPoints = accumulatedPoints + valuesTechnique[i];
        }

        double scenes = accumulatedPoints / wisdom * accumulatedPoints / 50;

        System.out.println(hours);
        System.out.println(scenes);

        sc.close();

    }
}
