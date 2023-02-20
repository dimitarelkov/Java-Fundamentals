package Exercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstCardsSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer ::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondCardsSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer ::parseInt)
                .collect(Collectors.toList());

        int size = firstCardsSet.size();

        int sum = 0;

        while (firstCardsSet.size() > 0 && secondCardsSet.size() > 0) {

                int currentFirstCard = firstCardsSet.get(0);
                int currentSecondCard = secondCardsSet.get(0);

                if (currentFirstCard > currentSecondCard) {
                    firstCardsSet.add(firstCardsSet.size(), currentFirstCard);
                    firstCardsSet.add(currentSecondCard);
                    secondCardsSet.remove(0);
                    firstCardsSet.remove(0);

                } else if (currentFirstCard < currentSecondCard) {
                    secondCardsSet.add(secondCardsSet.size(), currentSecondCard);
                    secondCardsSet.add(currentFirstCard);
                    firstCardsSet.remove(0);
                    secondCardsSet.remove(0);

                } else {
                    firstCardsSet.remove(0);
                    secondCardsSet.remove(0);
                }


            }


        if (firstCardsSet.size() > 0) {
            for (int item:firstCardsSet) {
                sum += item;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (int item:secondCardsSet) {
                sum += item;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
        
    }
}
