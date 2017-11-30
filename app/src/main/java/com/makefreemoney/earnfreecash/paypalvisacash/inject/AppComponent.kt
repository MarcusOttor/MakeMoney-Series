package com.makefreemoney.earnfreecash.paypalvisacash.inject

import com.makefreemoney.earnfreecash.paypalvisacash.core.MyApplication
import com.makefreemoney.earnfreecash.paypalvisacash.core.services.ClaimService
import com.makefreemoney.earnfreecash.paypalvisacash.screens.BaseActivity
import com.makefreemoney.earnfreecash.paypalvisacash.screens.dialogs.*
import dagger.Component

@Component(modules = arrayOf(AppModule::class, MainModule::class))
interface AppComponent {

    fun inject(screen: BaseActivity)
    fun inject(app: MyApplication)
    fun inject(dialog: LoginDialog)
    fun inject(dialog: SignupDialog)
    fun inject(dialog: PromocodeDialog)
    fun inject(dialog: RedeemDialog)
    fun inject(service: ClaimService)
    fun inject(dialog: HistoryDialog)
}
