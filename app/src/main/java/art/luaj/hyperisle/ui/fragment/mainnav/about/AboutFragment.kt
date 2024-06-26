package art.luaj.hyperisle.ui.fragment.mainnav.about

import androidx.lifecycle.ViewModel
import art.luaj.hyperisle.R
import art.luaj.hyperisle.databinding.FragmentAboutBinding
import art.luaj.hyperisle.ui.base.BaseFragment

class AboutFragment : BaseFragment<FragmentAboutBinding, ViewModel>(
    FragmentAboutBinding::inflate,
    null
) {
    override fun initFragment(binding: FragmentAboutBinding, viewModel: ViewModel?) {
        binding.aboutToolbar.setLogo(R.mipmap.ic_launcher)
    }
}