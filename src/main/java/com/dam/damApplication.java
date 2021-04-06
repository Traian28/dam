package com.dam;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class damApplication extends Application<damConfiguration> {

    public static void main(final String[] args) throws Exception {
        new damApplication().run(args);
    }

    @Override
    public String getName() {
        return "dam";
    }

    @Override
    public void initialize(final Bootstrap<damConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final damConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
