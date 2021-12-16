package com.ksrp.solidwastemanagement;

public class Headings {

    private String head,description;
    private boolean expandable;

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public Headings(String head, String description) {
        this.head = head;
        this.description = description;
        this.expandable = false;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Headings{" +
                "head='" + head + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
