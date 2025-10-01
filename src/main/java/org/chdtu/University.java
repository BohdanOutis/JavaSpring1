package org.chdtu;

public class University {
    Group group;
    String name;

    public University(){

    }
    public void setGroup(Group group){
        this.group = group;
    }

    public void groupName(){
        this.group.getName();
    }

    public void setName(String name){
        this.name = name;
    }
}
