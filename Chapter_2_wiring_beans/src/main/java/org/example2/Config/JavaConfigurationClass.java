package org.example2.Config;

import org.example.Components.CompactDisc;
import org.example.Components.Impl.CDPlayer;
import org.example.Components.Impl.SgtPeppers;
import org.example.Components.MediaPlayer;
import org.example2.Component.SpecialOverRidedCD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigurationClass {
    @Bean
    MediaPlayer mediaPlayer(CompactDisc cd){
        MediaPlayer mp = new CDPlayer(cd);
        return mp;
    }

    @Bean
    CompactDisc cd(){
        return new SpecialOverRidedCD();
    }

    @Bean(autowireCandidate = false)
    CompactDisc cdS(){
        return new SpecialOverRidedCD();
    }
}
