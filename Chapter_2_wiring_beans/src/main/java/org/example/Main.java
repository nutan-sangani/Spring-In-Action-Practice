package org.example;

import org.example.Components.CompactDisc;
import org.example.Components.Impl.CDPlayer;
import org.example.Components.Impl.NutanAlbum;
import org.example.Components.MediaPlayer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@ComponentScan(basePackages = "org.example.Config")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        MediaPlayer mp = context.getBean(MediaPlayer.class);
        mp.play();
    }
}