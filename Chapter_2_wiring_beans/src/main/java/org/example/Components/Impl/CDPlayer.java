package org.example.Components.Impl;

import org.example.Components.CompactDisc;
import org.example.Components.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.print.attribute.standard.Media;
import java.beans.BeanProperty;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd=null;

    private Set<CompactDisc> cds;

    @Autowired(required = false)
    private int name;

//    @Autowired
//    public CDPlayer(@Qualifier("NutanAlbum") CompactDisc cd1){
//        this.cd = cd1;
//    }

    @Autowired
    public CDPlayer(CompactDisc cd1){
        this.cd = cd1;
    }

//    @Autowired
//    public CDPlayer(Set<CompactDisc> cds){
//        this.cds=cds;
//    }

    public CDPlayer(){

    }

    @Override
    public void play() {
        cd.play();
//        System.out.println(cd==null);
//        System.out.println(cds.size());
    }
}
