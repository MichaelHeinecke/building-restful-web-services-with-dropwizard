package com.github.mheinecke.dropwizarddemo;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DemoApplication extends Application<DemoConfiguration> {
    public static void main(String[] args) throws Exception {
        new DemoApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-demo";
    }

    @Override
    public void initialize(Bootstrap<DemoConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(DemoConfiguration configuration,
                    Environment environment) {
        // nothing to do yet
    }
}
