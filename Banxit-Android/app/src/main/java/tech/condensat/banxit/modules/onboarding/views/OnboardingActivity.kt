package tech.condensat.banxit.modules.onboarding.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_onboarding.*
import tech.condensat.banxit.R
import tech.condensat.banxit.modules.onboarding.adapter.OnboardingAdapter
import tech.condensat.banxit.modules.onboarding.presenter.OnboardingPresenter
import tech.condensat.banxit.modules.onboarding.presenter.OnboardingPresenterImpl
import tech.condensat.banxit.modules.onboarding.presenter.OnboardingView

class OnboardingActivity : AppCompatActivity(), OnboardingView, OnboardingClickListener {

    private lateinit var mPresenter: OnboardingPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        mPresenter = OnboardingPresenterImpl(this)

        setupUI()
    }

    private fun setupUI() {
        val adapter = OnboardingAdapter(mPresenter, this)

        val layoutManager = LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        )

        onboardingRecyclerView.adapter = adapter
        onboardingRecyclerView.layoutManager = layoutManager
    }

    override fun didClickOnOnboaringPartAtIndex(index: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface OnboardingClickListener {
    fun didClickOnOnboaringPartAtIndex(index: Int)
}
