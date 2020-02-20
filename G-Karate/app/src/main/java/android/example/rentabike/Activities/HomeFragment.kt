package android.example.rentabike.Activities

import android.example.rentabike.R
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.findNavController

    private lateinit var coachButton: Button

class HomeFragment : Fragment()   {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false);

        init(view)
        return view


    }

    private fun init(view: View){
        coachButton = view.findViewById<View>(R.id.coach) as Button
        val navController = view.findNavController()
        coachButton.setOnClickListener {
            Log.d("1","we geraken hier 1")
            navController.navigate(R.id.home_fragment_to_coach_fragment)
        }

    }

}