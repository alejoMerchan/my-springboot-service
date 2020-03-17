module com.fun.springexample.rest {

    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires spring.aop;
    requires spring.web;
    requires spring.expression;

    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires com.fun.springexample.lib;

    exports com.fun.springexample.rest;
    exports com.fun.springexample.rest.resources;

    opens com.fun.springexample.rest;
    opens com.fun.springexample.rest.resources;


}