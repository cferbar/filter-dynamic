package net.filter.dynamic.query

/**
 * Created by sfhynx on 28/8/16.
 */
enum ConditionType {

    SIMPLE('Simple'),
    ASSOCIATION('Association')

    String description

    ConditionType (String description) {
        this.description = description
    }

}