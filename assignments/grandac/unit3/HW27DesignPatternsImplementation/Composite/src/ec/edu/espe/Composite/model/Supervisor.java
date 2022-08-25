
package ec.edu.espe.Composite.model;

import java.util.Vector;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
abstract public class Supervisor extends Employe {
    protected Vector directReports = new Vector();
        public void stateName() {
            super.stateName(); // print name of this employee first
        
            if( directReports.size() > 0 ) // be sure there are elements
            for( int i = 0; i < directReports.size(); ++i )
            ( (Employe)directReports.elementAt( i ) ).stateName();
}
    public void add( Employe anEmployee ) {
        this.directReports.addElement( anEmployee );
    }
}
