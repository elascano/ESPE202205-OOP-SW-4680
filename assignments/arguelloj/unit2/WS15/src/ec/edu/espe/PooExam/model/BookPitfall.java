/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.PooExam.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class BookPitfall {
    
    private String titleString;
    private String authorString;
    private int yearOfPublicatioInt;
    private int numberOfPagesInt;

    public BookPitfall(String titleString, String authorString, int yearOfPublicatioInt, int numberOfPagesInt) {
        this.titleString = titleString;
        this.authorString = authorString;
        this.yearOfPublicatioInt = yearOfPublicatioInt;
        this.numberOfPagesInt = numberOfPagesInt;
    }

    @Override
    public String toString() {
        return "BookPitfall{" + "titleString=" + titleString + ", authorString=" + authorString + ", yearOfPublicatioInt=" + yearOfPublicatioInt + ", numberOfPagesInt=" + numberOfPagesInt + '}';
    }

    
    /**
     * @return the titleString
     */
    public String getTitleString() {
        return titleString;
    }

    /**
     * @param titleString the titleString to set
     */
    public void setTitleString(String titleString) {
        this.titleString = titleString;
    }

    /**
     * @return the authorString
     */
    public String getAuthorString() {
        return authorString;
    }

    /**
     * @param authorString the authorString to set
     */
    public void setAuthorString(String authorString) {
        this.authorString = authorString;
    }

    /**
     * @return the yearOfPublicatioInt
     */
    public int getYearOfPublicatioInt() {
        return yearOfPublicatioInt;
    }

    /**
     * @param yearOfPublicatioInt the yearOfPublicatioInt to set
     */
    public void setYearOfPublicatioInt(int yearOfPublicatioInt) {
        this.yearOfPublicatioInt = yearOfPublicatioInt;
    }

    /**
     * @return the numberOfPagesInt
     */
    public int getNumberOfPagesInt() {
        return numberOfPagesInt;
    }

    /**
     * @param numberOfPagesInt the numberOfPagesInt to set
     */
    public void setNumberOfPagesInt(int numberOfPagesInt) {
        this.numberOfPagesInt = numberOfPagesInt;
    }
    
    
    
    
}
