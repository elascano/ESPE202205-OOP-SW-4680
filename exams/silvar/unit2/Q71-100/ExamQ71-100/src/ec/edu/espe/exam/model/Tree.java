package ec.edu.espe.exam.model;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class Tree {
    private String type;
    private int age;
    private boolean fruitTree;
    private boolean treeLeaves;
    private String Color;

    public Tree() {
    }

    public Tree(String type, int age, boolean fruitTree, boolean treeLeaves, String Color) {
        this.type = type;
        this.age = age;
        this.fruitTree = fruitTree;
        this.treeLeaves = treeLeaves;
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Tree{" + "type=" + type + ", age=" + age + ", fruitTree=" + fruitTree + ", treeLeaves=" + treeLeaves + ", Color=" + Color + '}';
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the fruitTree
     */
    public boolean isFruitTree() {
        return fruitTree;
    }

    /**
     * @param fruitTree the fruitTree to set
     */
    public void setFruitTree(boolean fruitTree) {
        this.fruitTree = fruitTree;
    }

    /**
     * @return the treeLeaves
     */
    public boolean isTreeLeaves() {
        return treeLeaves;
    }

    /**
     * @param treeLeaves the treeLeaves to set
     */
    public void setTreeLeaves(boolean treeLeaves) {
        this.treeLeaves = treeLeaves;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
}
