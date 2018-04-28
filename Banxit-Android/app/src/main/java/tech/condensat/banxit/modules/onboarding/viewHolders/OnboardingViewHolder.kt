package tech.condensat.banxit.modules.onboarding.viewHolders

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.extensions.LayoutContainer
import tech.condensat.banxit.modules.onboarding.views.OnboardingClickListener

class OnboardingViewHolder(
        override val containerView: View?,
        private val mListener: OnboardingClickListener
) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun onBind(index: Int) {

        containerView?.setOnClickListener {
            mListener.didClickOnOnboaringPartAtIndex(index)
        }
    }
}