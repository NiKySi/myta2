package com.work.myta.domain.usecase

import com.work.myta.domain.repository.AppRepository

class GetAuthStateUseCase(
    private val repository: AppRepository
) {
    fun invoke() = repository.getAuthState()
}