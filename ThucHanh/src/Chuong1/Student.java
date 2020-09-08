/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong1;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Student implements Comparable<Student>// cai lại method compareTo
{

    private final String code;
    private final double score;

    public Student(String code, double score) {
        this.code = code;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "(" + code + "," + score + ")";
    }

    @Override
    public boolean equals(Object other) {
        Student otherStu = (Student) other;
        return code.equals(otherStu.code);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.code);
        return hash;
    }

    @Override
    public int compareTo(Student t) {
         return code.compareTo(t.code);
    }

}
