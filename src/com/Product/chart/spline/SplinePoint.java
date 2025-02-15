/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Product.GUI.chart.spline;
public class SplinePoint {

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public SplinePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public SplinePoint() {
    }

    private double x;
    private double y;

    public SplinePoint copy() {
        return new SplinePoint(x, y);
    }
}