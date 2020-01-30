package com.samplemaven.restservice;

import java.util.Objects;

public class TestModel {
    String name;
    Integer order;

    public TestModel() {
    }

    public TestModel(String name, Integer order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return this.order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public TestModel name(String name) {
        this.name = name;
        return this;
    }

    public TestModel order(Integer order) {
        this.order = order;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TestModel)) {
            return false;
        }
        TestModel testModel = (TestModel) o;
        return Objects.equals(name, testModel.name) && Objects.equals(order, testModel.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, order);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", order='" + getOrder() + "'" +
            "}";
    }
}