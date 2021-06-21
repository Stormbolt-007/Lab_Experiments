package experiment2;

import static sun.util.locale.LocaleUtils.isEmpty;

public class StringProcessing {

    public static void main(String[] args)
    {
        String str = "In a conflict between the heart and the brain, follow your heart";
        String substr = "heart";

        int count = numOccurs(str, substr);
        System.out.println(count);
    }

    public static int numOccurs(String str, String substr)
        {
            if (isEmpty(str) || isEmpty(substr)) {
                return 0;
            }
            int index = 0, count = 0;
            while (true)
            {
                index = str.indexOf(substr, index);
                if (index != -1)
                {
                    count ++;
                    index += substr.length();
                }
                else {
                    break;
                }
            }
            return count;
        }
}
