package marz.quarkus.cli;

import javax.inject.Inject;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class CharmingCLIApp implements QuarkusApplication {

    @Inject
    Messenger supplier;


    @Override
    public int run(String... args) throws Exception {
        
        System.out.println("I have a meesage for you:");
        System.out.println(this.supplier.message());
        return 42;
    }
    
}
