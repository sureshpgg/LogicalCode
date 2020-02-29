import java.util.Scanner;

public class Test {
    static int count = 1;
    static String output;

    public static void main(String[] args) {

        while (true) {
            count = 1;
            output=null;
            System.out.println("ENTER VALUE TO TAKE AS CHARACTER : ");
            output = function(new Scanner(System.in).nextLine());
            System.out.println("RESULT  >>>  " + output);
        }

    }

    static String function(String str) {

        char[] ch = str.toCharArray();
        if (ch.length<=2)return output="Input should be minimum 3 characters !!!\n\n";
        for (int lastcharindex = ch.length-1; lastcharindex >0; lastcharindex--) {

            for (int comparecharindex = 0; comparecharindex < lastcharindex; comparecharindex++) {

                if (ch[lastcharindex] == ch[comparecharindex]) {
                    count++;
                    if (count == 3) {
                        output = "CHARACTER - " + ch[lastcharindex]+"\n\n";
                        break;
                    }else
                        output = "NO SUCH CHARACTER \n\n";
                }
            }

            if ((count==3)||((count < 3) && lastcharindex == 1)) {
                    break;
            }

            count = 1;
        }
        return output;
    }
}
