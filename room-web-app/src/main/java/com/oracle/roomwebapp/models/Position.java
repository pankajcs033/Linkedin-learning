package com.oracle.roomwebapp.models;

public enum Position {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    public String toString() {
        switch(this) {
            case CONCIERGE:
                return "Concierge";
            case FRONT_DESK:
                return "Front Desk";
            case SECURITY:
                return "Security";
            case HOUSEKEEPING:
                return "HouseKeeping";
            
        }
        return "";
    }
}
