package net.filter.dynamic.services

import grails.transaction.Transactional
import net.filter.dynamic.domain.QueryElement
import net.filter.dynamic.utils.ClassUtils

@Transactional
class FilterService {

    //static scope = 'session'

    Set<QueryElement> query = []

    QueryElement addCondition(String field, String model) {
        QueryElement queryElement = new QueryElement(field: field, restrictions: ClassUtils.resolveRestrictions(model, field), model: model)
        query << queryElement

        return queryElement
    }

}
