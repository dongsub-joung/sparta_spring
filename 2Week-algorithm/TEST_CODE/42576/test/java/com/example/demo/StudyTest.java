package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    Test001 t1= new Test001();

    String[] participant1= {"leo", "kiki", "eden"};
    String[] completion1= {"eden", "kiki"};

    String[] participant2= {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completion2= {"josipa", "filipa", "marina", "nikola"};

    String[] participant3= {"mislav", "stanko", "mislav", "ana"};
    String[] completion3= {"stanko", "ana", "mislav"};


    @Test
    @DisplayName("완주하지 못한 선수 A")
    void init1(){
        assertAll(
                ()-> assertEquals("leo", t1.solution(participant1, completion1)),
                ()-> assertEquals("vinko", t1.solution(participant2, completion2)),
                ()-> assertEquals("mislav", t1.solution(participant3, completion3))
        );

    }

    @Test
    @DisplayName("완주하지 못한 선수 B")
    void init2(){
        assertAll(
                ()-> assertEquals("leo", t1.solutionB(participant1, completion1)),
                ()-> assertEquals("vinko", t1.solutionB(participant2, completion2)),
                ()-> assertEquals("mislav", t1.solutionB(participant3, completion3))
        );
    }
}
