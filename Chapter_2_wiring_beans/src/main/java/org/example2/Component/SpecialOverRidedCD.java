package org.example2.Component;

import org.example.Components.Impl.SgtPeppers;

public class SpecialOverRidedCD extends SgtPeppers {
    @Override
    public void play(){
        System.out.println("This is the overRided method");
    }
}
