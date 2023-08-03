package homework19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Translations> map = new Hashtable<>();
        map.put("собака", new Translations("dog", "犬", "hund"));
        map.put("кіт", new Translations("cat", "猫", "katze"));
        map.put("кінь", new Translations("horse", "馬", "pferd"));
        map.put("віслюк", new Translations("donkey", "お尻", "arsch"));
        map.put("корова", new Translations("cow", "牛", "kuh"));
        map.put("ховрах", new Translations("gopher", "ホリネズミ", "gopher"));
        map.put("тхір", new Translations("ferret", "フェレット", "frettchen"));
        map.put("свиня", new Translations("pig", "豚", "schwein"));
        map.put("курка", new Translations("chicken", "鶏", "huhn"));
        map.put("гусак", new Translations("goose", "ガチョウ", "gans"));

        System.out.println(map.get("гусак").toString());
    }
}
