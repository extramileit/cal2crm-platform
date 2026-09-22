package com.cal2crm.canonical.api;

import java.time.Instant;
import java.util.Optional;

public interface CanonicalEvent {
    String getId();
    String getSubject();
    Instant getStartTime();
    Instant getEndTime();
    Optional<String> getLocation();
    Optional<String> getDescription();
    Optional<String> getOrganizerId();  // Canonical Contact ID
}
