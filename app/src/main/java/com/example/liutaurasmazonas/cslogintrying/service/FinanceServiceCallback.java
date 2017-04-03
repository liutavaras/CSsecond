package com.example.liutaurasmazonas.cslogintrying.service;

import com.example.liutaurasmazonas.cslogintrying.data.Quote;

/**
 * Created by Liutauras Mazonas on 3/26/2017.
 */

public interface FinanceServiceCallback {
    void serviceSuccess(Quote quote);
    void serviceFailure(Exception exception);
}
