package com.patterns.builder;

public class TestCodeBuilder {
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person");

        cb.addField("name", "String");
        cb.addField("age", "int");

        System.out.println(cb);
    }
}
