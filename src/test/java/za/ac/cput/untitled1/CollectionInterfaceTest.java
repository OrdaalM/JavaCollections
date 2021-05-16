package za.ac.cput.untitled1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CollectionInterfaceTest {


    Employer emply1 = new Employer ("Software Developer", "15AB", "Ordaal", "Mthethwa", 256452);
    Employer emply2= new Employer ("System Analyst", "15AC", "James", "May", 255242);
    Employer emply3 = new Employer ("Business Analyst", "15AD", "Chris", "Gerald", 256425);
    Employer emply4 = new Employer ("Web Developer", "15AG", "Mlambo", "Nyanti", 2564352);
    Employer emply5 = new Employer ("Software Engineering", "15AF", "Asanda", "Meme", 2564582);


    List<Employer> list;
    HashSet<Employer> set;
    Map<String, Employer> map;
    Collection <Employer>Collection;

    @BeforeEach
    void setUp() {

        list = new ArrayList<>();
        list.add(emply1);
        list.add(emply2);


        set = new HashSet<>();
        set.add(emply1);
        set.add(emply2);
        set.add(emply3);


        map = new HashMap<>();
        map.put("", emply1);
        map.put("", emply2);
        map.put("", emply3);
    }


    @Test
    public void TestMyList()
    {
        list.remove(emply1);
        assert(list.contains(emply1));

        list.add(emply2);
        assert(list.contains(emply2));

        list.contains(emply1);
        assert (list.contains(emply1));


    }

    @Test
    public void TestMySet()
    {
        set.add(emply3);
        assert(list.contains(emply3));

        set.remove(emply4);
        assert(set.contains(emply4));

        set.contains(emply3);
        assert (list.contains(emply3));
    }

    @Test
    public void TestMyMap()
    {
        map.put("", emply5);

        assert(map.containsKey(emply5));

        map.remove(emply5);
        assert(map.containsValue(emply5));

        map.get(emply5);
        assert(map.containsKey(emply5));
    }
}

