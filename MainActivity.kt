package sungil.myjypent1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sungil.myjypent1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val jypData = listOf(
            Jyp("https://jyptfstorage01.blob.core.windows.net/homepage/Artist-banner-350x270(38).jpg", "J.Y.Park", "박진영"),
            Jyp("https://jyptfstorage01.blob.core.windows.net/homepage/2PM.jpg&quot", "2PM", "투피엠"),
            Jyp("https://jyptfstorage01.blob.core.windows.net/homepage/KakaoTalk_20210127_173757151.jpg&quot", "Bernard Park", "버나드박"),
            Jyp("https://jyptfstorage01.blob.core.windows.net/homepage/20210419.png&quot", "DAY6", "데이식스"),
            Jyp("https://jyptfstorage01.blob.core.windows.net/homepage/TWICE-main-350x270.jpg&quot", "TWICE", "트와이스"),
            Jyp("https://jyptfstorage01.blob.core.windows.net/homepage/SKZ%20_%20350X270.jpg&quot", "Stray Kids", "스트레이 키즈"),
            Jyp("https://jyptfstorage01.blob.core.windows.net/homepage/ea8acc6369d2450ebba923349b454c2b-JYP%EA%B3%B5%ED%99%88_%ED%94%84%EB%A1%9C%ED%95%84%EB%8B%A8%EC%B2%B4_350x270.jpg&quot", "ITZY", "잇지"),
            Jyp("https://jyptfstorage01.blob.core.windows.net/homepage/BOY%20STORY.jpg&quot", "BOY STORY", "보이스토리"),
            Jyp("https://jyptfstorage01.blob.core.windows.net/homepage/20201202_01.jpg&quot", "NiziU", "니지유"),
            Jyp("https://jyptfstorage01.blob.core.windows.net/homepage/artist%20image%20jpg(5).jpg", "Xdinary Heroes", "엑스디너리히어로즈"),
            Jyp("https://jyptfstorage01.blob.core.windows.net/homepage/20220224_03_nmix.jpg&quot", "NMIXX", "엔믹스")
        )

        val adapter = JypAdapter(jypData)
        binding.rvJyp.adapter = adapter
    }
}