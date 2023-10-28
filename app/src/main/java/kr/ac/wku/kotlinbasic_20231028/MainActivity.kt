package kr.ac.wku.kotlinbasic_20231028

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kr.ac.wku.kotlinbasic_20231028.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)



        binding.btnLog.setOnClickListener{
//            로그 버튼이 클릭되면 실행될 코드 스코프

//            로그 찍어보기

            Log.d("메인화면", "로그 버튼 클릭됨")
        }

        binding.btnToast.setOnClickListener{
            Toast.makeText(this, "토스트 클릭됨", Toast.LENGTH_SHORT).show()
        }

        binding.btnVariable.setOnClickListener {
//            코틀린 변수 문법 연습
//            내 이름 저장할 변수 (String) 생성 => 변동 가능성 있다

            var myName : String

            myName = "우승진"

//            이름 변경 => 진승우 (역순) => var로 변수를 선언했기 때문에 가능.

            myName = "진승우"

            Toast.makeText(this, myName, Toast.LENGTH_SHORT).show()

//            어머니 이름 : 변경 불가
            val motherName : String
            motherName = "이경주"

//            어머니 이름 변경 시도
//            motherName = "이경주2" //Syntax 에러 -> 상수로 선언한 공간의 값을 변경 시도
        }
    }
}