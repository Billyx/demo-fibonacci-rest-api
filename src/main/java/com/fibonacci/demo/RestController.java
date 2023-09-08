package com.fibonacci.demo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.lang.reflect.Parameter;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/fibonacci/{n}")
    @ApiOperation(value = "Fibonacci value according to index number", nickname = "Fibonacci")
    public int getFibonacci(@ApiParam(value = "Number that represents the position according to Fibonacci sequence", required = true)
                            @PathVariable int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
