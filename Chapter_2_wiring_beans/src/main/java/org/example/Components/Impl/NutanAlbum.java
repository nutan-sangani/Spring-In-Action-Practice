package org.example.Components.Impl;

import org.example.Components.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.naming.Name;
import java.util.prefs.Preferences;

@Component("Nutan")
@Order(2)
public class NutanAlbum implements CompactDisc {
    @Override
    public void play() {
        System.out.println("Playing nutan ka album");
    }
}
