package ec.edu.espe.SortApp.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Numbers{
        
        private int NumbersDisordered[] ;
        private int sizeNumbers;
        private String sortAlgorithm;
        private int[] NumberOrdered;

     
        
        
        public int[] getNumbersDisordered() {
            return NumbersDisordered;
        }

        public void setNumbersDisordered(int[] NumbersDisordered) {
            this.NumbersDisordered = NumbersDisordered;
        }

        public int getSizeNumbers() {
            return sizeNumbers;
        }

        public void setSizeNumbers(int sizeNumbers) {
            this.sizeNumbers = sizeNumbers;
        }

        public String getSortAlgorithm() {
            return sortAlgorithm;
        }

        public void setSortAlgorithm(String sortAlgorithm) {
            this.sortAlgorithm = sortAlgorithm;
        }

        public int[] getNumberOrdered() {
            return NumberOrdered;
        }

        public void setNumberOrdered(int[] NumberOrdered) {
            this.NumberOrdered = NumberOrdered;
        }
        
    @Override
    public String toString() {
        return "ListNumbers{" + "listOfNumbersDisordered=" + NumbersDisordered + ", sizeOfListOfNumbers=" + sizeNumbers + ", sortAlgorithm=" + sortAlgorithm + ", listOfNumberOrdered=" + NumberOrdered + '}';
    }
      
        
        
        
    }
    