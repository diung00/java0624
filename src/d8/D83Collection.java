package d8;

import javax.lang.model.element.NestingKind;
import java.security.PublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.*;

public class D83Collection {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] newArr = new int[6];

        for (int i = 0; i < 5; i++) {
            newArr[i] = arr[i];
        }
        newArr[5] = 6;
        System.out.println(Arrays.toString(newArr));

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(i);

        }
        System.out.println(integerArrayList);

        List<Integer> intArrayList = new LinkedList<>();
        for (int i = 0; i < 30; i++) {
            intArrayList.add(i);
        }
        System.out.println(intArrayList);
        printEachElement(intArrayList);

        List<String> skillList = new ArrayList<>();
        skillList.add("java");
        skillList.add("python");
        skillList.add("kotlin");
        skillList.add("java");

        System.out.println(skillList);
        System.out.println(skillList.get(0));
        System.out.println(skillList.get(2));


        skillList.add(1, "Markdown");

        skillList.set(2, "git");
        System.out.println(skillList);

        System.out.println(skillList.contains("java"));
        System.out.println(skillList.contains("haahaa"));
        System.out.println(skillList.indexOf("kotlin"));

        Set<String> skillSet = new HashSet<>();
        skillSet.add("java");
        skillSet.add("python");
        skillSet.add("kotlin");
        skillSet.add("java");
        skillSet.add("nodejs");

        System.out.println(skillSet);
        System.out.println(skillSet.contains("nodejs"));


        List<String> setToList = new ArrayList<>(skillSet);
        System.out.println(setToList.get(0));
        for (int i = 0; i < 5; i++) {
            setToList.add("java");
            setToList.add("haha");
        }
        System.out.println(setToList);

        Set<String> listToSet = new HashSet<>(setToList);
        System.out.println(listToSet);

        Map<String, String> me = new HashMap<>();

        me.put("name", "Diung");
        me.put("age","25");
        me.put("email","diu@gmail.com");
        System.out.println("name");
        System.out.println("age");
        System.out.println(me);

        Map<Long, String> bus = new HashMap<>();
        bus.put(9003L, "abcdef");
        bus.put(8100L, "ghiklm");
        bus.put(8100L, "ghivmcn");
        System.out.println(bus.get(8100L));
        System.out.println(bus.get(8100L));
        System.out.println(bus.get(8100L));
        System.out.println(bus.get(8100L));
        System.out.println(bus.get(8100L));
        System.out.println(bus.get(1400L));

        Map<String, String> gitConfig = new HashMap<>();
        gitConfig.put("user.email","diu@gmail.com");
        gitConfig.put("user.name","Diung");

        gitConfig.putIfAbsent("user,name", "Diung");
        System.out.println(gitConfig.get("user.name"));
        System.out.println(gitConfig.getOrDefault(
                "user.online", "no"));

        if (gitConfig.containsKey("user.online")){
            System.out.println(gitConfig.get("user.online"));
        }
        System.out.println(gitConfig.remove("user.name"));
        System.out.println(gitConfig.containsKey("user.name"));
        System.out.println(gitConfig.remove("user.online"));

       Set<String> confKeyset = gitConfig.keySet();

       for (String key : confKeyset){
           System.out.println(key + ": " + gitConfig.get(key));
       }
      // gitConfig.entrySet()
        Set<Map.Entry<String, String>> entrySet = gitConfig.entrySet();
       for(Map.Entry<String, String> entry: entrySet){
           System.out.println();
           System.out.println("key " + entry.getKey());
           System.out.println("key " + entry.getValue());
       }
    //   Map<String, Person> peopleInfo = new HashMap<>();





    }

    public static void printEachElement(List<Integer> intList){}
}
