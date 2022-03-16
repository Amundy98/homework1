import java.awt.*;

public class intellJ {
    public static void main(String[] args) {


        String myName = "Aisha";
        System.out.println(myName);

        char myGrade = 'A';
        System.out.println(myGrade);

        float myFloat = 8.08f;
        System.out.println(myFloat);

        boolean isAteen = false;
        System.out.println(isAteen);

        int myInt = 8;


        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        int x = 18;
        int y = 18;
        if (x == y) {
            System.out.println("both are equal");
        } else {
            System.out.println("not equal");
        }

        int favoriteWater = 3;
        switch (favoriteWater) {
            case 1:
                System.out.println("Deer Park");
                break;
            case 2:
                System.out.println("Pure life");
                break;
            case 3:
                System.out.println("Poland Spring");
                break;
            case 4:
                System.out.println("Dasani");
                break;
            case 5:
                System.out.println("Aquafina");
                break;
        }

        int i = 15;
        while (i < 20) {
            System.out.println(i);
            i++;
        }
        for (int c = 5; c <= 15; c = c + 2) {
            System.out.println(c);
        }
        String[] candy = {"sour patch", "snickers", "crunch", "peach rings"};
        System.out.println(candy[3]);

        String[] wordListOne = {"dog", "cat", "mouse", "covers"};
        String[] wordListTwo = {"black", "white", "purple", "white"};
        String[] wordListThree = {"tom", "jerry", "grey", "cousin"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int ran2 = (int) (Math.random() * twoLength);
        int ran3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[ran2] + " " + wordListThree[ran3];
        System.out.println("What we need is" + phrase);


    int beerNum = 99;
    String word = "bottles";
    while (beerNum > 0) {
        if (beerNum == 1) {
            word = "bottle";
        }
        System.out.println(beerNum + " " + word + " of beer on the wall");
        System.out.println(beerNum + " " + word + " of beer.");
        System.out.println("Take one down.");
        System.out.println("Pass it around.");
        beerNum = beerNum - 1;

        if (beerNum > 0) {
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println("***************************");
        } else {
            System.out.println("No more bottles of beer on the wall");
        }
    }
    }
}



class Main {


    static void myLuckyNum() {
        System.out.println(7);
    }

    public static void main(String[] args) {
        myLuckyNum();

    }

}

