public class ProfNames
{
  public int countNames(String[][]nameArray, String lastName)
  {
    int count = 0;
for (int r = 0; r < nameArray.length; r++) {
      for (int c = 0; c < nameArray[0].length; c++){
           if (nameArray[r][c].substring(0,nameArray[r][c].indexOf(",")).equals(lastName) )
               count++;
      }
}
return count;
  }
}