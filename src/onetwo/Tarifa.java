package onetwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/tarifa
 * Pero has negotiated a Very Good data plan with his internet provider. The provider will let Pero use up X
 megabytes to surf the internet per month. Each megabyte that he doesn’t spend in that month gets transferred to the next month and can still be spent. Of course, Pero can only spend the megabytes he actually has.

 If we know how much megabytes Pero has spent in each of the first N
 months of using the plan, determine how many megabytes Pero will have available in the N+1
 month of using the plan.
 */

class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(sc.nextInt());
            n--;
        }
        System.out.println(tarifa(x, list));

    }

    private static int tarifa(int x, List<Integer> list) {
        int sum = 0;
        for (int temp: list) {
            sum += x - temp;
        }
        return sum + x;
    }
}
