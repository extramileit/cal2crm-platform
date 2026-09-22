package com.cal2crm.canonical.api;

import java.time.Instant;
import java.util.Optional;

public interface CanonicalLead {
    String getId();                     // Canonical ID (CRM-owned)
    String getFirstName();
    String getLastName();
    Optional<String> getEmail();
    Optional<String> getPhone();
    Optional<String> getCompany();
    Instant getCreatedAt();
    Instant getUpdatedAt();
}