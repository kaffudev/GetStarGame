public class SentenceUtils {

    private final static String SENTENCE = "Jeśli przebywasz ciągle tymi samymi ludźmi" +

            "to stają się oni końcu częścią twojego życia" +

            "skoro są już częścią twojego życia to chcą je zmieniać" +

            "bo ludziom wydaje się" +

            "że wiedzą jak powinno wyglądać twoje życie" +

            "nikt jednak nie wie jak powinien przeżyć własne ";

    public static String[] getWords(){
        return SENTENCE.split(" ");
    }
}
