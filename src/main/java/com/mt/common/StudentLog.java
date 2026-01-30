package com.mt.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface StudentLog {

    Logger log = LoggerFactory.getLogger(StudentLog.class);

    default void logInfo(String message) {
        if (isNotNull(message)) {
            log.info(message);
        }
    }

    default void logWarn(String message) {
        if (isNotNull(message)) {
            log.warn(message);
        }
    }

    default void logErr(String message) {
        if (isNotNull(message)) {
            log.error(message);
        }
    }

    /*~
     * We can also define private methods inside interfaces
     * */
    private static boolean isNotNull(String message) {
        log.info("Message null-check");
        return message != null && !message.isEmpty();
    }
}
