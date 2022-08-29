package ec.edu.espe.SortApp.model;

/**
 *
 * @author Carlos Rivera, Juan Quimbiulco DCCO-ESPE, CODEX++
 */
public class Numbers{
        
        private int[] unsorted;
        private int size;
        private String Algorithm;
        private int[] sorted;

    @Override
    public String toString() {
        return "Numbers{" + "unsorted=" + unsorted + ", size=" + size + ", Algorithm=" + Algorithm + ", sorted=" + sorted + '}';
    }
        
        
        
        public int[] getUnsorted() {
            return unsorted;
        }

        public void setUnsorted(int[] unsorted) {
            this.unsorted = unsorted;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getAlgorithm() {
            return Algorithm;
        }

        public void setAlgorithm(String Algorithm) {
            this.Algorithm = Algorithm;
        }

        public int[] getSorted() {
            return sorted;
        }

        public void setSorted(int[] sorted) {
            this.sorted = sorted;
        }
        
        
        
        
        
    }
    