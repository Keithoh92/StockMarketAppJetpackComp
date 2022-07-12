package com.plcoding.stockmarketapp.data.csv

import com.plcoding.stockmarketapp.domain.model.CompanyListing
import java.io.InputStream

interface CSVParser<T> {
    suspend fun parse(stream: InputStream): List<T>
}