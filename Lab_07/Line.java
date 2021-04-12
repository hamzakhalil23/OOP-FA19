package com.company;
public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point s, Point e) {
        this.startPoint = s;
        this.endPoint = e;
    }

    public double getLength() {
        return (Math.sqrt(Math.pow((endPoint.getXcord() - startPoint.getXcord()), 2)
                + (Math.pow((endPoint.getYcord() - startPoint.getYcord()), 2))));
    }
}
