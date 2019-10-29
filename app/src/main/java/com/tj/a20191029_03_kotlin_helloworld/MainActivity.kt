package com.tj.a20191029_03_kotlin_helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //R은 리소스를 담당하는 클래스
        setContentView(R.layout.activity_main)

        Log.d("코틀린기초", "Hello, World!!")
        Log.d("코틀린기초", "제 이름은 김문석 입니다.")

        // 01. 변수 num1을 만들고 10으로 초기화
        var num1 = 10

        Log.d("코틀린기초", String.format("%d",num1))
        Log.d("코틀린기초", "$num1")
        // Log는 내용이 반드시 String이어야함. num1은 자동으로 Int로 할당되어서 내용으로 직접 들어갈 수 없다.

        // 02. 상수 Pi를 만들고, 3.14로 초기화
        val Pi=3.14
        // Pi=31.4 => val로 만든 상수값은 수정불가
        Log.d("코틀린기초", String.format("%f",Pi))
        Log.d("코틀린기초", "$Pi")

        // 03. 정수형 변수 num2를 만들고, 초기화 시 다음줄에서 20으로 대입
        var num2:Int
        // Log.d("코틀린기초", "$num2") => 초기화 안된 변수는 아예 사용도 못하게 컴파일단에서 막는다.
        num2 = 20 // => 미리 타입을 지정해두면, 해당 타입의 값을 나중에 대입 가능.
        // num2 = 3.14 => 타입이 다른 값은 넣을 수 없다.
        Log.d("코틀린기초", "1 : $num2")

        // 코틀린에서는 모든 변수가 참조형 변수이므로, Int 같은 기본형으로 추정되는 변수도 메소드/속성을 보유하고 있다.
        num2 = num2.plus(10)
        Log.d("코틀린기초", "2 : $num2")

        var num3:Int? = null // ?를 붙이면 이 변수는 null일 가능성을 내포하고 있다고 알려주는 역할.
        Log.d("코틀린기초", "1 : $num3")

        // var num4:Int = null => ?를 붙이지 않은 타입의 변수는 null을 담기를 거부함.

        var num5 = null
    }
}
