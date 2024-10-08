package com.pobaby.support

import java.util.Calendar

object CalendarUtils {
    /**
     * 根据指定的年份和月份获取格式化的年月字符串
     *
     * 该函数通过使用Java的Calendar类来设置和获取指定的年份和月份，
     * 然后返回一个格式化的字符串，表示该年份和月份。
     *
     * @param year Int: 指定的年份
     * @param month Int: 指定的月份（注意：月份是从0开始计数的，所以需要+1）
     * @return String: 格式化的年月字符串，例如"2023年10月"
     */
    fun getFormatYearMonth(year: Int, month: Int): String {
        Calendar.getInstance().apply {
            set(Calendar.YEAR, year)
            set(Calendar.MONTH, month)
            return "${get(Calendar.YEAR)}年${get(Calendar.MONTH) + 1}月"
        }
    }
}