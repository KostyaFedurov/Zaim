package ru.fedurovkostya.myapplication

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHandler(val context: Context): SQLiteOpenHelper(context,
    DB_NAME,null,
    DB_VERSION
){
    //создание бд
    override fun onCreate(db: SQLiteDatabase) {
        val createCompanyTable = "CREATE TABLE $TABLE_TASK (" +
                "$COL_ID integer PRIMARY KEY AUTOINCREMENT," +
                "$COL_IMAGE integer," +
                "$COL_FULL_INFO text," +
                "$COL_SHORT_INFO text," +
                "$COL_URL text" +
                ");"
        db.execSQL(createCompanyTable)

        //мандарино
        val cv = ContentValues()
        cv.put(COL_FULL_INFO,"Первый займ под 0%\n" +
                "Оформление за 10 минут\n")
        cv.put(COL_URL,"https://pxl.leads.su/click/74435be1b40eff91ab806155510ac51b")
        cv.put(COL_IMAGE,R.drawable.mandarino)
        cv.put(COL_SHORT_INFO,"\n" +
                "от 50 до 15000 грн первый кредит до 0,01%")
        db.insert(TABLE_TASK,null,cv)
        //Alex Сredit
        val cv1 = ContentValues()
        cv1.put(COL_FULL_INFO,"Скидка на первый кредит 100%\n" +
                "Получите до 12000 грн.\n")
        cv1.put(COL_URL,"https://pxl.leads.su/click/c9661d12dc51bbd488b589fabf0f7145")
        cv1.put(COL_IMAGE,R.drawable.alex_credit)
        cv1.put(COL_SHORT_INFO,"\n" +
                "от 500 до 10000 грн первый заем бесплатно")
        db.insert(TABLE_TASK,null,cv1)
        //Money4you
        val cv2 = ContentValues()
        cv2.put(COL_FULL_INFO,"Оформление кредита за 5 минут\n" +
                "Оформите до 10.000 грн.\n" +
                "Возможность продления кредита\n")
        cv2.put(COL_URL,"https://pxl.leads.su/click/fe3f075afdd4e93a893c4682fb0a08a7")
        cv2.put(COL_IMAGE,R.drawable.money4you)
        cv2.put(COL_SHORT_INFO,"\n" +
                "от 100 до 10000 грн  скидка на первый кредит 100%")
        db.insert(TABLE_TASK,null,cv2)
        //Credit7
        val cv3 = ContentValues()
        cv3.put(COL_FULL_INFO,"Одобрение кредита за 5 минут\n" +
                "Получите до 10.000 грн.\n" +
                "Первый кредит пол 0.01%\n")
        cv3.put(COL_URL,"https://pxl.leads.su/click/d6982265f8f34466c77b59d7b2c84984")
        cv3.put(COL_IMAGE,R.drawable.credit_7)
        cv3.put(COL_SHORT_INFO,"от 500 до 7000 грн первый заем бесплатно\n")
        db.insert(TABLE_TASK,null,cv3)
        //Gofingo
        val cv4 = ContentValues()
        cv4.put(COL_FULL_INFO,"Первый кредит пол 0.01%\n" +
                "Получите до 10.000 грн.\n" +
                "Быстрое оформление онлайн\n")
        cv4.put(COL_URL,"https://pxl.leads.su/click/c89fbc68dc7517eca730deded8a5c6fd")
        cv4.put(COL_IMAGE,R.drawable.gofingo)
        cv4.put(COL_SHORT_INFO,"\n" +
                "от 400 до 5000 грн надежно, низкие комиссии")
        db.insert(TABLE_TASK,null,cv4)
        //Moneyveo
        val cv5 = ContentValues()
        cv5.put(COL_FULL_INFO,"Кредит на карту до 20.000 грн.\n" +
                "Прозрачная ставка по кредитам\n" +
                "Программа лояльности для постоянных клиентов\n")
        cv5.put(COL_URL,"https://pxl.leads.su/click/ba501bc1a7b192633c22897f73066ae8")
        cv5.put(COL_IMAGE,R.drawable.money_veo)
        cv5.put(COL_SHORT_INFO,"\n" +
                "от 300 до 3500 грн получение за 8 минут.Ставка от 1% в день")
        db.insert(TABLE_TASK,null,cv5)
        //Mycredit
        val cv6 = ContentValues()
        cv6.put(COL_FULL_INFO,"Оформление до 12.000 грн.\n" +
                "Одобрение за 5 минут\n" +
                "Деньги поступают на карту без задержек\n")
        cv6.put(COL_URL,"https://pxl.leads.su/click/7793a619debc3470e1d12d60c02c1f70")
        cv6.put(COL_IMAGE,R.drawable.my_credit)
        cv6.put(COL_SHORT_INFO,"\n" +
                "от 500 до 15000 грн получение за 20 минут. Займ 0%")
        db.insert(TABLE_TASK,null,cv6)
        //Eurogroshi Украина
        val cv7 = ContentValues()
        cv7.put(COL_FULL_INFO,"Простое оформление кредита до 10.000 грн.\n" +
                "Требуется только паспорт\n")
        cv7.put(COL_URL,"https://pxl.leads.su/click/1615453e7948a044f07abb5e8215dc76")
        cv7.put(COL_IMAGE,R.drawable.euro_groshi)
        cv7.put(COL_SHORT_INFO,"\n" +
                "от 500 до 3500 грн первый кредит под 0,9%")
        db.insert(TABLE_TASK,null,cv7)
        //ШвидкоГроші
        val cv8 = ContentValues()
        cv8.put(COL_FULL_INFO,"Прозрачная ставка по кредиту\n" +
                "Для оформления потребуется только паспорт\n" +
                "Поступление денег на карту\n")
        cv8.put(COL_URL,"https://pxl.leads.su/click/7a80d9b37c2aeca3da2ea99937f664ec")
        cv8.put(COL_IMAGE,R.drawable.shvidko_groshi)
        cv8.put(COL_SHORT_INFO,"\n" +
                "от 500 до 10000 грн первый заем бесплатно")
        db.insert(TABLE_TASK,null,cv8)
        //CreditUP
        val cv9 = ContentValues()
        cv9.put(COL_FULL_INFO,"Моментальные решения по выдаче кредита\n" +
                "Удобная онлайн заявка\n" +
                "Рассчитайте Ваш кредит в калькуляторе\n")
        cv9.put(COL_URL,"https://pxl.leads.su/click/791b818a3813275dff08da13d39154a3")
        cv9.put(COL_IMAGE,R.drawable.credit_up)
        cv9.put(COL_SHORT_INFO,"\n" +
                "от 200 до 7000 грн есть интересные акции")
        db.insert(TABLE_TASK,null,cv9)
        //СreditKasa
        val cv10 = ContentValues()
        cv10.put(COL_FULL_INFO,"Ставка 0.01% новым клиентам\n" +
                "Удобное получение кредита\n" +
                "Одобрение в течении 5 минут\n")
        cv10.put(COL_URL,"https://pxl.leads.su/click/15dd566637d1ae61a43cb37cd2c92503")
        cv10.put(COL_IMAGE,R.drawable.credit_kasa)
        cv10.put(COL_SHORT_INFO,"\n" +
                "от 500 до 20000 грн интересные условия")
        db.insert(TABLE_TASK,null,cv10)
        //CreditPlus
        val cv11 = ContentValues()
        cv11.put(COL_FULL_INFO,"Получите до 10.000 грн. под 0.01% на карту\n" +
                "Получите деньги с любой кредитной историей\n" +
                "Персональные скидки постоянным клиентам\n")
        cv11.put(COL_URL,"https://pxl.leads.su/click/c144f7f62a3c48c317b4660d4e28d17a")
        cv11.put(COL_IMAGE,R.drawable.credit_plus)
        cv11.put(COL_SHORT_INFO,"\n" +
                "от 500 до 10000 грн первый заем бесплатно")
        db.insert(TABLE_TASK,null,cv11)
        //Ваша Готiвочка Украина
        val cv12 = ContentValues()
        cv12.put(COL_FULL_INFO,"Быстрая регистрация онлайн\n" +
                "Выдача денег на карту в течении 10 минут\n")
        cv12.put(COL_URL,"https://pxl.leads.su/click/353e5aa5deaf6c84c34b73879ef9d09d")
        cv12.put(COL_IMAGE,R.drawable.vasha_gotivichka_plus)
        cv12.put(COL_SHORT_INFO,"\n" +
                "от 300 до 10000 грн первый заем бесплатно")
        db.insert(TABLE_TASK,null,cv12)
        //Globalcredit Украина
        val cv13 = ContentValues()
        cv13.put(COL_FULL_INFO,"Оформите до 15.000 грн. под 0.01%\n" +
                "Программа лояльности для постоянных клиентов\n")
        cv13.put(COL_URL,"https://pxl.leads.su/click/a8cd2922e39ee8cc64cd69037f694a86")
        cv13.put(COL_IMAGE,R.drawable.global_credit)
        cv13.put(COL_SHORT_INFO,"\n" +
                "от 500 до 20000 грн интересные условия")
        db.insert(TABLE_TASK,null,cv13)
        //БЫСТРОЗАЙМ UA
        val cv14 = ContentValues()
        cv14.put(COL_FULL_INFO,"Оформите до 15.000 грн. под 0.01%\n" +
                "Скидка 100% новым клиентам\n" +
                "Ежемесячные бонусы и акции\n")
        cv14.put(COL_URL,"https://pxl.leads.su/click/8663a24062d9d58eba2928011160f203")
        cv14.put(COL_IMAGE,R.drawable.bistro_zaim)
        cv14.put(COL_SHORT_INFO,"До 8000 гривен. Просто и быстро\n")
        db.insert(TABLE_TASK,null,cv14)
        //SOSCREDIT
        val cv15 = ContentValues()
        cv15.put(COL_FULL_INFO,"Оформление заявки за 10 минут\n" +
                "Мгновенное получение денег \n" +
                "Никаких очередей\n")
        cv15.put(COL_URL,"https://pxl.leads.su/click/b00722aaea731962aa02a68236c8a200")
        cv15.put(COL_IMAGE,R.drawable.sos_credit)
        cv15.put(COL_SHORT_INFO,"\n" +
                "От 1000 - 10000 гривен. Деньги через 10 минут")
        db.insert(TABLE_TASK,null,cv15)
        //e-cash
        val cv16 = ContentValues()
        cv16.put(COL_FULL_INFO,"Получите до 8.000 грн.\n" +
                "Подберите удобный график выплат\n" +
                "От Вас потребуется только паспорт\n")
        cv16.put(COL_URL,"https://pxl.leads.su/click/232dcd14772d53e4360e9b732fab9161")
        cv16.put(COL_IMAGE,R.drawable.e_cash)
        cv16.put(COL_SHORT_INFO,"\n" +
                "От 500 - 10000 гривен на вашей карте за 15 минут. ")
        db.insert(TABLE_TASK,null,cv16)
        //MoneyBoom
        val cv17 = ContentValues()
        cv17.put(COL_FULL_INFO,"Особые условия новым клиентам\n" +
                "Поступление денег на карту\n" +
                "Одобрение в течении 5 минут\n")
        cv17.put(COL_URL,"https://pxl.leads.su/click/b2dc76b0884a5ae6ab877cdd068c6bb5")
        cv17.put(COL_IMAGE,R.drawable.money_boom)
        cv17.put(COL_SHORT_INFO,"От 500 - 15000 гривен. Бесплатное досрочное погашение\n")
        db.insert(TABLE_TASK,null,cv17)
        //Unex Bank
        val cv18 = ContentValues()
        cv18.put(COL_FULL_INFO,"Оформите кредит до 75.000 грн.\n" +
                "Льготный период выплат\n")
        cv18.put(COL_URL,"https://pxl.leads.su/click/2c9daab6c76d872282f016d96775eb74")
        cv18.put(COL_IMAGE,R.drawable.unex_bank)
        cv18.put(COL_SHORT_INFO,"От 500 - 9000 гривен. Оформление за 15 минут \n")
        db.insert(TABLE_TASK,null,cv18)
        //MisterCash
        val cv19 = ContentValues()
        cv19.put(COL_FULL_INFO,"Оформите до 15.000 грн. под 0.01%\n" +
                "Прозрачная ставка по кредитам\n" +
                "Особые условия новым клиентам\n")
        cv19.put(COL_URL,"https://pxl.leads.su/click/0e6dfc393dd68c61d28c47c702f3d1a4")
        cv19.put(COL_IMAGE,R.drawable.mister_cash)
        cv19.put(COL_SHORT_INFO,"\n" +
                "От 500 - 20000 гривен. Выгодные условия. До 2% в день. 30% скидка на займ")
        db.insert(TABLE_TASK,null,cv19)
        //Forza Credit
        val cv20 = ContentValues()
        cv20.put(COL_FULL_INFO,"Оформление до 12.000 грн.\n" +
                "Одобрение за 5 минут\n" +
                "Деньги поступают на карту без задержек\t\t")
        cv20.put(COL_URL,"https://pxl.leads.su/click/3776ca125ed822c88cab8d2aa0f45717")
        cv20.put(COL_IMAGE,R.drawable.forza_credit)
        cv20.put(COL_SHORT_INFO,"\n" +
                "От 250 - 15000 гривен всего за 7 минут. Регулярные акции. От 1% в день")
        db.insert(TABLE_TASK,null,cv20)
        //My Wallet
        val cv21 = ContentValues()
        cv21.put(COL_FULL_INFO,"До 5000 грн. на свою банковскую карту\n" +
                "ОФормление за 5 минут\n" +
                "Повторные кредиты до 15.000 грн.\n")
        cv21.put(COL_URL,"https://pxl.leads.su/click/63a1ba4da86f7696467aa15c6b3e110b")
        cv21.put(COL_IMAGE,R.drawable.my_wallet)
        cv21.put(COL_SHORT_INFO,"От 500 - 1000 гривен. Рассрочка до 1 года\n")
        db.insert(TABLE_TASK,null,cv21)
        //Качай Грошi
        val cv22 = ContentValues()
        cv22.put(COL_FULL_INFO,"Оформите до 15.000 грн. под 0.01%\n" +
                "Особые условия для новых клиентов\n" +
                "Деньги поступают на  банковскую карту\n")
        cv22.put(COL_URL,"https://pxl.leads.su/click/e1f2c596f44f3d08d06f99ca1e138ce2")
        cv22.put(COL_IMAGE,R.drawable.kachai_groshi)
        cv22.put(COL_SHORT_INFO,"От 200 - 2000 гривен. Получение за 15 минут. Займ от 1.3% в день")
        db.insert(TABLE_TASK,null,cv22)
        //Mazilla
        val cv23 = ContentValues()
        cv23.put(COL_FULL_INFO,"Оформление кредита не более 10 минут\n" +
                "Персональные предложения каждому клиенту\n" +
                "Кредит сроком до 91 дня\n")
        cv23.put(COL_URL,"https://pxl.leads.su/click/51bd23fdd96dbb669e77931c2f7d5c95")
        cv23.put(COL_IMAGE,R.drawable.mazilla)
        cv23.put(COL_SHORT_INFO,"От 500 - 7000 гривен. До одного месяца\n")
        db.insert(TABLE_TASK,null,cv23)
        //ФКС
        val cv24 = ContentValues()
        cv24.put(COL_FULL_INFO,"Оформите до 15.000 грн. под 0.01%\n" +
                "Удобная онлайн заявка\n" +
                "Прозрачная ставка по кредиту\n")
        cv24.put(COL_URL,"https://pxl.leads.su/click/73c54e2b81412f0be9aea7f5b8730dcb")
        cv24.put(COL_IMAGE,R.drawable.fks)
        cv24.put(COL_SHORT_INFO,"от 1000 до 15000 грн - постоянные скидки\n")
        db.insert(TABLE_TASK,null,cv24)
        //Credilo
        val cv25 = ContentValues()
        cv25.put(COL_FULL_INFO,"Регистрация заявки за 5 минут\n" +
                "Персональные предложения каждому\n" +
                "Онлайн заявка на кредит\n")
        cv25.put(COL_URL,"https://pxl.leads.su/click/98b80b98fb377acf984b0fadf8ef93fe")
        cv25.put(COL_IMAGE,R.drawable.credilo)
        cv25.put(COL_SHORT_INFO,"от 500 до 25000 грн за 15 минут\n")
        db.insert(TABLE_TASK,null,cv25)
        //KLT Kredit
        val cv26 = ContentValues()
        cv26.put(COL_FULL_INFO,"Досрочное погашение кредита уменьшает проценты\n" +
                "Оформите отсрочку выплат\n" +
                "Без дополнительных комиссий\n")
        cv26.put(COL_URL,"https://pxl.leads.su/click/636d33571ac6b4de574778f5a5752f6a")
        cv26.put(COL_IMAGE,R.drawable.klt_credit)
        cv26.put(COL_SHORT_INFO,"от 500 до 5000 грн почти 0%\n")
        db.insert(TABLE_TASK,null,cv26)
        //UltraCash
        val cv27 = ContentValues()
        cv27.put(COL_FULL_INFO,"Персональные условия для каждого клиента\n" +
                "Решение за 5 минут\n" +
                "Получите деньги на карту\n")
        cv27.put(COL_URL,"https://pxl.leads.su/click/a1ca5dd247c7532999af6140d159fbae")
        cv27.put(COL_IMAGE,R.drawable.ultra_cash)
        cv27.put(COL_SHORT_INFO,"от 500 до 8000 грн на карту быстро\n")
        db.insert(TABLE_TASK,null,cv27)
        //Сashбери
        val cv28 = ContentValues()
        cv28.put(COL_FULL_INFO,"Кредит без справок о доходах\n" +
                "Автоматическая система выдачи\n" +
                "Особые условия постоянным клиентам\n")
        cv28.put(COL_URL,"https://pxl.leads.su/click/f691423775b6ca4b534cba7c8c43eded")
        cv28.put(COL_IMAGE,R.drawable.cash_bery)
        cv28.put(COL_SHORT_INFO,"от 500 до 7000 грн быстро и просто\n")
        db.insert(TABLE_TASK,null,cv28)
        //Bestcredit
        val cv29 = ContentValues()
        cv29.put(COL_FULL_INFO,"Получите кредит сроком до 91 дня\n" +
                "Моментальная обработка заявки \n" +
                "Выдача кредита в онлайн режиме\n")
        cv29.put(COL_URL,"https://pxl.leads.su/click/a4a0f200f80d2469b81305fb93fa1040")
        cv29.put(COL_IMAGE,R.drawable.best_credit)
        cv29.put(COL_SHORT_INFO,"От 500 - 15000 гривен. Бесплатное досрочное погашение\n")
        db.insert(TABLE_TASK,null,cv29)
        //Навсе
        val cv30 = ContentValues()
        cv30.put(COL_FULL_INFO,"Удобный график платежей\n" +
                "Неограниченное количество продлений\n" +
                "Кредит под 1%\n")
        cv30.put(COL_URL,"https://pxl.leads.su/click/edee5a69e7b58aeeeb61022a83772c35")
        cv30.put(COL_IMAGE,R.drawable.na_vse)
        cv30.put(COL_SHORT_INFO,"от 500 до 20000 грн интересные условия\n")
        db.insert(TABLE_TASK,null,cv30)
    }
    fun addCompanys(){
//        val db = writableDatabase
//        val cv = ContentValues()
//        cv.put(COL_FULL_INFO,"от 300 до 3500 грн получение за 8 минут.Ставка от 1% в день")
//        cv.put(COL_URL,"https://pxl.leads.su/click/ba501bc1a7b192633c22897f73066ae8")
//        cv.put(COL_IMAGE,R.drawable.money_veo)
//        cv.put(COL_SHORT_INFO,"от 300 до 3500 грн получение за 8 минут.Ставка от 1% в день")
//        db.insert(TABLE_TASK,null,cv)
//        val cv1 = ContentValues()
//        cv1.put(COL_FULL_INFO,"от 500 до 15000 грн получение за 20 минут. Займ 0%")
//        cv1.put(COL_URL,"\n" +
//                "https://pxl.leads.su/click/7793a619debc3470e1d12d60c02c1f70")
//        cv1.put(COL_IMAGE,R.drawable.my_credit)
//        cv1.put(COL_SHORT_INFO,"от 500 до 15000 грн получение за 20 минут. Займ 0%")
//        db.insert(TABLE_TASK,null,cv1)
//        val cv2 = ContentValues()
//        cv2.put(COL_FULL_INFO,"\n" +
//                "от 500 до 3500 грн первый кредит под 0,9%")
//        cv2.put(COL_URL,"\n" +
//                "https://pxl.leads.su/click/1615453e7948a044f07abb5e8215dc76")
//        cv2.put(COL_IMAGE,R.drawable.euro_groshi)
//        cv2.put(COL_SHORT_INFO,"\n" +
//                "от 500 до 3500 грн первый кредит под 0,9%")
//        db.insert(TABLE_TASK,null,cv2)
//        val cv3 = ContentValues()
//        cv3.put(COL_FULL_INFO,"")
//        cv3.put(COL_URL,"")
//        cv3.put(COL_IMAGE,)
//        cv3.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv3)
//        val cv4 = ContentValues()
//        cv4.put(COL_FULL_INFO,"")
//        cv4.put(COL_URL,"")
//        cv4.put(COL_IMAGE,)
//        cv4.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv4)
//        val cv5 = ContentValues()
//        cv5.put(COL_FULL_INFO,"")
//        cv5.put(COL_URL,"")
//        cv5.put(COL_IMAGE,)
//        cv5.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv5)
//        val cv6 = ContentValues()
//        cv6.put(COL_FULL_INFO,"")
//        cv6.put(COL_URL,"")
//        cv6.put(COL_IMAGE,)
//        cv6.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv6)
//        val cv7 = ContentValues()
//        cv7.put(COL_FULL_INFO,"")
//        cv7.put(COL_URL,"")
//        cv7.put(COL_IMAGE,)
//        cv7.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv7)
//        val cv8 = ContentValues()
//        cv8.put(COL_FULL_INFO,"")
//        cv8.put(COL_URL,"")
//        cv8.put(COL_IMAGE,)
//        cv8.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv8)
//        val cv9 = ContentValues()
//        cv9.put(COL_FULL_INFO,"")
//        cv9.put(COL_URL,"")
//        cv9.put(COL_IMAGE,)
//        cv9.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv9)
//        val cv10 = ContentValues()
//        cv10.put(COL_FULL_INFO,"")
//        cv10.put(COL_URL,"")
//        cv10.put(COL_IMAGE,)
//        cv10.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv10)
//        val cv11 = ContentValues()
//        cv11.put(COL_FULL_INFO,"")
//        cv11.put(COL_URL,"")
//        cv11.put(COL_IMAGE,)
//        cv11.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv11)
//        val cv12 = ContentValues()
//        cv12.put(COL_FULL_INFO,"")
//        cv12.put(COL_URL,"")
//        cv12.put(COL_IMAGE,)
//        cv12.put(COL_SHORT_INFO,"")
//        db12.insert(TABLE_TASK,null,cv12)
//        val cv13 = ContentValues()
//        cv13.put(COL_FULL_INFO,"")
//        cv13.put(COL_URL,"")
//        cv13.put(COL_IMAGE,)
//        cv13.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv13)
//        val cv14 = ContentValues()
//        cv14.put(COL_FULL_INFO,"")
//        cv14.put(COL_URL,"")
//        cv14.put(COL_IMAGE,)
//        cv14.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv14)
//        val cv15 = ContentValues()
//        cv15.put(COL_FULL_INFO,"")
//        cv15.put(COL_URL,"")
//        cv15.put(COL_IMAGE,)
//        cv15.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv15)
//        val cv16 = ContentValues()
//        cv16.put(COL_FULL_INFO,"")
//        cv16.put(COL_URL,"")
//        cv16.put(COL_IMAGE,)
//        cv16.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv16)
//        val cv17 = ContentValues()
//        cv17.put(COL_FULL_INFO,"")
//        cv17.put(COL_URL,"")
//        cv17.put(COL_IMAGE,)
//        cv17.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv17)
//        val cv18 = ContentValues()
//        cv18.put(COL_FULL_INFO,"")
//        cv18.put(COL_URL,"")
//        cv18.put(COL_IMAGE,)
//        cv18.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv18)
//        val cv19 = ContentValues()
//        cv19.put(COL_FULL_INFO,"")
//        cv19.put(COL_URL,"")
//        cv19.put(COL_IMAGE,)
//        cv19.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv19)
//        val cv20 = ContentValues()
//        cv20.put(COL_FULL_INFO,"")
//        cv20.put(COL_URL,"")
//        cv20.put(COL_IMAGE,)
//        cv20.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv20)
//        val cv21 = ContentValues()
//        cv21.put(COL_FULL_INFO,"")
//        cv21.put(COL_URL,"")
//        cv21.put(COL_IMAGE,)
//        cv21.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv21)
//        val cv22 = ContentValues()
//        cv22.put(COL_FULL_INFO,"")
//        cv22.put(COL_URL,"")
//        cv22.put(COL_IMAGE,)
//        cv22.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv22)
//        val cv23 = ContentValues()
//        cv3.put(COL_FULL_INFO,"")
//        cv3.put(COL_URL,"")
//        cv3.put(COL_IMAGE,)
//        cv3.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv3)
//        val cv24 = ContentValues()
//        cv24.put(COL_FULL_INFO,"")
//        cv24.put(COL_URL,"")
//        cv24.put(COL_IMAGE,)
//        cv24.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv24)
//        val cv25 = ContentValues()
//        cv25.put(COL_FULL_INFO,"")
//        cv25.put(COL_URL,"")
//        cv25.put(COL_IMAGE,)
//        cv25.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv25)
//        val cv26 = ContentValues()
//        cv26.put(COL_FULL_INFO,"")
//        cv26.put(COL_URL,"")
//        cv26.put(COL_IMAGE,)
//        cv26.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv26)
//        val cv27 = ContentValues()
//        cv27.put(COL_FULL_INFO,"")
//        cv27.put(COL_URL,"")
//        cv27.put(COL_IMAGE,)
//        cv27.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv27)
//        val cv28 = ContentValues()
//        cv28.put(COL_FULL_INFO,"")
//        cv28.put(COL_URL,"")
//        cv28.put(COL_IMAGE,)
//        cv28.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv28)
//        val cv29 = ContentValues()
//        cv29.put(COL_FULL_INFO,"")
//        cv29.put(COL_URL,"")
//        cv29.put(COL_IMAGE,)
//        cv29.put(COL_SHORT_INFO,"")
//        db.insert(TABLE_TASK,null,cv29)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
    //получение задч
    fun getCompanys():MutableList<Company>{
        var result:MutableList<Company> = ArrayList()
        val db = readableDatabase
        val queryResult = db.rawQuery("SELECT * from $TABLE_TASK",null)
        if(queryResult.moveToFirst()){
            do{
                val company = Company()
                company.id = queryResult.getLong(queryResult.getColumnIndex(COL_ID))
                company.full_info = queryResult.getString(queryResult.getColumnIndex(COL_FULL_INFO))
                company.short_info = queryResult.getString(queryResult.getColumnIndex(COL_SHORT_INFO))
                company.image = queryResult.getInt(queryResult.getColumnIndex(COL_IMAGE))
                company.url = queryResult.getString(queryResult.getColumnIndex(COL_URL))
                result.add(company)
            }while (queryResult.moveToNext())
        }
        queryResult.close()
        return  result
    }
}