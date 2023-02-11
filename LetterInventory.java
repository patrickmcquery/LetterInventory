import java.util.ArrayList;
import java.util.Collections;


public class LetterInventory
{
    private int[] charCount;
    private int offset = 97;
    private boolean empty = true;
    
    public LetterInventory(String data)
    {
        charCount = new int[26];
        data = data.toLowerCase();
        for(int i = 0; i < data.length(); i++)
        {
            char temp = data.charAt(i);
            if(temp > 96 && (int)temp < 123)
            {
                charCount[temp - offset]++;
                empty = false;
            }
        }
    }
    public int get(char letter)
    {
        return charCount[letter - offset];
    }
    public void set(char letter, int value)
    {
        charCount[letter - offset] = value;
    }
    public int size()
    {
        int count = 0;
        for(int i = 0; i < 26; i++)
        {
            int charVal = i + offset;
            char iChar = (char)charVal;
            count += this.get(iChar);
        }
        return count;
    }

    public boolean isEmpty()
    {
        return empty;
    }

    public String toString()
    {
        String temp = "[";
        for(int i = 0; i < 26; i++)
        {
            int charVal = i + offset;
            char iChar = (char)charVal;
            for(int j = 0; j < this.get(iChar); j++)
            {
                temp += iChar;
            }
        }
        return temp + "]";
    }

    public LetterInventory add(LetterInventory other)
    {
        String temp = "";
        for(int i = 0; i < 26; i++)
        {
            int charVal = i + offset;
            char iChar = (char)charVal;
            for(int j = 0; j < this.get(iChar); j++)
            {
                temp += iChar;
            }
            for(int j = 0; j < other.get(iChar); j++)
            {
                temp += iChar;
            }
        }
        return new LetterInventory(temp);
    }

    public LetterInventory subtract(LetterInventory other)
    {
        LetterInventory temp = new LetterInventory("");
        for(int i = 0; i < 26; i++)
        {
            int charVal = i + offset;
            char iChar = (char)charVal;
            if(this.get(iChar) - other.get(iChar) < 0)
            {
                return null;
            }
            temp.set(iChar, this.get(iChar) - other.get(iChar));
        }
        return temp;
    }
}