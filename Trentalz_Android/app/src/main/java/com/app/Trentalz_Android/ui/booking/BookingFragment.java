package com.app.Trentalz_Android.ui.booking;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import com.app.Trentalz_Android.databinding.FragmentBookingBinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BookingFragment extends Fragment {
    private FragmentBookingBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBookingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}