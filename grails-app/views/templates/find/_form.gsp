<div id="filter-zone">
    <label><g:message code="filter.dynamic.restriction.add" default="Add" /></label>
    <g:select name="filter_restrictions" id="filter_restrictions" from="${persistentProperties}" optionKey="name" optionValue="naturalName"/>
    <input type="button" id="btnAddRestriction" onclick="addRestriction('${domain}')" data-url="${createLink(plugin:'filter-dynamic', controller: 'filter', action:'addRestriction')}" value="Añadir"/>
    <form id="restrictions" name="restrictions" />
</div>