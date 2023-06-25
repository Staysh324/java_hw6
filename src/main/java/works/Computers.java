package works;

import java.util.Objects;

public class Computers {
    private int diagonal;
    private String mark;
    private String CPU;
    private int RAM;
    private String color;

    public Computers (int diagonal, String mark, String CPU, int RAM, String color){
        this.diagonal = diagonal;
        this.mark = mark;
        this.CPU = CPU;
        this.RAM = RAM;
        this.color = color;
    }

    public int getDiagonal(){
        return diagonal;
    }
    public void setDiagonal(int diagonal){
        this.diagonal = diagonal;
    }

    public String getMark(){
        return  mark;
    }
    public void setMark(String mark){
        this.mark = mark;
    }

    public String getCPU(){
        return  CPU;
    }
    public void setCPU(String CPU){
        this.CPU = CPU;
    }

    public int getRAM(){
        return RAM;
    }
    public void setRAM(int RAM){
        this.RAM = RAM;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computers)) return  false;
        Computers computer = (Computers) o;
        return diagonal == computer.diagonal &&
                RAM == computer.RAM &&
                Objects.equals(mark, computer.mark) &&
                Objects.equals(CPU, computer.CPU) &&
                Objects.equals(color, computer.color);
    }

    @Override
    public String toString() {
        return "{" +
                "diagonal=" + diagonal +
                ", mark='" + mark + '\'' +
                ", CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                ", color='" + color + '\'' +
                '}';
    }
}
