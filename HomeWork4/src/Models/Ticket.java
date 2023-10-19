package Models;

import java.util.Date;

/**
 * Модель билета
 */

public class Ticket{

    private long id;
    private Date date;
    private int routeNumber;
    private int zoneStart;
    private int zoneStop;
    private int price;
    private Date timeStart;
    private Date timeStop;
    private boolean isValid;
    private boolean isUsed;
    private int place;

    public Ticket(int routeNumber, int place, int price, Date date, boolean isValid) {
        this.routeNumber = routeNumber;
        this.place = place;
        this.price = price;
        this.date = date;
        this.isValid = isValid;
    }


    @Override
    public String toString() {
        return "Ticket" +
                " Route Number " + routeNumber +
                ", Place " + place +
                ", Price " + price + " rub." +
                ", Date " + date +
                ", " + (isValid ? "Free" : "Busy");
    }


    public String toPrint() {
        return "Ticket" +
                "\nRoute Number " + routeNumber +
                "\nPlace " + place +
                "\nPrice " + price + "rub." +
                "\nDate " + date;
    }

    @Override
    public int hashCode() {
        return date.hashCode() ^ (routeNumber + place + price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.equals((Ticket) obj);
    }


    public boolean equals(Ticket ticket) {
        boolean isIt = ticket != null
                && ticket.getRouteNumber() == this.routeNumber
                && ticket.getPlace() == this.place
                && ticket.getPrice() == this.price
                && ticket.getDate() == this.date
                && ticket.hashCode() == this.hashCode();

        if (isIt) {
            return true;
        }
        return false;
    }


   /*  public long getId() {
        return id;
    } */


    /* public void setId(long id) {
        this.id = id;
    } */


    public Date getDate() { 
        return date;
    }


    /* public void setDate(Date date) {
        this.date = date;
    } */


    public int getRouteNumber() { 
        return routeNumber;
    }


    /* public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }


    public int getZoneStart() {
        return zoneStart;
    } */


    public void setZoneStart(int zoneStart) { 
        this.zoneStart = zoneStart;
    }


    /* public int getZoneStop() {
        return zoneStop;
    } */


    public void setZoneStop(int zoneStop) { //
        this.zoneStop = zoneStop;
    }


    public int getPrice() { //
        return price;
    }


    /* public void setPrice(int price) {
        this.price = price;
    }


    public Date getTimeStart() {
        return timeStart;
    }


    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }


    public Date getTimeStop() {
        return timeStop;
    }


    public void setTimeStop(Date timeStop) {
        this.timeStop = timeStop;
    }
 */

    public boolean isValid() { 
        return isValid;
    }


    public void setValid(boolean isValid) { 
        this.isValid = isValid;
    }


    /* public boolean isUsed() {
        return isUsed;
    } */


    public void setUsed(boolean isUsed) { //
        this.isUsed = isUsed;
    }


    public int getPlace() { //
        return place;
    }


    /* public void setPlace(int place) {
        this.place = place;
    } */

    
}
