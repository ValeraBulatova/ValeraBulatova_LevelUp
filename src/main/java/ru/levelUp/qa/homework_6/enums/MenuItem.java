package ru.levelUp.qa.homework_6.enums;

public enum MenuItem {

    LOGIN_PAGE("MantisBT"),
    HOME_PAGE("My View - MantisBT"),
    VIEW_ISSUES_PAGE("View Issues - MantisBT"),
    REPORT_ISSUE_PAGE("Select Project - MantisBT"),
    CHANGE_LOG_PAGE("Change Log - MantisBT"),
    ROAD_MAP_PAGE("Roadmap - MantisBT"),
    SUMMARY_PAGE("Summary - MantisBT"),
    MANAGE_PAGE("Manage - MantisBT"),
    MANAGE_USERS_PAGE("Manage Users - MantisBT");

    private String value;

    MenuItem(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
