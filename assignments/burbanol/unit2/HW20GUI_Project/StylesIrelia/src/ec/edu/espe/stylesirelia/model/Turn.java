package ec.edu.espe.stylesirelia.model;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Turn extends BasicModel {

    private int id;
    private String date;
    private String customer;
    private String service;
    private String stylist;

    @Override
    public Document buildDocument() {
        Document document = new Document();

        document.append("id", this.id).
                append("date", this.date).
                append("customer", this.customer).
                append("service", this.service).
                append("stylist", this.stylist);

        return document;
    }

    public Turn(int id, String date, String customer, String service, String stylist) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.service = service;
        this.stylist = stylist;
    }

    @Override
    public String toString() {
        return "yout Turn->>" + "id=" + id + ", date=" + date + ", customer=" + customer + ", service=" + service + ", stylist=" + stylist + '}';
    }

    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the service
     */
    public String getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * @return the stylist
     */
    public String getStylist() {
        return stylist;
    }

    /**
     * @param stylist the stylist to set
     */
    public void setStylist(String stylist) {
        this.stylist = stylist;
    }

}
