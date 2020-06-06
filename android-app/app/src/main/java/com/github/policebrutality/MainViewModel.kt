package com.github.policebrutality

import androidx.lifecycle.ViewModel
import com.github.policebrutality.data.IncidentRepository
import timber.log.Timber
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val incidentRepository: IncidentRepository
) : ViewModel() {
    init {
        Timber.d("Got incident repo: $incidentRepository")
    }
}