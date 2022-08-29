/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.finalexam.model;

/**
 *
 * @author Ronny Ibarra, Ricardo Imbaquinga, DCCO- ESPE, Syntax Error
 */
public class ListNumbers{
        
        private int listOfNumbersDisordered[];
        private int Size;
        private String Sort;
        private int listOfNumberOrdered[];

    @Override
    public String toString() {
        return "ListNumbers{" + "listOfNumbersDisordered=" + listOfNumbersDisordered + ", sizeOfListOfNumbers=" + Size + ", sortAlgorithm=" + Sort + ", listOfNumberOrdered=" + listOfNumberOrdered + '}';
    }
        
        
        
        public int[] getListOfNumbersDisordered() {
            return listOfNumbersDisordered;
        }

        public void setListOfNumbersDisordered(int[] listOfNumbersDisordered) {
            this.listOfNumbersDisordered = listOfNumbersDisordered;
        }

        public int getSize() {
            return Size;
        }

        public void setSizeOfListOfNumbers(int sizeOfListOfNumbers) {
            this.Size = sizeOfListOfNumbers;
        }

        public String getSort() {
            return Sort;
        }

        public void setSortAlgorithm(String sortAlgorithm) {
            this.Sort = sortAlgorithm;
        }

        public int[] getListOfNumberOrdered() {
            return listOfNumberOrdered;
        }

        public void setListOfNumberOrdered(int[] listOfNumberOrdered) {
            this.listOfNumberOrdered = listOfNumberOrdered;
        }
        
        
        
        
        
    }
    