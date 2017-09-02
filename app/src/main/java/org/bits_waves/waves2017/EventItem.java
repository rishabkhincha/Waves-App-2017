package org.bits_waves.waves2017;

/**
 * Created by aryan on 3/9/17.
 */

public class EventItem {
    private String head;
    private String desc;

    public EventItem(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
