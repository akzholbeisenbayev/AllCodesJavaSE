package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String operationType;
    ArrayList<Student> students = new ArrayList<>();

    public PackageData(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) throws Exception
    {
        if(operationType == null)
        {
            throw new Exception("Operation type can't be empty!");
        }
        this.operationType = operationType;

    }
}
