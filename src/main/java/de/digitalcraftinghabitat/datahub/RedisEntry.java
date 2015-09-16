package de.digitalcraftinghabitat.datahub;

/**
 * Created by christopher on 16/09/15.
 */
public class RedisEntry {

    private String key;
    private String value;

    public RedisEntry() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
