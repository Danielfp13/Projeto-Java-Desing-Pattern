package gof;

import gof.facade.Facade;
import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.*;

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

        //Strategy

        Behavior common = new CommonBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robo robo = new Robo();
        robo.setBehavior(common);
        robo.toMove();
        robo.toMove();
        robo.setBehavior(aggressive);
        robo.toMove();
        robo.toMove();
        robo.toMove();
        robo.setBehavior(defensive);
        robo.toMove();

        //Facade
        Facade facade =  new Facade();
        facade.clientMigrate("Natalia", "37540-900");

    }
}