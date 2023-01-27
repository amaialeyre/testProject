package lesson9task1;

import java.util.ArrayList;
import java.util.List;

public class OwnMapImplementation implements OwnMap {
    private List<KeyValuePair> map;

    public OwnMapImplementation() {
        map = new ArrayList<>();
    }

    public boolean put(String key, String value) {
        KeyValuePair pair = getPair(key);
        if (pair == null) {
            map.add(new KeyValuePair(key, value));
            return true;
        }
        pair.value = value;
        return false;
    }

    public boolean containsKey(String key) {
        return getPair(key) != null;
    }

    public boolean containsValue(Object value) {
        for (KeyValuePair pair : map) {
            if (pair.value.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public String remove(String key) {
        KeyValuePair pair = getPair(key);
        if (pair == null) {
            return null;
        }
        map.remove(pair);
        return pair.value;
    }

    public String get(String key) {
        KeyValuePair pair = getPair(key);
        if (pair == null) {
            return null;
        }
        return pair.value;
    }

    private KeyValuePair getPair(String key) {
        for (KeyValuePair pair : map) {
            if (pair.key.equals(key)) {
                return pair;
            }
        }
        return null;
    }

    private class KeyValuePair {
        String key;
        String value;

        public KeyValuePair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
