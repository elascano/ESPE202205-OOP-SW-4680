package ec.edu.espe.Bookify.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


import ec.edu.espe.Bookify.model.Movie;

import ec.edu.espe.Bookify.model.Book;


import ec.edu.espe.Bookify.model.Movie;
import ec.edu.espe.Bookify.model.Book;

import ec.edu.espe.Bookify.model.User;
import org.bson.Document;



/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class MongoDBManager {

    String collection;

    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;
            
        String uri = "mongodb+srv://jairo:jairo@jqdatabase.0xyetay.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");

        userdatabase = client.getDatabase("JAIRO");

        return userdatabase;

    }

    
    public void CreateUser(User user) {

        MongoDatabase userDB;
        MongoCollection userCollection;
        Document document;
        
        userDB = EstablishConnection();
        userCollection = userDB.getCollection("Users");

        document = new Document();
        
        document.append("Name", user.getUserName());
        document.append("Id", user.getUserId());
        document.append("Email", user.getUserEmail());
        document.append("Phone", user.getUserPhone());
        document.append("Addres", user.getUserAddress());
        document.append("Age", user.getUserAge());
        document.append("Password", user.getUserPassword());

        userCollection.insertOne(document);

    }


      public void CreateMovie(Movie movie) {

        MongoDatabase movieDB;
        MongoCollection movieCollection;
        Document document;
        
        movieDB = EstablishConnection();
        movieCollection = movieDB.getCollection("Movies");

        document = new Document();
        
        document.append("Title", movie.getTitle());
        document.append("Genre", movie.getGenre());
        document.append("Idiom", movie.getIdiom());
        document.append("Available", movie.isAvailable());



    }  




    public void CreateBook(Book book) {

        MongoDatabase userDB;
        MongoCollection userCollection;
        Document document;
        
        userDB = EstablishConnection();
        userCollection = userDB.getCollection("Books");

        document = new Document();
        
        document.append("Title", book.getTitle());
        document.append("Author", book.getAuthor());
        document.append("Publisher", book.getPublisher());
        document.append("ISBN", book.getISBN());
        document.append("Avaliable", book.isAvailable());


        userCollection.insertOne(document);

    }

    

}
