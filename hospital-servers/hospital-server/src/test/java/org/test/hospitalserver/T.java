package org.test.hospitalserver;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.core.ColumnOrderDependent;

public class T {
    public static void main(String[] args) {
        byte b = 'a'+1;
        System.out.println(b);
        char c= 'a'+'b'+'d';
        System.out.println(c);
        System.out.println(b);
    }
}

interface Corn{
    
}
class Mize implements Corn {
    
    int size;
    
    void method(){
        System.out.println(size);
    }
    
}