open module org.springframework.samples.petclinic {

    requires java.xml.bind;
    requires java.transaction;

    requires java.sql;
    requires java.validation;
    requires java.persistence;

    requires cache.api;

    requires spring.beans;
    requires spring.core;
    requires spring.context;
    requires spring.tx;
    requires spring.web;
    requires spring.webmvc;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires org.hibernate.validator;
}
