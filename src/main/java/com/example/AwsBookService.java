/*
 * 
 * 
 */

package com.example;

import io.micronaut.context.annotation.Requires;
import jakarta.inject.Singleton;
import java.util.List;

/**
 *
 * @author graemerocher
 */
@Singleton
@Requires(env="lambda") 
public class AwsBookService 
    implements BookService {

    @Override
    public List<String> listTitles() {
        return List.of(
            "Learning Micronaut on AWS Lambda",
            "Understanding Micronaut on AWS Lambda"
        );
    }

}
