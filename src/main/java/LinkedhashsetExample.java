import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashsetExample {
    public static void main(String[] args){
        LinkedHashSet<String> song=new LinkedHashSet<>();
        song.add("tamil");
        song.add("english");
        song.add("telugu");
        song.add("hindi");

        System.out.println("Song added to plylist:"+song);
        song.remove("tamil");
        System.out.println("Remove song:"+song);
        System.out.println("contains hindi song:"+song.contains("hindi"));
        System.out.println("total no of song in playlist:"+song.size());
        System.out.println("Is the playlist empty:"+song.isEmpty());
        Iterator<String> itr= song.iterator();
        System.out.println("Songs:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
