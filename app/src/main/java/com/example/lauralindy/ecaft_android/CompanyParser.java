package com.example.lauralindy.ecaft_android;

import android.app.Application;
import android.util.Log;
import java.util.ArrayList;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

/**
 * Created by lauralindy on 4/17/18.
 */

public class CompanyParser extends Application {
    public static final String COMPANY_NAME = "name";
    public static final String COMPANY_ID = "id";
    public static final String COMPANY_LOGO = "logo";
    public static final String COMPANY_MAJORS = "majors";
    public static final String COMPANY_TABLE = "location";
    public static final String COMPANY_JOBTITLES = "jobtitles";
    public static final String COMPANY_JOBTYPES = "jobtypes";
    public static final String COMPANY_INFO = "description";
    public static final String COMPANY_WEBSITE = "website";
    public static final String COMPANY_OPTCPT = "optcpt";
    public static final String COMPANY_SPONSOR = "sponsor";
    public static final String SHOW_NOTES = "showNotes";

    private static DatabaseReference databaseReference;
    private static FirebaseStorage storage;
    private static StorageReference storageRef;
    private static ArrayList<Company> companies;

    public void onCreate() {
        super.onCreate();
        Log.d("final", "firebase application oncreate");
        // Get database/storage reference and initialize everything
        companies = new ArrayList<>();
        databaseReference = FirebaseDatabase.getInstance().getReference()
                .child("companies");
        databaseReference.addValueEventListener(new ValueEventListener
                () {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Company fc = snapshot.getValue(Company
                            .class);
                    companies.add(fc);
                    //MainActivity.allCompanies.add(fc.getName());
                    //MainActivity.allCompanyIds.add(fc.getId());
                }

                Log.d("final", "firebaseapp size: " + companies.size());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.d("test", "oncancel");
            }
        });

        FirebaseStorage storage = FirebaseStorage.getInstance();
        storageRef = storage.getReferenceFromUrl
                ("gs://ecaft-4a6e7.appspot.com");
    }

    public static ArrayList<Company> getCompanies() {
        return companies;
    }

    public static DatabaseReference getFirebaseDatabase() {
        return databaseReference;
    }

    public static StorageReference getStorageRef() {
        return storageRef;
    }
}
