package com.cal2crm.canonical.api;

import java.time.Instant;
import java.util.Optional;

public interface CanonicalContact {
    String getId();
    String getFirstName();
    String getLastName();
    Optional<String> getEmail();
    Optional<String> getPhone();
    Instant getCreatedAt();
    Instant getUpdatedAt();
}
