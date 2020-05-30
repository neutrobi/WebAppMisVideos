$(document).ready( 
    
    setTimeout(function(){
    
    $('.content-form').css("opacity", "1");
    }, 100)
)
//Nombre

$('#nombre').on('focus', function(){
    
    $('.lbl-nombre').css("margin-top", "-15px");
    $('.lbl-nombre').css("font-size", "14px");
})

$('#nombre').on('focusout', function(){
    
    if($('#nombre').val().length < 1){
        
        $('.lbl-nombre').css("margin-top", "10px");
        $('.lbl-nombre').css("font-size", "20px");
    }else{
        $('.lbl-nombre').css("margin-top", "-17px");
    $('.lbl-nombre').css("font-size", "14px");
    }
})

//Apellidos

$('#apellidos').on('focus', function(){
    
    $('.lbl-apellidos').css("margin-top", "5px");
    $('.lbl-apellidos').css("font-size", "14px");
})

$('#apellidos').on('focusout', function(){
    
    if($('#apellidos').val().length < 1){
        
        $('.lbl-apellidos').css("margin-top", "30px");
        $('.lbl-apellidos').css("font-size", "20px");
    }else{
        $('.lbl-apellidos').css("margin-top", "7px");
    $('.lbl-apellidos').css("font-size", "14px");
    }
})

//Email

$('#email').on('focus', function(){
    
    $('.lbl-email').css("margin-top", "5px");
    $('.lbl-email').css("font-size", "14px");
})

$('#email').on('focusout', function(){
    
    if($('#email').val().length < 1){
        
        $('.lbl-email').css("margin-top", "30px");
        $('.lbl-email').css("font-size", "20px");
    }else{
        $('.lbl-email').css("margin-top", "7px");
    $('.lbl-email').css("font-size", "14px");
    }
})

//Contraseña

$('#password').on('focus', function(){
    
    $('.lbl-password').css("margin-top", "5px");
    $('.lbl-password').css("font-size", "14px");
})

$('#password').on('focusout', function(){
    
    if($('#password').val().length < 1){
        
        $('.lbl-password').css("margin-top", "30px");
        $('.lbl-password').css("font-size", "20px");
    }else{
        $('.lbl-password').css("margin-top", "7px");
    $('.lbl-password').css("font-size", "14px");
    }
})

//Confirmar Contraseña

$('#ConfirmPass').on('focus', function(){
    
    $('.lbl-ConfirmPass').css("margin-top", "5px");
    $('.lbl-ConfirmPass').css("font-size", "14px");
})

$('#ConfirmPass').on('focusout', function(){
    
    if($('#ConfirmPass').val().length < 1){
        
        $('.lbl-ConfirmPass').css("margin-top", "30px");
        $('.lbl-ConfirmPass').css("font-size", "20px");
    }else{
        $('.lbl-ConfirmPass').css("margin-top", "7px");
    $('.lbl-ConfirmPass').css("font-size", "14px");
    }
})


