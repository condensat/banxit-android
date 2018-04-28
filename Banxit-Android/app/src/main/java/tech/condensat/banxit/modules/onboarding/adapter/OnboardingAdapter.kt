package tech.condensat.banxit.modules.onboarding.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import tech.condensat.banxit.R
import tech.condensat.banxit.modules.onboarding.presenter.OnboardingPresenter
import tech.condensat.banxit.modules.onboarding.viewHolders.OnboardingViewHolder
import tech.condensat.banxit.modules.onboarding.views.OnboardingClickListener
import tech.condensat.banxit.utils.inflate

class OnboardingAdapter(
        private val mPresenter: OnboardingPresenter,
        private val mListener: OnboardingClickListener
) : RecyclerView.Adapter<OnboardingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingViewHolder
            = OnboardingViewHolder(parent.inflate(R.layout.cell_onboarding), mListener)

    override fun onBindViewHolder(holder: OnboardingViewHolder, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount(): Int = 4
}