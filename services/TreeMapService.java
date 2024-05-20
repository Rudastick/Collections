package pl.kurs.list.homework06.services;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapService {

    //1.Napisz metodę, która zwróci pierwszy  klucz przynajmniej równy lub większy zaraz po kluczu przekazanym w argumencie (jeżeli taki klucz nie istnieje, to zwróci najbliższy wyższy);
    public static <K> K returnHigherKey(TreeMap treeMap, K key) {
         return (K) treeMap.ceilingKey(key);
    }
    //2.Napisz metodę, która zwróci SortedMapę zawierającą część TreeMapy, gdzie klucze są większe lub równe kluczowi podanemu jako argument;
    public static <K,V>SortedMap<K,V> filterMapByKey(TreeMap treeMap, K key){
        return treeMap.tailMap(key);
    }
}
