import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        //O RegEx (a sequencia a ser procurada)
        // [a-z 0-9 \\- \\. \\_ ]+ qualquer caracter dentro dos colchetes no minimo 1 vez
        // @
        //([a-z 0-9 \\- \\_]+ \\.) ualquer caracter dentro dos colchetes no minimo 1 vez seguido de um ponto
        //[a-z]{2,4} caracter de "a" ate "z" no minimo 2 vezes ate 4 vezes
        Pattern myPattern = Pattern.compile("[a-z 0-9 \\- \\. \\_ ]+ @ ([a-z 0-9 \\- \\_]+ \\.)+ [a-z]{2,4}", Pattern.COMMENTS); 
        // A String a ser pesquisada
        Matcher myMatcher = myPattern.matcher("email.teste_23-5@gmail.asfsaf.gdsgsdg.com"); 
        //retorna true se for encontrado a sequencia regex na string a ser pesquisada
        System.out.println(myMatcher.matches()); 
    }
}
