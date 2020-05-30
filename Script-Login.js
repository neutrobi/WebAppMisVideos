$(document).ready( 
    
    setTimeout(function(){
    
    $('.content-form').css("opacity", "1");
    }, 100)
)

//Email

$('#email').on('focus', function(){
    
    $('.lbl-email').css("margin-top", "-15px");
    $('.lbl-email').css("font-size", "14px");
})

$('#email').on('focusout', function(){
    
    if($('#email').val().length < 1){
        
        $('.lbl-email').css("margin-top", "10px");
        $('.lbl-email').css("font-size", "20px");
    }else{
        $('.lbl-email').css("margin-top", "-17px");
    $('.lbl-email').css("font-size", "14px");
    }
})

//Contraseña

$('#password').on('focus', function(){
    
    $('.lbl-password').css("margin-top", "15px");
    $('.lbl-password').css("font-size", "14px");
})

$('#password').on('focusout', function(){
    
    if($('#password').val().length < 1){
        
        $('.lbl-password').css("margin-top", "30px");
        $('.lbl-password').css("font-size", "20px");
    }else{
        $('.lbl-password').css("margin-top", "13px");
    $('.lbl-password').css("font-size", "14px");
    }
})


