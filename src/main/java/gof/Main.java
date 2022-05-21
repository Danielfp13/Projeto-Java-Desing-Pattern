package gof;

import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {
        //Teste Realacionado ao Desing Pattern Singleton
        SingletonLazy lazy1 = SingletonLazy.getInstance();
        System.out.println(lazy1);
        SingletonLazy lazy2 = SingletonLazy.getInstance();
        System.out.println(lazy2);


        SingletonEager eager1 = SingletonEager.getInstance();
        System.out.println(eager1);
        SingletonEager eager2 = SingletonEager.getInstance();
        System.out.println(eager2);

        SingletonLazyHolder lazyHolder1 = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder1);
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder2);
    }
}