package com.example.intens

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resep_detail.*

class ResepDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resep_detail)

        var intentThatStartedThisActivity = intent

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_INTENT)) {

            var partName = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partDeskripsi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_CC)
            var partBahan = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INDEX)
            var partCara = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INTENT)
            var partImage = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_CHOSEN_COMPONENT, 0)

            tv_nama.text = partName
            tv_deskripsi.text = partDeskripsi
            tv_detail_bahan.text = partBahan
            tv_detail_cara.text = partCara
            iv_detail.contentDescription = partName
            iv_detail.setImageResource(partImage)
        }
    }
}
