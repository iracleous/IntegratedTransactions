function addCustomer(){


    var	actionMethod = "POST";
    var	actionUrl = "http://localhost:3000/insertPerson";

    sendData = {"name":$('#name').val(),
                    "email":$('#email').val(),
                    "dateOfBirth":$('#dateOfBirth').val()
                    };



    $.ajax({
            beforeSend: function (xhr) {
            },
            url: actionUrl,
            dataType: 'json',
            type: actionMethod,
            contentType: 'application/json',
            data: JSON.stringify( sendData ),
            processData: false,
            success: function( data, textStatus, jQxhr ){
            $("#updateMessage").html(JSON.stringify( data ));

            },
            error: function( jqXhr, textStatus, errorThrown ){
                console.log( "errorThrown" );
            }
        });
}
