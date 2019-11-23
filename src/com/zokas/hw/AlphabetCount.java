package HW4;

public class AlphabetCount {
    public static void main(String[] args) {

     String symbol ="a";
     String mySymbol =symbol.trim().toUpperCase();

     Alphabet mySymbolFromEnum = Alphabet.valueOf(mySymbol);
     int letterPosotion =mySymbolFromEnum.getLetterPosition();
        System.out.println(letterPosotion);

            }
        }



