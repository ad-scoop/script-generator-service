package com.adscoop;

import com.adscoop.config.ScriptConfig;
import ratpack.guice.Guice;
import ratpack.server.RatpackServer;

/**
 * Created by thokle on 18/12/2016.
 */
public class StartScriptService {


    public static void main(String... args) throws  Exception{

        RatpackServer.start(ratpackServerSpec -> ratpackServerSpec.registry(Guice.registry(guiceSpec -> guiceSpec.module(ScriptConfig.class))).serverConfig( serverConfigBuilder ->  {
            serverConfigBuilder.port(5555);

        }));
    }

}
