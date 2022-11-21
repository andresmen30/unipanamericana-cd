package com.unipanamericana.util;

import com.unipanamericana.response.ErrorResponse;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;

public class ResponseUtil {

    public static ResponseEntity result(final String message, final HttpStatus httpStatus, final String... details) {
        return new ResponseEntity(ErrorResponse.error(httpStatus.value(), message,
                ArrayUtils.isEmpty(details) ? null : Arrays.asList(details)), httpStatus);
    }


    public static ResponseEntity result(final Object object, HttpStatus httpStatus) {
        return new ResponseEntity(object, httpStatus);
    }
}
