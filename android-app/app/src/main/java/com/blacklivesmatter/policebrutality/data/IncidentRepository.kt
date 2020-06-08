package com.blacklivesmatter.policebrutality.data

import androidx.lifecycle.LiveData
import com.blacklivesmatter.policebrutality.data.model.Incident

interface IncidentRepository {
    fun getIncidents(): LiveData<List<Incident>>
    fun getStateIncidents(state: String): LiveData<List<Incident>>
    fun getStates(): LiveData<List<String>>
}