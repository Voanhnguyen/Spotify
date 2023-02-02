package com.example.spotifyapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.spotifyapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            //auth
//            val intent = Intent(activity, MainActivity::class.java)
//            startActivity(intent)
//            activity?.let{
//                it.finish()
//            }
            if (binding.editTextTextEmailAddress.text.toString() == "abc@gmail.com" && binding.editTextPassword.text.toString() == "1234") {
                startActivity(Intent(activity, MainActivity::class.java))
            } else {
                Toast.makeText(activity, "invalid credentials", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}