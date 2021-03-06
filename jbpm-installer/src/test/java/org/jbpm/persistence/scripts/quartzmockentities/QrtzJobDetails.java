/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.persistence.scripts.quartzmockentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Lob;

import org.hibernate.annotations.Type;

@Entity(name = "QRTZ_JOB_DETAILS")
@IdClass(QrtzJobDetailsId.class)
public class QrtzJobDetails {

    @Id
    @Column(name = "SCHED_NAME")
    private String schedulerName;

    @Id
    @Column(name = "JOB_NAME")
    private String jobName;

    @Id
    @Column(name = "JOB_GROUP")
    private String jobGroup;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "JOB_CLASS_NAME")
    private String jobClassName;

    @Column(name = "IS_DURABLE")
    private Boolean isDurable;

    @Column(name = "IS_NONCONCURRENT")
    private Boolean isNonConcurent;

    @Column(name = "IS_UPDATE_DATA")
    private Boolean isUpdateDataBoolean;

    @Column(name = "REQUESTS_RECOVERY")
    private Boolean requestsRecovery;

    @Lob
    @Column(name = "JOB_DATA")
    private byte[] jobData;
}
