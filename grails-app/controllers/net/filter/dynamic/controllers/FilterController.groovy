package net.filter.dynamic.controllers

import net.filter.dynamic.domain.QueryElement
import net.filter.dynamic.services.FilterService

class FilterController {

    FilterService filterService

    def addRestriction(String domain, String property, String label) {
        QueryElement queryElement = filterService.addCondition(property, domain)
        render plugin: "filter-dynamic", template:"/templates/find/restriction", model:[element:queryElement,
                                                                                        label: label]
    }

}
