package com.plcoding.stockmarketapp.data.csv

import java.io.InputStream

/**
 * This interface converts CSV format to a data class of type <T>
 */

interface CSVParser<T> {
    suspend fun parse(stream: InputStream): List<T>
}