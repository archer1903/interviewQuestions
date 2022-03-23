public class frequencyOfCharsNew {
    public static void main(String[] args) {

        //Soru1  :
        //Karakterlerin sıklığını bulabilen bir metod yazar misiniz ?
        //
        //Ör: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String str = "AAABBCDD";

        System.out.println(FrequencyOfChars(str));
    }

    public static String FrequencyOfChars(String str) {

        String str3="";

        for (int i = 0; i <= Byte.MAX_VALUE; i++) {
            int index=0;
            for (int j = 0; j < str.length(); j++) {
                if ( i  == str.charAt(j)) {
                    index++;
                }
            }
            if(index!=0)
            str3 +=Character.toString(i)+ index;
        }
       return str3;
    }
}
