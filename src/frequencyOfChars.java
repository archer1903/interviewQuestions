public class frequencyOfChars {
    public static void main(String[] args) {

        //Soru1  :
        //Karakterlerin sıklığını bulabilen bir metod yazar misiniz ?
        //
        //Ör: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String str="AAABBCDD";

        FrequencyOfChars(str);
    }

    private static void FrequencyOfChars(String str) {

        String[] str2=str.split("");
        String str3="";
        int count=0;

        for (int i = 0; i <=str.length()-1 ; i++) {
            count=i+1-str.indexOf(str.charAt(i));

            if(i<str.length()-1){
                if(!str2[i].equals(str2[i+1]))
                    str3+=str2[i]+(count);

            }else if(i<=str.length()-1) {
                str3+=str2[i]+(count);
            }
        }
        System.out.println(str3);
    }
}
