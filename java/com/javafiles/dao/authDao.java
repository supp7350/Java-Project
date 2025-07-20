/*

public UserDetail getData(String c2w_pi_collection, String c2w_pi_document)
            throws ExecutionException, InterruptedException {

        try {
            DocumentReference c2w_pi_docRef = c2w_pi_db.collection(c2w_pi_collection).document(c2w_pi_document); // Reference
                                                                                                                 // to
                                                                                                                 // the
                                                                                                                 // document

            ApiFuture<DocumentSnapshot> c2w_pi_future = c2w_pi_docRef.get(); // Asynchronously retrieve document
                                                                             // snapshot

            // ApiFuture<DocumentSnapshot> c2w_pi_future2 =c2w_pi_docRef.get();

            // ApiFuture<DocumentSnapshot> c2w_pi_future3 =c2w_pi_docRef.get();

            // ApiFuture<DocumentSnapshot> c2w_pi_future4 =c2w_pi_docRef.get();
            return

            c2w_pi_future.get().toObject(UserDetail.class); // Convert document snapshot to UserDetail object
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for debugging

            throw e; // Re-throw the exception or handle it based on your application's needs

        }
    }
}
*/