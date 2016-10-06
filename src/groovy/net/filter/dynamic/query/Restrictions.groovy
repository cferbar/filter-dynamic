package net.filter.dynamic.query

/**
 * Created by sfhynx on 28/8/16.
 */
class Restrictions {

    static Map<String, String> constraints(Class tipo) {
        switch (tipo) {
            case (String.class):
                return [eq:'igual',
                        distinct: 'distinto',
                        ilike: 'contiene',
                        like: 'contiene (sensible)']

            case int:
            case (Integer.class):
                return [eq: 'igual',
                        distinct: 'distinto',
                        gt: 'mayor',
                        lt: 'menor',
                        gte: 'mayor o igual',
                        lte: 'menor o igual']
            default:
                return [eq: 'igual',
                        distinct: 'distinto']

        }
    }
}
