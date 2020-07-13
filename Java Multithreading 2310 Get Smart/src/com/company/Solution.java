package com.company;

public class Solution {
    private String name;

    Solution(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void sout() {
        new Solution("sout") {
            void printName() {
                System.out.println(getName());//А если без расширения метода? то: super.getName() !!!
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Solution("main").sout();
    }
}

