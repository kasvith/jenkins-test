package io.jenkins.plugins;

public class ProjectStats {
    private int classesNumber;
    private int linesNumber;

    public ProjectStats(int classesNumber, int linesNumber) {
        this.classesNumber = classesNumber;
        this.linesNumber = linesNumber;
    }

    public int getClassesNumber() {
        return classesNumber;
    }

    public void setClassesNumber(int classesNumber) {
        this.classesNumber = classesNumber;
    }

    public int getLinesNumber() {
        return linesNumber;
    }

    public void setLinesNumber(int linesNumber) {
        this.linesNumber = linesNumber;
    }
}
