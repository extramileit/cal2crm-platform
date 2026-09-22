package com.cal2crm.storage.api;

import com.cal2crm.unified.api.UnifiedEvent;

import java.util.Optional;

public interface UnifiedEventStore {
    void save(UnifiedEvent event);
    Optional<UnifiedEvent> findByUnifiedEventId(String id);
    void delete(String id);
}

