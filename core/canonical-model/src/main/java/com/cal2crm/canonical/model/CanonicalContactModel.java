package com.cal2crm.canonical.model;

import com.cal2crm.canonical.api.CanonicalContact;

import java.time.Instant;
import java.util.Optional;

public record CanonicalContactModel(
        String id,
        String firstName,
        String lastName,
        Optional<String> email,
        Optional<String> phone,
        Instant createdAt,
        Instant updatedAt
) implements CanonicalContact {
    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public Optional<String> getEmail() {
        return email;
    }

    @Override
    public Optional<String> getPhone() {
        return phone;
    }

    @Override
    public Instant getCreatedAt() {
        return createdAt;
    }

    @Override
    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
