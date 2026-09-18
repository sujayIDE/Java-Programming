package string;

public class CountFrequencyOfCharacter {
  static void countFrequency(String str)
  {
      char[] ch=str.toCharArray();
      boolean[] visited=new boolean[ch.length];
      for(int i=0;i<ch.length;i++)
      {
          if(visited[i])
          {
              continue;
          }
          int count=0;
          for(int j=0;j<ch.length;j++)
          {
              if(ch[i]==ch[j])
              {
                  count++;
                  visited[j]=true;
              }
          }
          System.out.println(ch[i]+"-->"+count);
      }
  }
    public static void main(String[] args) {
        String str="banana";
        countFrequency(str);
    }
}
