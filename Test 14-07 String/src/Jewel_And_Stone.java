public class Jewel_And_Stone {
    public static int numJewelsInStones(String jewels, String stones)
    {
        char[]ch1=jewels.toCharArray();
        char[]ch2=stones.toCharArray();
        int count=0;
        for(int i=0;i<jewels.length();i++)
        {
            for(int j=0;j<stones.length();j++)
            {
                if(ch1[i]==ch2[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String jewel="aA";
        String stone="aAAbbbbs";
        System.out.println("Count: "+numJewelsInStones(jewel,stone));
    }
}
