package com.cal2crm.unified.api;

import java.time.Instant;
import java.util.Map;

public interface UnifiedEvent {
    String getUnifiedEventId();
    String getSourceEventId();
    String getSchedulerType(); // calendly, msbookings, custom
    Instant getStartTime();
    Instant getEndTime();
//    UnifiedInvitee getInvitee();
//    UnifiedHost getHost();
    Map<String, Object> getMetadata();
}
