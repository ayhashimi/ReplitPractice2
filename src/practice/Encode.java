package practice;

/*
Write a program  that creates a class named as Encode that has one method named as EncodeString
        (int offset, String word).
        This function would encode or encrypt the given word, for example
        if words is abc and offset is 2, so we get cdf as string in return
        create one instance array to store alphabets from a to z
*/



public class Encode
{
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l',
            'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public String encodeString(int offset, String word)
    {
        String tempString = "";
        int temp = 0;

        for (int i = 0; i < word.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (alphabet[j] ==  word.charAt(i))
                {
                    temp = j;

                    temp = temp + offset;

                    tempString = tempString + alphabet[temp];
                }
            }
        }

        return tempString;
    }

    public static void main(String [] args)
    {
        Encode runCipher = new Encode();
        System.out.println(runCipher.encodeString(2, "hello"));
    }
}
