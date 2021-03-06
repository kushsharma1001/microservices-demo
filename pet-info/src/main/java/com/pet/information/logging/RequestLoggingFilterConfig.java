package com.pet.information.logging;

import org.springframework.web.filter.CommonsRequestLoggingFilter;

/**
 * @author Amol Limaye
 **/
//@Configuration
public class RequestLoggingFilterConfig {

//    @Bean
    public CommonsRequestLoggingFilter logFilter() {
        CommonsRequestLoggingFilter filter
                = new CommonsRequestLoggingFilter();
        filter.setIncludeQueryString(true);
        filter.setIncludePayload(true);
        filter.setMaxPayloadLength(10000);
        filter.setIncludeHeaders(false);
        filter.setAfterMessagePrefix("REQUEST DATA : ");
        return filter;
    }
}
