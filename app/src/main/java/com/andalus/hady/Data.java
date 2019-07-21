package com.andalus.hady;

public class Data {
    private  String Name;
    private  int Size;
    private  int Image;
    private String Desc;

    public  Data(String name,int size,int image,String desc)
    {
        Name=name;
        Size=size;
        Image=image;
        Desc=desc;

    }


    public int getImage() {
        return Image;
    }

    public int getSize() {
        return Size;
    }

    public String getName() {
        return Name;
    }

    public String getDesc() { return Desc; }
}
