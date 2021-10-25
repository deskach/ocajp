package com.patterns.builder;

import java.util.ArrayList;
import java.util.List;

class AbstractClassField {
    public String name;
    public String dataType;

    public AbstractClassField(String name, String dataType) {
        this.name = name;
        this.dataType = dataType;
    }
}

class AbstractClass {
    public String className;
    public List<AbstractClassField> fields = new ArrayList<>();
}

public class CodeBuilder {
    AbstractClass theClass = new AbstractClass();

    public CodeBuilder(String className) {
        theClass.className = className;
    }

    public CodeBuilder addField(String name, String type) {
        theClass.fields.add(new AbstractClassField(name, type));

        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("public class %s%n", theClass.className));
        sb.append(String.format("{%n"));
        for (AbstractClassField field: theClass.fields) {
            sb.append(String.format("  public %s %s;%n", field.dataType, field.name));
        }
        sb.append("}");

        return sb.toString();
    }
}
