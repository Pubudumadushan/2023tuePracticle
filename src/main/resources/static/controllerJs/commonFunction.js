//define function for ajax Get Request

const ajaxGetRequest = (url)=>{

    let serviceResponce;

    $.ajax(url,{
        async:false,
        type:"GET",
        contentType:'json',
        success:function(data){

            console.log("Success"+data);
            serviceResponce = data;


        },
        error:function(resOb){
            console.log("error"+resOb);
            serviceResponce =[];
        }
    });

   return serviceResponce;
}