package com.finance.financespringmodulith.notifications.repository;

import com.finance.financespringmodulith.notifications.domain.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}

