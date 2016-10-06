package net.filter.dynamic.utils

import grails.util.Holders
import net.filter.dynamic.query.Restrictions
import org.codehaus.groovy.grails.commons.DefaultGrailsDomainClass
import org.codehaus.groovy.grails.commons.GrailsDomainClassProperty

/**
 * Created by sfhynx on 28/8/16.
 */
class ClassUtils {

    static DefaultGrailsDomainClass getDomainClass(String className) {
        return Holders.grailsApplication.getDomainClass(className)
    }

    static GrailsDomainClassProperty getPersistentProperty(String domainClassName, String property) {
        return getDomainClass(domainClassName)?.getPersistentProperty(property)
    }

    static Map<String, String> resolveRestrictions(String domainClassName, String property) {
        return Restrictions.constraints(getPersistentProperty(domainClassName, property)?.type)
    }

    static boolean isAssociationProperty(String domainClassName, String propertyName) {
        return getPersistentProperty(domainClassName, propertyName)?.association
    }
}
