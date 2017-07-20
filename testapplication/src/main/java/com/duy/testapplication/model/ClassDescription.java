package com.duy.testapplication.model;

import com.duy.testapplication.autocomplete.JavaUtil;

import java.util.ArrayList;

/**
 * Created by Duy on 20-Jul-17.
 */

public class ClassDescription implements Description {
    private String type;
    private String name, simpleName, className, extend, packageName;
    private long lastUsed = 0;

    private ArrayList<ClassConstructor> constructors;
    private ArrayList<FieldDescription> fields;
    private ArrayList<MethodDescription> methods;

    public ClassDescription(String simpleName, String className, String extend, long lastUsed) {
        this.type = "class";
        this.name = simpleName;
        this.simpleName = simpleName;
        this.className = className;
        this.extend = extend;
        packageName = JavaUtil.getPackageName(className);
        this.lastUsed = 0;

        constructors = new ArrayList<>();
        fields = new ArrayList<>();
        methods = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSuperClass() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public long getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(long lastUsed) {
        this.lastUsed = lastUsed;
    }

    public ArrayList<ClassConstructor> getConstructors() {
        return constructors;
    }

    public void setConstructors(ArrayList<ClassConstructor> constructors) {
        this.constructors = constructors;
    }

    public ArrayList<FieldDescription> getFields() {
        return fields;
    }


    public void addConstructor(ClassConstructor classConstructor) {
        this.constructors.add(classConstructor);
    }

    public void addField(FieldDescription fieldDescription) {
        fields.add(fieldDescription);
    }

    public void addMethod(MethodDescription methodDescription) {
        methods.add(methodDescription);
    }

    public ArrayList<MethodDescription> getMethods() {
        return methods;
    }
}
