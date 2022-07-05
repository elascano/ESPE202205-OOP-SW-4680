/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longmessagechains;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
class Obj {
    private int id;
    private int HOD;
    private int SubDept;
    private int Dept;

    public Obj(int id, int HOD, int SubDept, int Dept) {
        this.id = id;
        this.HOD = HOD;
        this.SubDept = SubDept;
        this.Dept = Dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHOD() {
        return HOD;
    }

    public void setHOD(int HOD) {
        this.HOD = HOD;
    }

    public int getSubDept() {
        return SubDept;
    }

    public void setSubDept(int SubDept) {
        this.SubDept = SubDept;
    }

    public int getDept() {
        return Dept;
    }

    public void setDept(int Dept) {
        this.Dept = Dept;
    }

    @Override
    public String toString() {
        return "obj{" + "id=" + getId() + ", HOD=" + getHOD() + ", SubDept=" + getSubDept() + ", Dept=" + getDept() + '}';
    }
    
}
