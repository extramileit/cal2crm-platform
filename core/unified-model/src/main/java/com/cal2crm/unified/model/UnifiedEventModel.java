package com.cal2crm.unified.model;

import java.time.Instant;
import java.util.Map;
import com.cal2crm.unified.api.UnifiedEvent;

public record UnifiedEventModel(
        String unifiedEventId,
        String sourceEventId,
        String schedulerType,
        Instant startTime,
        Instant endTime,
//        UnifiedInviteeModel invitee,
//        UnifiedHostModel host,
        Map<String, Object> metadata
) implements UnifiedEvent {

    @Override
    public String getUnifiedEventId() {
        return unifiedEventId;
    }

    @Override
    public String getSourceEventId() {
        return sourceEventId;
    }

    @Override
    public String getSchedulerType() {
        return schedulerType;
    }

    @Override
    public Instant getStartTime() {
        return startTime;
    }

    @Override
    public Instant getEndTime() {
        return endTime;
    }

    @Override
    public Map<String, Object> getMetadata() {
        return metadata;
    }
}


