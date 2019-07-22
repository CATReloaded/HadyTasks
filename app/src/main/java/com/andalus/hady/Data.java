package com.andalus.hady;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {
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


    protected Data(Parcel in) {
        Name = in.readString();
        Size = in.readInt();
        Image = in.readInt();
        Desc = in.readString();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeInt(Size);
        dest.writeInt(Image);
        dest.writeString(Desc);
    }
}
