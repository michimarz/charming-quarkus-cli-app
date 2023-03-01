package marz.quarkus.cli;

import javax.enterprise.context.Dependent;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import com.oracle.svm.core.annotate.Inject;

@Dependent
public class Messenger {

    @Inject
    @ConfigProperty(name = "message")
    String message;

    public String message() {
        return this.message;
    }

}
