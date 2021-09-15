package kr.hs.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        printf("hello world")
        //1. 변수
        var a = 20 //Int
        val b = 20
        //2. 연산자

        printf(""+(a+b))
        //3.제어문
        //조건문, 반복문
        if(a!=10){
            printf("true")
        }else{
            printf("false")
        }

        when(a){ //switch
            10,20 -> printf("a = 10")
            29 -> printf("a=29")
            else -> printf("a null")
        }

        //for, while
        //for(i = 10 ; i>0;i--)
        for(i in 10 downTo 1 step 3 ){
            printf("for : "+i)
        }
        var j = 0
        while(j<10){
            printf("while : "+j++)

        }

        // 정수
        // 실수
        // 문자
        // 논리

    }

    //int sum(int a )
    fun printf(str : String){
        Log.d("test",str)
    }

}