$(document).ready(function(){
    
    console.log("CAI v2");
    
    
    $('#frmIps').submit(function () {
        
        $.ajax({
            type: 'POST',
            url: 'Ips',
            data: $(this).serialize(),
            success: function (data) {
                $("#res").html(data);
            },
            error: function () {
                console.log("Error ");
            }
        });
        return false;
    });
    
    $("#caiM1").click(function(){
        //alert("IPS");
        
        $('#frmIps').submit();
    });
    
});


