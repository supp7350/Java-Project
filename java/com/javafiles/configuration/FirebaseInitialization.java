package com.javafiles.configuration;



import com.javafiles.dao.PlayerDao;
//import com.example.dao.PlayerDao;
import com.javafiles.dao.UserDao;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

// import com.google.auth.oauth2.GoogleCredentials;
// import com.google.cloud.firestore.Firestore;
// import com.google.firebase.FirebaseApp;
// import com.google.firebase.FirebaseOptions;
// import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.IOException;
/**
* Class for initializing Firebase configuration.
*/
public class FirebaseInitialization {
// Static block to initialize Firebase upon class loading
static {
    try {
        initializeFirebase(); // Call method to initialize Firebase
        
        } catch (IOException e) {
        e.printStackTrace(); // Handle IOException if thrown
        }
        }
        /**
        * Method to initialize Firebase.
        * @throws IOException if there is an issue reading the
        service account file.
        */
        private static void initializeFirebase() throws IOException {
        // Load Firebase service account credentials from a JSON file
        
        FileInputStream c2w_pi_serviceAccount = new  FileInputStream("src\\main\\resources\\firebase.json");
        
        // Create FirebaseOptions object to configure Firebase App with credentials
        
        FirebaseOptions c2w_pi_options = new FirebaseOptions.Builder().setCredentials(GoogleCredentials.fromStream(c2w_pi_serviceAccount)).build(); // Set credentials from JSON file.build();
        
        // Initialize Firebase App with the configured c2w_pi_options
        
        FirebaseApp.initializeApp(c2w_pi_options);
        // Access Firestore database instance
        Firestore c2w_pi_db = FirestoreClient.getFirestore();
        // Set Firestore instance in PlayerDao and UserDao for database operations

PlayerDao.c2w_pi_db = c2w_pi_db;
UserDao.c2w_pi_db = c2w_pi_db;
}
}