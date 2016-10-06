/**
 * Created by sfhynx on 28/8/16.
 */

function addRestriction(domain) {
    $.ajax({
        type: "GET",
        url: $("#btnAddRestriction").attr("data-url"),
        data: {domain: domain, property: $("#filter_restrictions").val(), label: $("#filter_restrictions option:selected").text()},
        success: function(msg) {
            $("#restrictions").append(msg)
        }
    })
}

function removeRestriction(id) {
    $("#" + id).remove()
}