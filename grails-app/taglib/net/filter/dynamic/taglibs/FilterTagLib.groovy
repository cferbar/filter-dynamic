package net.filter.dynamic.taglibs

import net.filter.dynamic.utils.ClassUtils
import org.codehaus.groovy.grails.commons.DefaultGrailsDomainClass

class FilterTagLib {
    //static defaultEncodeAs = [taglib:'html']
    static namespace = "filter"

    def imports = {
        out << javascript(plugin: "filter-dynamic", src: "filter/filter-actions.js")
    }

    def form = { attrs ->
        DefaultGrailsDomainClass domainClass = ClassUtils.getDomainClass(attrs.domain as String)
        out << render(plugin: "filter-dynamic",
                      template: "/templates/find/form",
                      model: [persistentProperties: domainClass.getPersistentProperties(), name: attrs.name, domain: domainClass.fullName])
    }


}
