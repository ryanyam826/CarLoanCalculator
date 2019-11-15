package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCal.setOnClickListener(){
            val carPrice = textPrice.text.toString().toInt()
            val paymentAmount = textAmount.text.toString().toInt()
            val loanPeriod = textLoanPeriod.text.toString().toInt()
            val interestRate = textInterestRate.text.toString().toDouble()


            val carLoan = carPrice - paymentAmount
            val interest = carLoan * loanPeriod * interestRate
            val monthlyRepayment = (carLoan + interest) / loanPeriod / 12

            txtCarLoan.text = carLoan.toString()
            txtInterest.text = interest.toString()
            txtMonthlyRepayment.text = "%.2f".format(monthlyRepayment)
        }
    }
}
