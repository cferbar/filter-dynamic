package net.filter.dynamic.domain

/**
 * Created by sfhynx on 28/8/16.
 */
class QueryElement {

    String field
    String model
    Map<String, String> restrictions

    boolean equals(final Object o) {
        if (null == o) return false
        if (o instanceof QueryElement) {
            QueryElement e = (QueryElement) o
            return ((this.field == e.field) && (this.model == e.model))
        }
        return false
    }
}
