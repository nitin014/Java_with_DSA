
/*
 * Given a route containing 4 directions (East, West,North,South). Find the shortest route to reach destination.
 * 
 * subString vs subSequence
 * substring() returns a String, while                                  |  subSequence() returns a CharSequence.
    Defined in the String class.                                        |  Defined in the CharSequence interface.
    Returns a new string that is a substring of the original string.    |  Returns a new CharSequence that is a subsequence of the original sequence.      
    Operates specifically on strings.                                   |  Can operate on any class that implements the CharSequence interface, not just String.
 */

public class javaBasics17Strings1 
{

    //find the shortest route to reach destination
    public static float findShortestRoute(String route)
    {
        int x= 0,y= 0;
        for(int i=0; i<route.length(); i++)
        {
            char dir = route.charAt(i);
            //South
            if(dir == 'S')
            {
                y--;
            }
            //North
            else if(dir == 'N')
            {
                y++;
            }
            //West
            else if(dir == 'W')
            {
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    //*Substring
    public static String Substring(String str, int start, int end)
    {
        String sbString = "";
        for(int i=start; i<end; i++)
        {
            sbString += str.charAt(i);
        }
        return sbString;
    }

    //* convert each the first letter of each word to upper case 
    //toUpperCase() and toLowerCase()
    public static String toUpperCase(String line)  // O(n)
    {
        StringBuilder sb = new StringBuilder("");
        //take first of string and convet to upper case
        char ch = Character.toUpperCase(line.charAt(0));
        sb.append(ch);
        for(int i=1; i<line.length(); i++)
        {
            if(line.charAt(i) == ' ' && i < line.length()-1)
            {
                sb.append(line.charAt(i));
                i++;
                sb.append(Character.toUpperCase(line.charAt(i)));
            }
            else{
                sb.append(line.charAt(i));
            }
        }
        return sb.toString();
    }
    

    /*            String compression
        input : aaabbcccddzxx     output : a3 b2 c3 d2 z x2
        input: zyx                output : zyx
        try from stringBuilder(practice)
    */
    public static String getCompression(String str) //O(n)
    {
        String newStr = "";
        for(int i = 0; i < str.length(); i++)
        {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;    
            }
            newStr += str.charAt(i);
            if(count > 1)
            {
                //newStr += " ";
                newStr += count.toString();
                newStr += " ";
            }
           else{
                newStr += " ";
            }
        }
        return newStr;
    }


    public static void main(String[] args) {
        String route = "WNEENESENNN";
        System.out.println("ShortestPath = "+findShortestRoute(route));

        //SubString
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5)); // directMethod
        System.out.println("Substring = "+Substring(str, 1, 5));

    /*print largest string (lexiographically - judging on basis of characters in string)
    comparison is based on the Unicode value of each character in the strings.
    * s1.compareTo(s2)
    * s1.comparetoIgnoreCase(s2)
    returns :
               An int value: 0 if s1 and s2 are equal
               < 0 if s1<=2
               > 0 if s1>s2
    */

        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++)
        {
            if(largest.compareTo(fruits[i]) < 0 )
            {
                largest = fruits[i];
            }
        }
        System.out.println("largest String = "+largest);
        //Integer a=10;
        //System.out.println(a.toString());

        //StringBuilder line = new StringBuilder("Hi, I am learning string in java programming language");
        String line ="Hi, I am learning string in java programming language";
        System.out.println(toUpperCase(line));

        String comString = "PAAABBBBBRCCDDDEEZZZXXXX";
        System.out.println(getCompression(" "+comString));
    }
}
