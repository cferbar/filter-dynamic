<div id="filter_${element.model}_${element.field}">
    <b>${label}</b>
    <g:select name="field_${element.model}_${element.field}" from="${element.restrictions}" optionKey="key" optionValue="value" />
    <input type="text" name="fieldValue_${element.model}_${element.field}" />
    <input type="button" onclick="removeRestriction('filter_${domain}_${property}')" value="Quitar"/>
</div>