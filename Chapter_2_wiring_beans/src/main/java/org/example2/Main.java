package org.example2;

import org.example.Components.MediaPlayer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.example2.Config")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(org.example2.Main.class);
        MediaPlayer mp = context.getBean(MediaPlayer.class);
        mp.play();
    }
}
