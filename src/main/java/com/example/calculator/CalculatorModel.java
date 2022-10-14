package com.example.calculator;

public class CalculatorModel {

        private double argument1;

        private double argument2;

        private String operation;

        public String result = "";

        public void setArgument1(double  argument1) {
                this.argument1 = argument1;
        }

        public double getArgument1() {
                return argument1;
        }

        public void setArgument2(double  argument2) {
                this.argument2 = argument2;
        }

        public double getArgument2() {
                return argument2;
        }

        public void setResult(String result) {
                this.result = result;
        }

        public String getResult() {
                return this.result;
        }


        public void setOperation(String operation) {
                this.operation = operation;
        }

        public String getOperation() {
                return this.operation;
        }
}
