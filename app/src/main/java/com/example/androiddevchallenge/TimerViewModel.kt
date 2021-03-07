/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TimerViewModel : ViewModel() {
    var time = MutableLiveData<Long>(0)
    var isRunning = MutableLiveData(false)
    private lateinit var countDownTimer: CountDownTimer

    fun startTimer() {
        time.value?.let {
            countDownTimer = object :
                CountDownTimer(it, 1000 /* 1 second */) {
                override fun onTick(millisUntilFinished: Long) {
                    time.value = millisUntilFinished
                }

                override fun onFinish() {
                    isRunning.value = false
                }
            }.start()
            isRunning.value = true
        }
    }

    fun stopTimer() {
        countDownTimer.cancel()
        time.value = 0
        isRunning.value = false
    }

    fun setTimeFromString(timeString: String) {
        val tmp = timeString.padStart(6, '0')
        time.value =
            (tmp.substring(0, 2).toLong() * 60 * 60 * 1000) + // hours
            (tmp.substring(2, 4).toLong() * 60 * 1000) + // minutes
            (tmp.substring(4, 6).toLong() * 1000) // seconds
    }
}
