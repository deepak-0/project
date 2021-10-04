package com.torryharris.model;

import java.util.Date;
import java.util.TreeMap;

public class Ticket {
    private int counter;
    private String pnr;
    private Date travelDate;
    private Train train;
    private TreeMap<Passenger,Integer> passengers = new TreeMap<>();

    public Ticket(Date travelDate, Train train) {
        this.travelDate = travelDate;
        this.train = train;
    }

    public void generatePNR(String str){


    }
}
