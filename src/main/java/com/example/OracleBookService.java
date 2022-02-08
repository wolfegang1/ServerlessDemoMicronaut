/*
 * 
 * 
 */

package com.example;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import jakarta.inject.Singleton;
import java.util.List;

/**
 *
 * @author graemerocher
 */
@Singleton
@Requires(env=Environment.ORACLE_CLOUD) 
public class OracleBookService
    implements BookService {

    @Override
    public List<String> listTitles() {
        return List.of(
            "Learning Micronaut on Oracle Cloud",
            "Understanding Micronaut on Oracle Cloud"
        );
    }

}
