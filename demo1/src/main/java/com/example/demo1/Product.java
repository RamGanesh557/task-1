package com.example.demo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    private Integer id;
    private double input1;
    private double input2;
    private char operation;
    private double result=-1.0;

    public Product() {
        this(0,0.0,0.0,'+');
    }

    public Product(Integer id, double input1, double input2, char operation) {
        this.id = id;
        this.input1 = input1;
        this.input2 = input2;
        this.operation = operation;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getInput1() {
        return input1;
    }

    public void setInput1(double input1) {
        this.input1 = input1;
    }

    public double getInput2() {
        return input2;
    }

    public void setInput2(double input2) {
        this.input2 = input2;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }


        @Override
        public String toString() {
            return "{" +
                    "result=" + result +
                    "}";
        }
    }


