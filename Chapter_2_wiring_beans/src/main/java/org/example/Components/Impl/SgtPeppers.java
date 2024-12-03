package org.example.Components.Impl;

import org.example.Components.CompactDisc;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("NutanAlbum")
@Order(1)
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("Playing : "+"Nutan ka song"+" ");
    }
}
