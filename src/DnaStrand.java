public class DnaStrand  {
    public static String makeComplement(String dna) {
        /*
        A mit T ersetzen
        T mit A ersetzen
        C mit G ersetzen
        G mit C ersetzen
         */

        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'A') {
                chars[i] = 'T';
            } else if(chars[i] == 'T') {
                chars[i] = 'A';
            } else if(chars[i] == 'C') {
                chars[i] = 'G';
            } else if(chars[i] == 'G') {
                chars[i] = 'C';
            }
        }
        dna = String.valueOf(chars);
        return dna;
    }


    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
    }
}
