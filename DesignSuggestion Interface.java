package models;

public abstract class Template {
    protected String layout;

    public abstract void applyTemplate();

    public String getLayout() {
        return layout;
    }
}

