package com.iluwatar.microservice.dto;

public class Package {
    private Float length;
    private Float width;
    private Float height;
    private Boolean isFragile;
    public Size getSize(){
        if(length<10 && width<10 && height<10)
            return Size.S;
        if(length<20 && width<20 && height<20)
            return Size.M;
        if(length<30 && width<30 && height<30)
            return Size.L;
        else
            return Size.XL;
    }
}
