package com.srp.goodexample;

import java.time.LocalDateTime;

public record AuditDetails(LocalDateTime createdAt,
                String propertyName,
                String oldValue,
                String newValue,
                String moduleName,
                Long modifieddBy) {

}
