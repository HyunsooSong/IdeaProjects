import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * for-loop
 * - original
 * - for-each
 * while
 */
public class ForLoop {
    public void explainForLoop(){
        String[] strings = {"Hello", "this", "is", "Alvin", "Hello", "this", "is", "Alvin","Hello", "this", "is", "Alvin","Hello", "this", "is", "Alvin"};
        for(int i = 0; i < strings.length; i++ ){
            System.out.println(strings[i]);
        }
    }
    public void explainForLoopWithArrayList(){
        String[] strings = {"Hello", "this", "is", "Alvin"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        arrayList.add("!");
        for(int i = 0; i < arrayList.size(); i++ ){
            System.out.println((i + 1) + ". " + arrayList.get(i));
        }
        for (String targetString : arrayList) {
            System.out.println(targetString);
        }
    }
    public void explainWhile(){
        int i = 0;
        String[] strings = {"Hello", "this", "is", "Alvin"};
        while(i < strings.length){
            System.out.println(strings[i]);
            i++;
        }
    }
}
