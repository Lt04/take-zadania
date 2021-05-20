/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Kuba
 */
public class Main {
    public static void main(String[] args){
        Client client = ClientBuilder.newClient();
        String count = client.target("http://localhost:8080/Complaints/" + "resources/complaints/entities.complaint/count")
        .request(MediaType.TEXT_PLAIN)
        .get(String.class);
        System.out.println("Count: " + count);
        String allComplaints = client.target("http://localhost:8080/Complaints/resources/complaints/entities.complaint")
                .request(MediaType.APPLICATION_JSON).get(String.class);
        System.out.println("Wszystkie skargi: " + allComplaints);
        String oneComplaint = client.target("http://localhost:8080/Complaints/resources/complaints/entities.complaint/303")
                .request(MediaType.APPLICATION_JSON).get(String.class);
        System.out.println("Wybrana skarga: " + oneComplaint);
        oneComplaint = oneComplaint.replace("open", "closed");
        Response res = client.target("http://localhost:8080/Complaints/resources/complaints/entities.complaint/303")
                .request(MediaType.APPLICATION_JSON).put(Entity.entity(oneComplaint, MediaType.APPLICATION_JSON));
        String c = client.target("http://localhost:8080/Complaints/resources/complaints/entities.complaint/303")
                .request(MediaType.APPLICATION_JSON).get(String.class);
        System.out.println("Wybrana skarga po zmianie: " + c);
        String allOpenComplaints = client.target("http://localhost:8080/Complaints/resources/complaints/entities.complaint?status=open")
                .request(MediaType.APPLICATION_JSON).get(String.class);
        System.out.println("Wszystkie otwarte skargi: " + allOpenComplaints);
        client.close();
    }    
}
