package com.string;

public class ReverseOwels {
    static void reverseOwels(String str)
    {
        char[]ch=str.toCharArray();
        int left=0;
        int right=str.length()-1;

        while (left<right)
        {

            if (!(ch[left] == 'A' || ch[left] == 'E' || ch[left] == 'I' || ch[left] == 'O' || ch[left] == 'U'
                    || ch[left] == 'a' || ch[left] == 'e' || ch[left] == 'i' || ch[left] == 'o' || ch[left] == 'u')) {

                left++;
            }
            else if (!(ch[right] == 'A' || ch[right] == 'E' || ch[right] == 'I' || ch[right] == 'O' || ch[right] == 'U'
                    || ch[right] == 'a' || ch[right] == 'e' || ch[right] == 'i' || ch[right] == 'o' || ch[right] == 'u')) {

                right--;
            }
            else {

                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
        }
        System.out.println(new String(ch));
    }
    public static void main(String[] args) {
        String str="prOgrAmmIng";
        reverseOwels(str);
    }
}
