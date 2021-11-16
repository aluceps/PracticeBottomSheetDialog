package me.aluceps.practicebottomsheetdialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import me.aluceps.practicebottomsheetdialog.databinding.FragmentModalBottomSheetBinding

class ModalBottomSheet : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentModalBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentModalBottomSheetBinding.inflate(layoutInflater)
        binding.text2.setOnClickListener { }
        binding.text3.setOnClickListener { }
        binding.text4.setOnClickListener { }
        return binding.root
    }

    companion object {
        const val TAG = "ModalBottomSheet"

        fun newInstance() = ModalBottomSheet()
    }
}