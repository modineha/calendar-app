package org.com.zeta.model;

public class Organization
{
    private String id;
    private String name;

    public Organization(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName()
    {
        return name;
    }
}
