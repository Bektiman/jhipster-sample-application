package com.bektiman.simpleapp;

import com.bektiman.simpleapp.config.AsyncSyncConfiguration;
import com.bektiman.simpleapp.config.EmbeddedSQL;
import com.bektiman.simpleapp.config.JacksonConfiguration;
import com.bektiman.simpleapp.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { SampleApplicationApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class }
)
@EmbeddedSQL
public @interface IntegrationTest {
}
