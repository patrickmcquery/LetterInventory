public class Main {
    public static void main(String[] args)
    {
        LetterInventory inventory1 = new LetterInventory("George W. Bush");

        LetterInventory inventory2 = new LetterInventory("Hillary Clinton");

        System.out.println("First inventory is \"George W. Bush\": " + inventory1 + "\nSecond inventory is \"Hillary Clinton\": " + inventory2);

        LetterInventory sum = inventory1.add(inventory2);

        System.out.println("Added together they are: " + sum);

        LetterInventory inventory3 = new LetterInventory("aaaabbbbcccc");

        LetterInventory inventory4 = new LetterInventory("aaabbbccc");

        System.out.println("Third inventory is \"aaaabbbbcccc\": " + inventory3 + "\nFourth inventory is \"aaabbbccc\": " + inventory4);

        LetterInventory diff = inventory3.subtract(inventory4);

        System.out.println("Inventory 3 - Inventory 4 = " + diff);
    }
}