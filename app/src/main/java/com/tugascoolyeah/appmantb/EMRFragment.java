//package com.tugascoolyeah.appmantb;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageButton;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//
//public class EMRFragment extends Fragment {
//
//    public EMRFragment() {
//        // Required empty public constructor
//    }
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        Log.d("EMRFragment", "onCreateView called");
//        View view = inflater.inflate(R.layout.fragment_emr, container, false);
//
//        ImageButton buttonNotifikasiDarurat = view.findViewById(R.id.button_notifikasi_darurat);
//        ImageButton buttonJadwalKonsultasi = view.findViewById(R.id.button_jadwal_konsultasi);
//        ImageButton buttonDatabasePasien = view.findViewById(R.id.button_database_pasien);
//
//        // Set up click listeners to load different layouts
//        buttonNotifikasiDarurat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                loadFragmentLayout(R.layout.notifikasi_darurat);
//            }
//        });
//
//        buttonJadwalKonsultasi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                loadFragmentLayout(R.layout.jadwal_konsultasi);
//            }
//        });
//
//        buttonDatabasePasien.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                loadFragmentLayout(R.layout.database_pasien);
//            }
//        });
//
//        return view;
//    }
//
//    private void loadFragmentLayout(int layoutId) {
//        Fragment fragment = new Fragment() {
//            @Nullable
//            @Override
//            public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//                return inflater.inflate(layoutId, container, false);
//            }
//        };
//
//        getParentFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fragment_container, fragment)
//                .addToBackStack(null)
//                .commit();
//    }
//}
