package com.capiot.api.insurance.model;

import java.time.LocalDate;

public class ClaimDocument {

    private String docID;

    private String docName;

    private String fileName;

    private String filePath;

    private LocalDate createdDate;

    private boolean isSigned;

    private boolean isApproved;
}
