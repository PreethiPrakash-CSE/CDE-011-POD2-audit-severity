package com.cognizant.auditSeverity.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="audit-checklist-service" , url = "${CHECKLIST.URL}")
public interface AuditChecklistClient {

}
