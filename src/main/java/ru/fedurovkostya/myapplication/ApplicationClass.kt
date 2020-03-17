package ru.fedurovkostya.myapplication

import android.app.Application
import com.onesignal.OneSignal

class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init()
    }
}