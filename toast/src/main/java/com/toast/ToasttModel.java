package com.toast;

public class ToasttModel
{
    String Message;
    String name;

    public  ToasttModel(String message,String name)
    {
        this.name = name;
        this.Message = message;
    }
    public  ToasttModel(String name)
    {
        this.name = name;
    }
    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
